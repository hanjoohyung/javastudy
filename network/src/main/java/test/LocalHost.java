package test;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class LocalHost {

	public static void main(String[] args) {
		try {
			InetAddress inetAddress = InetAddress.getLocalHost();
			
			String hostName = inetAddress.getHostName(); // 컴퓨터의 장치 이름
			String hostAddress = inetAddress.getHostAddress(); // 컴퓨터의 ip주소
			
			System.out.println(hostName);
			System.out.println(hostAddress);
			
			byte[] addresses = inetAddress.getAddress();
			for(byte address : addresses) {
				// System.out.println((int)address);
				System.out.print(address & 0x000000ff);
				System.out.print(".");
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}

	}

}
