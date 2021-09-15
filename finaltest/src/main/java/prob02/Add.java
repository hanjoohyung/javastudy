package prob02;

public class Add{

	private int lValue;
	private int rValue;
	
	public void setValue(int lValue, int rValue) {
		this.lValue = lValue;
		this.rValue = rValue;
	}
	
	public int calculate() {
		int add = lValue + rValue;
		return add;
	}

	
}
