package prob3;

import java.util.Scanner;

public class Prob3 {
	
	public static void main(String[] args) {
		int i;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력하세요 :");
		i = scanner.nextInt();
		
		if(i%2==0) {
			System.out.println("결과 값 f: " +i);
		}
		
		scanner.close();
	}
}
