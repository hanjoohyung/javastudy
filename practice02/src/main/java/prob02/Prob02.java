package prob02;

import java.util.Scanner;

public class Prob02 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("5개의 숫자를 입력하세요.");
		int[] intArray = new int[ 5 ];
		int j = intArray.length; // 배열의 길이
		double sum = 0;
		
		for(int a=0;a<5;a++) { //배열의 칸마다 숫자를 입력
			intArray[a] = scanner.nextInt();
		}
		for(int i=0;i<5;i++) { //배열의 칸마다 저장되어 있는 수를 더하기
			sum = sum + intArray[i];
		}
		double avg = sum/j; //결과값이 30.0이 나와야하기때문에 실수형 double작성
	
		System.out.println("평균은 "+avg+"입니다.");
		scanner.close();
	}
}
