package prob3;

import java.util.Scanner;

public class Prob3 {
	
	public static void main(String[] args) {
		int i;
		int sum = 0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력하세요 :");
		int a = scanner.nextInt();
		sum = a;
	
		for(i=1;i<=a-2;) {
		if(a%2==0) {		
				sum = sum + a-2;
				a = a-2;		}
		else {		
				sum = sum + a-2;	
				a = a-2;
		}
		}
		System.out.println("결과 값 :"+sum);
		scanner.close();
	}
}