package chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChatServerThread extends Thread{
	private String nickname;
	private Socket socket;
	private List<Writer> listWriters = new ArrayList<Writer>();
	private Scanner scanner = null;
	private BufferedReader br = null;
	private PrintWriter pw = null;
	
	public ChatServerThread(Socket socket, List<Writer> listWriters) {
		this.socket = socket;
		this.listWriters = listWriters;
	}
	
	@Override
	public void run() {
	
		
		
		try {
		
		br = new BufferedReader(new InputStreamReader(socket.getInputStream(), "UTF-8"));
		pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream(), "UTF-8"), true);
		
		while(true) {
			String request = br.readLine();
			
			if(request == null) {
				ChatServer.log("클라이언트로 부터 연결이 끊겼습니다.");
				doQuit(pw);
				break;	
			}
			System.out.println(request);
			String[] tokens = request.split(":");
			if("join".equals(tokens[0])) {
				System.out.println(tokens[0]);
				doJoin(tokens[1],pw);
				log(nickname+"님이 접속되었습니다.");
			} else if("message".equals(tokens[0])) {
				doMessage(tokens[1],pw);
			} else if("quit".equals(tokens[0])) {
				doQuit(pw);
			} else {
				ChatServer.log("에러 : 알수 없는 요청 (" + tokens[0] + ")");
			}
		}
		
		} catch(IOException e) {
			log(e.toString());
		}
	}

	
	//1. print remote socket address
	//2. create stream( from Basic Stream )
	//3. processing...
		
	private void doQuit(PrintWriter writer) {
		removeWriter(writer);
		
		String data = "message:" + nickname + "님이 퇴장하였습니다.";
		broadcast(data,writer);
	}
	private void removeWriter(PrintWriter writer) {
		synchronized(listWriters) {
			listWriters.remove(writer);
		}
	}
	private void doMessage(String message, Writer writer) {
		String data = "message:"+ nickname+ ":" + message;
		
		broadcast(data,writer);
		
	}
	private void doJoin(String nickName, Writer writer) {
		this.nickname = nickName;
		
		String data = "message" + nickName + "님이 참여하였습니다.";
		broadcast(data,writer);
		// writer pool에 저장
		
		addWriter(writer);
	
		pw.println("join:ok");
		
	}
	private void addWriter(Writer writer) {
		synchronized(listWriters) {
			listWriters.add(writer);
		}
	}
	private void broadcast (String data, Writer writer) {
		synchronized(listWriters) {
			for(Writer wirter : listWriters) {
				PrintWriter printWriter = (PrintWriter)writer;
				printWriter.println(data);
				printWriter.flush();
			}
		}
	}
	public static void log(String log) {
		System.out.println("[Echo Client] " + log);
	}
}	

	