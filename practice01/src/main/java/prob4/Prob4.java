package prob4;

import java.util.Scanner;

public class Prob4 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("문자열을 입력하세요 : ");
		String text = scanner.nextLine(); // 문자열을 입력받을때에는 nextLine을 활용한다.
		
		
		for(int i=0;i<text.length();i++) { // 입력받은 문자열의 길이까지 반복
			String ans = text.substring(0,i+1); // 0~i+1까지에 해당되는 문자열을 잘라내어 추출 substrint(a,b) - a부터 b-1까지 출력
		System.out.println(ans); // 하나씩 잘라낸 문자열을 순차적으로 출력
		}
		scanner.close();
	}

}
