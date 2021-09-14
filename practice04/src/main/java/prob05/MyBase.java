package prob05;

public class MyBase extends Base {

	@Override
	public void day() { // 부모클래스인 Base클래스 day()함수에 덮어씌워 자식 클래스 day()함수 값이 출력
		System.out.println("낮에는 열심히 일하자!");
	}

	@Override
	public void service(String state) {
		if("오후".equals(state)) { // state가 "오후"면 afternoon()함수에 저장된 값을 출력하고 리턴
			afternoon();
			return;
		}
		super.service(state); // 부모클래스인 Base클래스에 먼저 service에 저장된 값을 불러들임
	}
	
	private void afternoon() {
		System.out.println("오후도 낮과 마찬가지로 일해야 합니다.");
		
	}

}
