package prob05;

import java.util.Random;
import java.util.Scanner;

public class Prob05 {
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner( System.in );

		while( true ) {
			
			/* 게임 작성 */
			int min = 1;
			int max = 100;
			// 정답 램덤하게 만들기
			Random random = new Random();
			System.out.println("수를 결정하였습니다. 맞추어 보세요");
			int correctNumber = random.nextInt( 100 ) + 1; // Random class로 1-100까지의 임의의 정수를 랜덤으로 생성
			System.out.println(correctNumber);
			for(int j=1;;j++) {  // for문의 중간 식을 넣지 않으면 무한대로 돌아감.
				System.out.println(min + "-"+ max);
				System.out.print(j+">>");
				int i = scanner.nextInt();
				if(i==correctNumber) {
					System.out.println("맞췄습니다.");	
					break;
				}
				else {
					if(i>correctNumber) { // 입력값이 정답보다 크다면
						System.out.println("더 낮게");
						max = i;  // 범위 최대 값을 i로 지정
					}
					else if(i<correctNumber){ // 입력값이 정답보다 작다면
						System.out.println("더 높게");
						min = i;  //  범위 최소 값을 i로 지정
					}
				}				
			}
			//새 게임 여부 확인하기
			System.out.print( "다시 하겠습니까(y/n)>>" );
			String answer = scanner.next();
			if( "y".equals( answer ) == false ) {
				return;
			}
			else {
				break;
			}
			
		}
		scanner.close();
	}
}
