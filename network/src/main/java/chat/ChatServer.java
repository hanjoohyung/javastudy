package chat;

import java.io.IOException;
import java.io.Writer;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChatServer {
	private static final int PORT = 9999;
	
	public static void main(String[] args) {
		ServerSocket serversocket = null;
		Scanner scanner = null;
		List<Writer> listWriters = new ArrayList<Writer>();
		
		try {
			scanner = new Scanner(System.in);

			serversocket = new ServerSocket();

			String hostAddress = InetAddress.getLocalHost().getHostAddress();
			serversocket.bind(new InetSocketAddress("0.0.0.0", PORT));
			ChatServer.log("연결 기다림" + hostAddress + ":" + PORT);

			while (true) {
				
				Socket socket = serversocket.accept(); //block
				
				new ChatServerThread(socket, listWriters).start();
			}
		} catch(IOException e){
			log(e.toString());
		}
	}
	

	public static void log(String log) {
		System.out.println("[Echo Client] " + log);
	}
}

