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
		if(a%2==0) {	// 입력 값 a가 짝수인지 확인	
				sum = sum + a-2;	// 자기 자신의 값에서 -2를 해주면서 0까지 짝수만 더해주는 구문
				a = a-2;		}   
		else {		    // 입력 값 a가 짝수가 아니므로 홀수
				sum = sum + a-2;	// 자기 자신의 값에서 -2를 해주면서 0까지 홀수만 더해주는 구문
				a = a-2;			
		}
		}
		System.out.println("결과 값 :"+sum); // 0부터 자기자신에서 짝수,홀수만 더하여 구한 값
		scanner.close();
	}
}