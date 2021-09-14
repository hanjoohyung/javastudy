package prob2;

public class Prob2 {
	public static void main(String[] args) {
		int i;
		int j;
		
		for(j=1;j<11;j++) { // ②번 for문을 통해 처음 숫자를 증가시켜준다.
		for(i=j;i<j+10;i++) { // ①번 for문을 통해 j-j+10까지 출력하고 ②번 for문에서 증가된 j값을 통해 점차 수가 증가.
			System.out.print(" "+ i);
		}
		System.out.println("");
		}
	}
}