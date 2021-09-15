package util;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class NSLookup {

	public static void main(String[] args) {
		String line = "www.douzone.com";
		
		try {
			InetAddress[] inetAddresses = InetAddress.getAllByName(line);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
}




// > www.douzone.com
// 207.10.9.8
// > naver.com
// 202.54.26.8
// 203.64.94.1
// > quit - 끝              실행결과