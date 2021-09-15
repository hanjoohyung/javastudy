package prob5;

public class MyStack {
	private int top;
	private String[] buffer;

	public MyStack(int capacity) { // capacity는 MainApp에 MyStack()에 입력된 수
		top = -1;
		buffer = new String[capacity]; // buffer = new String[3]과 같은 뜻
	}

	public void push(String s) { // s는 MainApp에 push("Hello")의 Hello와 같음
		if (top == buffer.length - 1) { // buffer.length =3 이기에 top == 2와 같음
			resize();
		}
		buffer[++top] = s;		// buffer[0]부터 s값을 대입
	}

	public String pop() throws MyStackException {
		if (isEmpty()) {
			throw new MyStackException("stack is empty");
		}

		String result = buffer[top];
		buffer[top--] = null;

		return result;
	}

	public boolean isEmpty() { // isEmpty()가 true일때 top를 -1로 return 시켜줌
		return top == -1;
	}

	private void resize() {
		String[] temp = new String[buffer.length * 2];
		for (int i = 0; i <= top; i++) {
			temp[i] = buffer[i];
		}
		buffer = temp;
	}
}