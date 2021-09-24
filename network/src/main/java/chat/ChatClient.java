package chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChatClient {
	private static final String IP = "127.0.0.1";
	private static final int PORT = 9999;
	
	
	public static void main(String[] args) {
		 Scanner scanner = null;
		 Socket socket = null;
		 
		 
		 try {
			 scanner = new Scanner(System.in);
			 
			 socket = new Socket();
			 
			 socket.connect(new InetSocketAddress(IP,PORT));
			 
			 BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream(), "UTF-8"));
			 PrintWriter pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream(), "UTF-8"), true);
			 
			 System.out.print("닉네임 >>");
			 String nickName = scanner.nextLine();
			 pw.println("join:" + nickName);
			 String response = br.readLine();
			 if(response.equals("join:ok") == true) {
			 new ChatClientThread(socket).start();
			 }
			 while(true) {
				 System.out.print(">>");
				 String input = scanner.nextLine();
				 
				 if("quit".equals(input) == true) {
					 pw.println("quit:");
					 break;
				 } 
				 
				 pw.println("message:"+input);
			 }
		 }catch(IOException e) {
			 log(e.toString());
		 }
	}
	
	public static void log(String log) {
		System.out.println("[Echo Client] " + log);
	}
	
	}
