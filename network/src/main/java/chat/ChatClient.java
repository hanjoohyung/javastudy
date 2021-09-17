//package chat;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.io.OutputStreamWriter;
//import java.io.PrintWriter;
//import java.net.InetSocketAddress;
//import java.net.Socket;
//import java.util.Scanner;
//
//public class ChatClient {
//	private static final int PORT = 9999;
//	private static final String IP = "127.0.0.1";
//	
//	public static void main(String[] args) {
//		Socket socket = null;
//		Scanner scanner = null;
//		
//		try {
//			
//			socket = new Socket();
//			scanner = new Scanner(System.in);
//			
//			socket.connect(new InetSocketAddress(IP,PORT));
//			
//			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream(), "UTF-8"));
//			PrintWriter pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream(), "UTF-8"), true);
//		
//			while
//		
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		
//	}
//}