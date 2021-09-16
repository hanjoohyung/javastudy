package prob01;

import java.util.Scanner;

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
		int ioc = randomize(0, 8);
		noanswerNumbers[ioc]=notresultNumber;
		System.out.println(l + " x " + r + " = ?");		
		int length = answerNumbers.length; 
		for (int i = 0; i < length;i++) {
			int a = randomize(1, 9);
			int b = randomize(1, 9);
			notresultNumber = a * b;
			if (i % 3 == 0) {
				System.out.print("\n");
			} else {
				System.out.print("\t");
			}	if(answerNumbers[i] == 0) {
				answerNumbers[i] = notresultNumber;
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
	private static int randomize1(int aNum, int bNum) {
		int random = (int) (Math.random() * bNum) + aNum;
		return random;
	}
	private static int[] randomizeAnswers() {
		/* 코드 작성(수정 가능) */
		final int COUNT_ANSWER_NUMBER = 9;
		int[] boardNumbers = new int[COUNT_ANSWER_NUMBER];
		return boardNumbers;
	}
}
