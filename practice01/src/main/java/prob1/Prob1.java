package prob1;

import java.util.Scanner;

public class Prob1 {
	public static void main(String[] args) {
		int i;
		Scanner scanner = new Scanner( System.in );
		System.out.println("수를 입력하십시오 : ");
		i = scanner.nextInt();
		
		if(i%3==0) {
			System.out.println("3의 배수입니다.");
		}
		else
		scanner.close();
	}
}
