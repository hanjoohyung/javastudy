package prob2;

public class SmartPhone extends Phone {
	
	private void down() {
		System.out.println("다운로드해서 음악재생");
	}
	private void app() {
		System.out.println("앱 실행");
	}
	@Override // phone에있는 execute문을 오버라이드함.
	public void execute(String function){
		if( function.equals( "음악" ) ) { // execute("음악") 일때 down()을 출력
			down();
			return;
		}
		if (function.equals("통화")) { // execute("통화") 일때 call()을 불러와서 출력
		super.execute(function);
		}
		if(function.equals("앱")) { // execute("앱") 일때 app()을 출력
			app();
			return;
		}
		
	}
}
