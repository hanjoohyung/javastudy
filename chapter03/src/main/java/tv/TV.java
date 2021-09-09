package tv;

public class TV {
	private int channel; // 1-255, 255에서 업을 누르면 1로, 1에서 다운을 누르면 255로 가야한다. power가 꺼져있으면 실행이 되지 않아야한다.
	private int volume;  // 0-100, power가 꺼져있으면 실행이 되지 않아야한다.
	private boolean power;
		
	public TV(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	
	}
	public void power(boolean on) {	
			power = on;
	}
	public void volume(boolean up) {
		//volume(volume + (up ? 1 : -1));
		if(up) {
			volume = volume +1;
		}
		else {
			volume = volume -1;
		}
	}
	public void volume(int volume) {
		if(!power) {
			return;
		}
		if(volume>100) {
			volume = 100;
		}
		else if(volume < 0) {
			volume = 0;
		}
		//this.volume = volume;
	}
	public void channel(int channel) {
		if(!power) {
			return;
		}
		if(channel < 1) {
			channel = 255;
		}
		else if(channel > 255) {
			channel = 1;
		}
		//this.channel = channel;
	}
	public void channel(boolean up) {	
		if(up) {
			channel = channel +1;
		}
		else {
			channel = channel -1;
		}
	}
	public void status() {
		System.out.println( "TV [channel=" + channel + ", volume=" + volume + ", power=" + power + "]");
	}
}
