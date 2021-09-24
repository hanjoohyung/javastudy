package prob03;

public class Money {
	private int amount;
    
    public Money(int amount) {
    	this.amount = amount;
    }

	public Money add(Money money) {
		return new Money(amount + money.amount);
	}

	public Money minus(Money money) {
		return new Money(amount - money.amount);
	}

	public Money multiply(Money money) {
		return new Money(amount * money.amount);
	}

	public Money devide(Money money) {
		return new Money(amount / money.amount);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) // five와 two.add(three)와 같으면 true
			return true;
		if (obj == null) // two.add(three)가 null과 같으면 false
			return false;
		Money other = (Money) obj; //
		if (amount != other.amount)  //
			return false;
		return true;
	}
}
