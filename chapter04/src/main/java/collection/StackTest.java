package collection;

import java.util.Stack; // Stack - Last In First Out

public class StackTest {

	public static void main(String[] args) {
		Stack<String> s = new Stack<>();
		
		s.push("둘리"); // Stack에서는 In이 push,add
		s.push("마이콜");
		s.push("도우너");
		
		while(!s.isEmpty()) {
			String str = s.pop(); // Stack에서는 Out이 pop
			System.out.println(str);
	}
		// 비어있는 경우에는 예외가 발생한다.
		// s.pop();
		
		s.push("둘리");
		s.push("마이콜");
		s.push("도우너");
		
		System.out.println(s.pop());
		System.out.println(s.peek()); // 꺼내지 않고 맨위에 것 확인
		System.out.println(s.pop());
		
	}
}