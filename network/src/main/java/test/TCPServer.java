package test;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;

public class TCPServer {

	public static void main(String[] args) {
		ServerSocket serversocket = null;
		try {
			 // 1. 서버 소켓 생성
			serversocket = new ServerSocket();
			
			// 1.1 TIME_WAIT 상태에서도 소켓 포트 번호 할당이 가능하도록 하기 위한 코드
			serversocket.setReuseAddress(true);
			
			// 2. 바인딩(binding) 
			// Socket에 InetSocketAddress(IPAddress + port)
			// IPAddress : 0.0.0.0 - 특정 호스트 IP바인딩 하지 않는다.
			serversocket.bind(new InetSocketAddress("0.0.0.0",5000));
			
			// 3. accept
			// 클라이언트로부터 연결 요청을 기다린다.
			Socket socket = serversocket.accept(); // blocking
			
			// 상대편의 IP주소와 port번호를 가지고 옴
			InetSocketAddress inetRemoteSocketAddress = (InetSocketAddress)socket.getRemoteSocketAddress(); 
			String remoteHostAddress = inetRemoteSocketAddress.getAddress().getHostAddress();
			int remoteHostPort = inetRemoteSocketAddress.getPort();
			System.out.println("[server] connected by client[" + remoteHostAddress + ":" +  remoteHostPort + "]");
			System.out.println("");
			
			try {
				// 4. IO Stream 받아오기
				InputStream is = socket.getInputStream();
				OutputStream os = socket.getOutputStream();
				
				while(true) {
					// 5. 데이터 읽어들이기
					byte[] buffer = new byte[256];
					int readByteCount = is.read(buffer); // blocking
					
					if(readByteCount == -1) {
						// 클라이언트가 정상적으로 종료를 했을 때(close() 호출)
						System.out.println("[server] closed by client");
						break;
					}
					
					String data = new String(buffer, 0, readByteCount, "utf-8");
					System.out.println("[server] received : " + data);
					
					// 6. 데이터 쓰기
					try {
						Thread.sleep(2000);
						os.write(data.getBytes("utf-8"));
						
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				
				}
			} catch(SocketException exe){
				System.out.println("[server] suddenly closed by client");
			} catch(IOException ex){
				System.out.println("[server] error : "+ ex);
			} finally {
				try {
					if(socket != null && socket.isClosed() == false) {
						socket.close();
					}
				} catch(IOException e) {
					e.printStackTrace();
				}
			}
			
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
