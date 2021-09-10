package prob03;

public class CurrencyConverterTest {

	public static void main(String[] args) {
		currencyConverter CurrencyConverter = new currencyConverter();
		CurrencyConverter.setRate(1121.0);//  환율을 세팅 합니다.
		
		double dollar = CurrencyConverter.toDollar( 1000000. );
		System.out.println( "백만원은 " + dollar + "달러 입니다" );
		
		double krw = CurrencyConverter.toKRW( 100. );
		System.out.println( "백달러는 " + krw + "원 입니다" );
	}
}
