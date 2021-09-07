package prob5;

public class Prob5 {

	public static void main(String[] args) {
		int i;
		int j;
		
		for(i=1;i<100;i++) {
			String b = String.valueOf(i); //문자열로 형 변환
			System.out.print(b);
			
			//형변환된 값의 길이 만큼 반복
			 for(j=0;j <b.length();j++) {
				 char a = b.charAt(j);
				 if(a=='3' || a=='6' || a=='9') {
				System.out.print("짝");
				 }
			 }
			 System.out.println();
		}
		
	}
}
