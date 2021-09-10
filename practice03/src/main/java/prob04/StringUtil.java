package prob04;

public class StringUtil {

	public static String concatenate(String[] strArr) {
		String resArr = "";
		for(int i=0;i<strArr.length;i++) { // strArr의 길이만큼 for문을 돌려 배열에 저장되어있는 문자열을 더해 return해줌
			resArr = resArr + strArr[i];	
		}
		return resArr;
	}
}
