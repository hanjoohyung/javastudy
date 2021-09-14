package prob1;

import java.util.Scanner;

public class Prob1 {
	public static void main(String[] args) {
		int i;
		Scanner scanner = new Scanner( System.in );
		System.out.println("수를 입력하십시오 : ");
		i = scanner.nextInt(); // scanner를 통해 nextInt 정수형을 입력받는 함수
		
		if(i%3==0) {
			System.out.println("3의 배수입니다.");
		}
		else
		scanner.close();
	}
}
