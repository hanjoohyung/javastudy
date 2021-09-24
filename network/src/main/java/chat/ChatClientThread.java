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

public class ChatClientThread extends Thread {
	private List<Writer> listWriters = new ArrayList<Writer>();
	private Socket socket = null;
	
	public ChatClientThread(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {
		
		try {
			
		BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream(), "UTF-8"));
	
		while(true) {
			String request = br.readLine();
			if(request == null) {
				ChatServer.log("서버로 부터 연결이 끊겼습니다.");
				break;	
			}
			String[] tokens = request.split(":");
			if("message".equals(tokens[0])) {
				System.out.println(tokens[1]+":"+tokens[2]);
			}
			 else {
				ChatServer.log("에러 : 알수 없는 요청 (" + tokens[0] + ")");
			}
		}
		
		} catch(IOException e) {
			log(e.toString());
		}
	}
	public void log(String log) {
		System.out.println("[Echo Client] " + log);
	}
	
}
