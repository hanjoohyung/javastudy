package prob05;

import java.util.Random;
import java.util.Scanner;

public class Prob05 {

	public static void main(String[] args) {
		int a=1;
		int b=100;
	
		Scanner scanner = new Scanner( System.in );
		System.out.println("수를 결정하였습니다. 맞추어 보세요");

		while( true ) {
			
			/* 게임 작성 */
			System.out.println("1-100");
			// 정답 램덤하게 만들기
			
			Random random = new Random();
			int correctNumber = random.nextInt( 100 ) + 1;
			System.out.println(correctNumber);
			for(int j=1;j<101;) {
				int i = scanner.nextInt();
				int w = 1;
				int e = 100;
				if(i==correctNumber) {
					System.out.println("맞췄습니다.");	
					break;
				}
				else {
					if(i>correctNumber) {
						System.out.println("더 낮게");
						System.out.println(w+"-"+i);							
					}
					else if(i<correctNumber ){
						System.out.println("더 높게");
						System.out.println(w+"-"+e);	
					}
				
				}
				 w = a+j;
				 e = b-j;
			}
			//새 게임 여부 확인하기
			System.out.print( "다시 하겠습니까(y/n)>>" );
			String answer = scanner.next();
			if( "y".equals( answer ) == false ) {
				break;
			}
			scanner.close();
		}
		
	}
}
