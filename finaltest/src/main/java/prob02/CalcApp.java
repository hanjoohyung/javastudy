package prob02;

import java.util.Scanner;

import prob02.Add;
import prob02.Div;
import prob02.Mul;
import prob02.Sub;

public class CalcApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while( true ) {
			System.out.print( ">> " );
			String expression = scanner.nextLine();
			
			if( "quit".equals( expression ) ) {
				break;
			}
			
			String[] tokens = expression.split(" ");
			
			if( tokens.length != 3 ) {
				System.out.println( ">> 알 수 없는 식입니다.");
				continue;
			}
			
			int lValue = Integer.parseInt( tokens[ 0 ] );
			int rValue = Integer.parseInt( tokens[ 1 ] );
			
			Arithmetic arithmetic = null;
			
			switch( tokens[ 2 ] ) {
			case "+" : { // 두 번째로 입력한 사칙연산 기호에 맞게 계산
				Add add = new Add();
				break;
			}
			case "-" : {
				Sub sub = new Sub();
				break;
			}
			case "*" : {
				Mul mul = new Mul();

				break;					
			}
			case "/" : {
				Div div = new Div();
				break;
			}
			default :  {
				System.out.println( ">> 알 수 없는 연산입니다.");
			}
		
			}
			int result = arithmetic.calculate(lValue, rValue);
			System.out.println( ">> " + result );
		}
		
		scanner.close();
	}
}