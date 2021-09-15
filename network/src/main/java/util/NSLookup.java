package util;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class NSLookup {

	public static void main(String[] args) {
		String line = "www.douzone.com";
		Scanner scanner = new Scanner(System.in);
		
		try {
			InetAddress[] inetAddresses = InetAddress.getAllByName(line);
			for(;;) {
				System.out.print(">>");
				String str = scanner.nextLine();
				
				if(str.equals("quit")) {
					break;
				}
			}
			
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