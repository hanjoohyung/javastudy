package prob2;

public class Prob2 {
	public static void main(String[] args) {
		int i;
		int j;
		
		for(j=1;j<11;j++) {
		for(i=j;i<j+10;i++) {
			System.out.print(" "+ i);
		}
		System.out.println("");
		}
	}
}