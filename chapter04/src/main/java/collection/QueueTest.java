package collection;

import java.util.LinkedList;
import java.util.Queue; // Queue - First In First Out

public class QueueTest {

	public static void main(String[] args) {
		Queue<String> q = new LinkedList<>();
		
		q.offer("둘리"); // Queue에서는 In이 offer,add
		q.offer("마이콜");
		q.offer("도우너");
		
		while(!q.isEmpty()) {
			String str = q.poll(); // Queue에서는 Out이 poll
			System.out.println(str);
	}
		q.offer("둘리");
		q.offer("마이콜");
		q.offer("도우너");
		
		System.out.println(q.poll());
		System.out.println(q.peek()); // 꺼내지 않고 맨위에 것 확인
		System.out.println(q.poll());
		System.out.println(q.poll());
		System.out.println(q.poll()); // 비어있는 경우에는 null을 출력한다
	
		
	}

}
