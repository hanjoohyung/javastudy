package prob01;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Gugudan {
	static int resultNumber = 0;
	static int notresultNumber = 0;
	
	public static void main(String[] args) {
		
		int l = randomize(1, 9);
		int r = randomize(1, 9);
		resultNumber = l * r;
		
		int[] answerNumbers = randomizeAnswers();
		int[] noanswerNumbers = randomizeAnswers();
		int loc = randomize(0, 8);
		answerNumbers[loc] = resultNumber;
		
		System.out.println(l + " x " + r + " = ?");		
		int length = answerNumbers.length; 
		for (int i = 0; i < length;i++) {	
			if (i % 3 == 0) {
				System.out.print("\n");
			} else {
				System.out.print("\t");
			}	
				System.out.print(answerNumbers[i]);
		}

		System.out.print("\n\n");
		System.out.print("answer:");

		Scanner s = new Scanner(System.in);
		int answer = s.nextInt();
		s.close();

		System.out.println((answer == resultNumber) ? "정답" : "오답");
	}
	private static int randomize(int lNum, int rNum) {
		int random = (int) (Math.random() * rNum) + lNum;
		return random;
	}
	
	private static int[] randomizeAnswers() {
		/* 코드 작성(수정 가능) */
		final int COUNT_ANSWER_NUMBER = 9;
		int[] boardNumbers = new int[COUNT_ANSWER_NUMBER];
		
		Set<Integer> set = new HashSet<Integer>(); // Set - 부모클래스  HashSet - 자식클래스여서 이렇게 표현이 가능하다 
		while (set.size() < COUNT_ANSWER_NUMBER) { 
			int l = randomize(1, 9);
			int r = randomize(1, 9);
			int lr = l * r;
			if (lr == resultNumber) {  // lr값이 resultNumber와 같으면 다시 lr을 생성한다
				continue;
			} else {
				set.add(lr); // lr값이 resultNumber와 같지 않다면 set에 대입한다.
			}
		} // set에 각각 다른 수가 9개 대입이 되면 while문을 탈출한다.
		int count = 0;
		for (int num : set) { 
			boardNumbers[count] = num; // 정답이 나오는 보드판에 0번부터 set에 값을 대입한다 
			count++;
		}
		return boardNumbers; // 대입한 보드판을 리턴
	}
}
