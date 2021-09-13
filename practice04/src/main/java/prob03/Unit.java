package prob03;

public abstract class Unit { 
	int x = 10;
	int y = 5;
	abstract void move(int x, int y); // 클래스마다 이동하는 방법이 다르므로 추상메소드로 정의

	void stop() { // 각 클래스마다 공통적인 부분 추출.
		/* 현재 위치에 정지 */
		
	}
}
