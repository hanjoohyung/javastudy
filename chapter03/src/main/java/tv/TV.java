package tv;

public class TV {
	private int channel; // 1-255, 255에서 업을 누르면 1로, 1에서 다운을 누르면 255로 가야한다. power가 꺼져있으면 실행이 되지 않아야한다.
	private int volume;  // 0-100, power가 꺼져있으면 실행이 되지 않아야한다.
	private boolean power;
		
	public TV(int i, int j, boolean b) {
	
	}
	public void status() {
		System.out.println( "TV [channel=" + channel + ", volume=" + volume + ", power=" + power + "]");
	}
	public void power(boolean on,boolean off) {
		if(true) {	
			power = on;
		}
		else {		
			power = off;
		}
	}
	public void volume(boolean up) {
		if(true) {
			volume++;
		}
		else {
			volume--;
		}
		
	}
	public void volume(int volume) {
		for(volume=0;volume<101; ) {
			if(true ) {
				volume++;
			}
			else {
				volume--;
			}
		}
	}
	public void channel(int channel) {		
	}
	public void channel(boolean up) {
		channel++;
		if(channel==256) {
			channel = 1;
		}
	}	
}
