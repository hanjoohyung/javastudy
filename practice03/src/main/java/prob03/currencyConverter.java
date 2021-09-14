package prob03;

public class currencyConverter {
	private double Rate;
	private double Dollar;
	private double KRW;
	public double getRate() {
		return Rate;
	}
	public void setRate(double rate) {
		Rate = rate;
	}
	public double toKRW(double KRW) {	
		return KRW*Rate; // 원화에 환율을 곱해 주어 달러를 출력
	}

	public double toDollar(double Dollar) {	
		return Dollar/Rate; // 달러에 환율을 나누어 주어 원화를 출력
	}


}
