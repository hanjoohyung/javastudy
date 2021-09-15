package prob02;

public class Div{

	private int lValue;
	private int rValue;

	public void setValue(int lValue, int rValue) {
		this.lValue = lValue;
		this.rValue = rValue;
		
	}

	public int calculate() {
		int div = lValue / rValue;
		return div;
	}

}
