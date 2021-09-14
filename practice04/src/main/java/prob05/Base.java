package prob05;

public class Base {
	public void service(String state){
		if( state.equals( "낮" ) ) { // state가 "낮"이면 day()함수에 저장된 값이 출력
			day();
		} else {
			night(); // "낮"이 아니면 night()함수에 저장된 값이 출력
		}
	}
	
	public void day(){
		System.out.println("낮");
	}
	
	public void night(){
		System.out.println("night");
	}
}
