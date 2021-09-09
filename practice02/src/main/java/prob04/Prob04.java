package prob04;

public class Prob04 {

	public static void main(String[] args) {
		char[] c1 = reverse( "Hello World" );
		printCharArray( c1 );
		
		char[] c2 = reverse( "Java Programming!" );
		printCharArray( c2 );
	}
	public static char[] reverse(String str) {
		char[] data=new char[str.length()]; //문자열을 담을 배열
		for(int i =str.length()-1;i>=0;i--) { // 문자열을 한글자씩 끊어 배열에 저장
			data[str.length()-1-i]=str.charAt(i);
		}
		return data;
	}
	public static void printCharArray(char[] array){	
		System.out.println( array );
	}
}