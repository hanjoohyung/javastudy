package chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChatServerThread extends Thread{
	private static final int PORT = 9999;
	private static final String IP = "127.0.0.1";
	List<Writer> listWriters = new ArrayList<Writer>();
	private String nickname;
	private Socket socket;
	
	@Override
	public void run() {
		ServerSocket serverSocket = null;
		Socket socket = null;
		List<Writer> listWriters;
	try {
		
		serverSocket = new ServerSocket();
		
		while(true) {
		socket = serverSocket.accept();
		new ChatServerThread(socket).start();
		}
		
		new ChatServerThread(socket, listWriters).start();
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream(), "UTF-8"));
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream(), "UTF-8"), true);
			
			System.out.print("닉네임을 정해주세요 >>");
			Scanner scanner = new Scanner(System.in);
			nickname = scanner.nextLine();
			printWriter.println(nickname + "님이 참여하셨습니다.");
			printWriter.flush();
			
			new ChatServerThread(socket, listWriters).start();
			
			while(true) {
				System.out.print(">>");
				String request = scanner.nextLine();
				String[] tokens = request.split(" : ");
				if("join".equals(tokens[0])) {
					doJoin(tokens[1],printWriter);
				} else if ("message".equals(tokens[0])) {
					doMessage(tokens[1]);
				} else if ("quit".equals(tokens[0])) {
					doQuit(printWriter);
				} else {
					ChatServer.log("error : 알수 없는 요청 ("+tokens[0]+")");
				}
				request = br.readLine();
				if (request == null) {
					ChatServer.log("클라이언트로부터 연결이 끊겼습니다.");
					doQuit(printWriter);
					break;
				} else {
					doMessage(message);
				}
			}
		} catch(IOException e) {
			ChatServer.log("error:" + e);
		} finally {
			try {
				if(socket != null && socket.isClosed() == false) {
					socket.close();
				}
			} catch(IOException e) {
				e.printStackTrace();
			}
			}	
		}
	}
	private void doQuit(Writer writer) {
		removeWriter(writer);
		
		String data = nickname + "님이 퇴장하셨습니다.";
		broadcast(data);
	}
	private void removeWriter(Writer writer) {
		removeWriter(writer);
		return;
	}
	private void doMessage(String message) {
		this.message = message;
		
		String data = nickname + " = " message;
		broadcast(data);
		
	}
	public ChatServerThread(Socket socket) {
		this.socket = socket;
	}
	public ChatServerThread(Socket socket, List<Writer> listWriters) {
		this.socket = socket;
		this.listWriters = listWriters;
	}
	public static void log(String log) {
		System.out.println(log);
	}
	private void doJoin(String nickname, Writer writer) {
		this.nickname = nickname;
		
		/* writer pool에 저장*/
		addWriter(writer);
		
		//ack
		printWriter.println("join : ok");
		printWriter.flush();
	}
	private void addWriter(Writer writer) {
		synchronized(listWriters) {
			listWriters.add(writer);
		}	
	}
	private void broadcast(String data) {
		
		synchronized (listWriters) {
			for(Writer writer : listWriters ) {
				PrintWriter printWriter = (PrintWriter)writer;
				printWriter.println(data);
				printWriter.flush();
			}
		}
	}
}	
	