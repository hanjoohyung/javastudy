package prob5;

public class Prob5 {

	public static void main(String[] args) {
		int i;
		int j;
		
		for(i=1;i<100;i++) {
			String b = String.valueOf(i); // valueOf함수로int타입을 String타입으로 형 변환
			System.out.print(b);
			for(j=0;j <b.length();j++) { // 형변환된 값의 길이 만큼 반복
				 char a = b.charAt(j); // charAt() - String타입으로 저장된 문자열 중 한 글자 선택하여 char타입으로 변환
				 if(a=='3' || a=='6' || a=='9') {
					 System.out.print("짝");
				 }
			 }
			 System.out.println();
		}
		
	}
}
