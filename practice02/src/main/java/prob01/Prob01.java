package prob01;

import java.util.Scanner;

public class Prob01 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner( System.in );
		System.out.println("금액 : ");
		int i = scanner.nextInt();
		
		final int[] MONEYS = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1 }; // 주어진 int타입의 MONEYS배열 
		
		for(int j=0;j<MONEYS.length;j++) {
			int sum = i/MONEYS[j]; // MONEYS의 각각 배열의 수의 개수를 sum에 저장
			i = i%MONEYS[j]; // 개수 측정후 남은 값
			System.out.println(MONEYS[j]+"원 : "+sum+"개");
		}
		scanner.close();
		}
 	}
