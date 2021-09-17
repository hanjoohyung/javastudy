//package chat;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.io.OutputStreamWriter;
//import java.io.PrintWriter;
//import java.io.Writer;
//import java.net.InetAddress;
//import java.net.InetSocketAddress;
//import java.net.ServerSocket;
//import java.net.Socket;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class ChatServer {
//	private static final int PORT = 9999;
//	private static final String IP = "127.0.0.1";
//	List<Writer> listWriters = new ArrayList<Writer>();
//	
//	public static void main(String[] args) {
//		ServerSocket serverSocket = null;
//		Socket socket = null;
//		List<Writer> listWriters;
//	try {
//		
//		serverSocket = new ServerSocket();
//		System.out.print("닉네임을 정해주세요 >>");
//		Scanner scanner = new Scanner(System.in);
//		String str = scanner.nextLine();
//		
//		String hostAddress = InetAddress.getLocalHost().getHostAddress();
//		serverSocket.bind(new InetSocketAddress(IP,PORT));
//		
//		while(true) {
//		socket = serverSocket.accept();
//		new ChatServerThread(socket).start();
//		}
//		
//		new ChatServerThread(socket, listWriters).start();
//		
//		InetSocketAddress inetRemoteSocketAddress = (InetSocketAddress)socket.getRemoteSocketAddress(); 
//		String remoteHostAddress = inetRemoteSocketAddress.getAddress().getHostAddress();
//		int remoteHostPort = inetRemoteSocketAddress.getPort();
//		log("connected by client[" + remoteHostAddress + ":" +  remoteHostPort + "]");
//		
//		try {
//			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream(), "UTF-8"));
//			PrintWriter pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream(), "UTF-8"), true);
//			
//			while(true) {
//				String data = br.readLine();
//				if(data == null) {
//					log("님의 연결이 끊겼습니다.");
//					break;
//				}
//				
//				log(data);
//				pw.println(data);
//			}
//		} catch(IOException e) {
//			log("error:" + e);
//		} finally {
//			try {
//				if(socket != null && socket.isClosed() == false) {
//					socket.close();
//				}
//			} catch(IOException e) {
//				e.printStackTrace();
//			}
//		}
//	} catch(IOException e) {
//		log("error: " + e);
//	} finally {
//		try {
//			if(serverSocket != null && serverSocket.isClosed() == false) {
//				serverSocket.close();
//			}
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
//}
//
//public static void log(String log) {
//	System.out.println(log);
//}
//}
//	
