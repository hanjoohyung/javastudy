package prob03;

public class Prob03 {
	public static void main(String args[]) {
		char c[] = { 'T', 'h', 'i', 's', ' ', 'i', 's', ' ', 'a', ' ', 'p', 'e', 'n', 'c', 'i', 'l', '.' };

		        // 원래 배열 원소 출력
				printCharArray1(c);

				// 공백 문자 바꾸기
				replaceSpace(c);

				// 수정된 배열 원소 출력
				printCharArray1(c);
		   }
		   public static void printCharArray1(char c[]) {
			   System.out.println(c);
		   }
		   public static void replaceSpace(char c[]) {
			   for(int a=0;a<c.length;a++) {
			   if(c[a]==' ') {				// 배열 속 공백이 있는 곳을 찾아 따옴표로 변환
				   c[a] = ',';	   
			   }
			   }
		   }
		   
		   public static void printCharArray(char c[]) {
			   for(int b=0;b<c.length;b++) {
				   System.out.print(c[b]);
			   }
		   }
	}


