package chapter04;

public class StringTest03 {
	public static void main(String[] args) {
		//String s1 = "Hello " + "World " + "java " +1.8;
		String s1 = new StringBuffer("Hello ")
		.append("World ")
		.append("java ")
		.append(1.8)
		.toString();
		System.out.println(s1);
		
		String s2 = "";
		for(int i=0;i<1000000;i++) {
//			 s2 = s2+i;
//			 s2 = new StringBuffer(s2).append(i).toString();			
		}
		StringBuffer sb2 = new StringBuffer("");
		for(int i=0;i<1000000;i++) {
			sb2.append(i);			
		}
		String s3 = sb2.toString();
		System.out.println(s3.length());
		
		// String method들
		String s4 = "aBcABCabcAbc";
		System.out.println(s4.length());
		System.out.println(s4.charAt(2));
		System.out.println(s4.indexOf("abc")); // 문자열을 찾아주는 코드
		System.out.println(s4.indexOf("abc", 7)); // 만약에 없다면 -1이 출력된다.
		System.out.println(s4.substring(3)); // 끝을 지정해주지않으면 끝까지 출력한다.
		System.out.println(s4.substring(3,5)); // substring(a,b)이면 a부터 b-1까지의 값이 출력된다.
		
		String s5 = "   ab     cd     ";
		String s6 = "efg,hij,klm,nop,qrs";
		
		String s7 = s5.concat(s6);
		System.out.println(s7);
		
		System.out.println("----" + s5.trim() + "----"); // trim()은 앞뒤에 공백을 지워주는 코드.
		System.out.println("----" +s5.replaceAll(" ", "") + "----"); // replaceAll(a,b)은 a와b를 다 지워주는 코드.
		
		String[] tokens = s6.split(","); // split(a)은 a를 기준으로 쪼개주는 코드. [a는 공백까지 포함하기때문에 확실하게 입력해야 한다.]
		for(String s : tokens) {
			System.out.println(s);
		}
		String[] tokens2 = s6.split(" "); // 쪼개어지지 않으면 그대로의 배열을 출력한다.
		for(String s : tokens2) {
			System.out.println(s);
		}
		}
}
