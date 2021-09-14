package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class PhoneList02 {
	public static void main(String[] args) {
		Scanner sc = null;
		try {
			File file = new File("phone.txt");
			
			if(!file.exists()) {
				System.out.println("file not found");
				return;
			}
			System.out.println("==== 파일 정보 ====");
			System.out.println(file.getAbsolutePath());
			System.out.println(file.length() + "byte");
			
			
			
			System.out.println(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date(file.lastModified())));
			System.out.println("==== 전화 번호 ====");
			
			sc = new Scanner(file);
			
			while(sc.hasNextLine()) {
				String name = sc.next();
				String phone1 = sc.next();
				String phone2 = sc.next();
				String phone3 = sc.next();
				
				System.out.println(name + ":" + phone1+ "-" + phone2+ "-" + phone3);
			}
		} catch (FileNotFoundException e) {
			System.out.println("file not found"+e);
		}	finally {
			if(sc!=null) {
				sc.close();
			}
		}
	}
}
