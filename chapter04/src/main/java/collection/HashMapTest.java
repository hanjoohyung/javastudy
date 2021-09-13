package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		Map<String, Integer> m = new HashMap<>();
		
		String ks1 = "one";
		m.put(ks1, 1); // 1에서 Aute Boxing 이루어 지고있음
		m.put("two", 2);
		m.put("three", 3);
		
		int i = m.get("one");
		int j = m.get(new String("one"));
		
		System.out.println(i+":"+j);
		
		m.put("three", 33);
		System.out.println(m.get("three"));
		
		//순회
		Set<String> s = m.keySet();
		for(String key : s) {
			System.out.println(m.get(key)); // 그냥 key를 입력하면 문자열이 출력되고 m.get(key)를 입력하면 문자열에 저장된 숫자가 나온다.
		}
	}

}
