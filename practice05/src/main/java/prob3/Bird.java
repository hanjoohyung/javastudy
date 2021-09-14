package prob3;

public abstract class Bird {
	protected String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract void fly(); // 오버라이드로 값을 불러들임. 추상클래스이기 때문에 abstract로 불러야함. 

	public abstract void sing();
}