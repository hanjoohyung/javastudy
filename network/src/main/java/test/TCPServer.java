package test;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

	public static void main(String[] args) {
		ServerSocket serversocket = null;
		try {
			 // 1. 서버 소켓 생성
			serversocket = new ServerSocket();
			
			// 2. 바인딩(binding) 
			// Socket에 InetSocketAddress(IPAddress + port)
			// IPAddress : 0.0.0.0 - 모든 IP로 부터의 연결을 허용한다.
			serversocket.bind(new InetSocketAddress("0.0.0.0",5000));
			
			// 3. accept
			// 클라이언트로부터 연결 요청을 기다린다.
			Socket socket = serversocket.accept(); // blocking
			
			// 상대편의 IP주소를 가지고 옴
			InetSocketAddress inetRemoteSocketAddress = (InetSocketAddress)socket.getRemoteSocketAddress(); 
			String remoteHostAddress = inetRemoteSocketAddress.getAddress().getHostAddress();
			int remoteHostPort = inetRemoteSocketAddress.getPort();
			
			System.out.println("[server] connected by client[" + remoteHostAddress + ":" +  remoteHostPort + "]");
		} catch (IOException e) { 
			System.out.println("[server] error : " + e);
		} finally {
			try {
				if(serversocket != null && serversocket.isClosed() == false) { 
						serversocket.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
