package prob05;

public class Account {
	String account = "078-3762-293";
	int Balance = 0;
	public Account(String Account) {
		System.out.println(account+" 계좌가 개설되었습니다.");
		return;
	}

	public String getAccountNo( ) {
		return account;
	}

	public int getBalance() {
		
		return Balance;
	}

	public void save(int save) {
		save = 100;
		System.out.println(account+" 계좌에 "+save+"만원이 입금되었습니다.");
		Balance = Balance + save;
	}

	public void deposit(int deposit) {
		deposit = 30;
		System.out.println(account+" 계좌에 "+deposit+"만원이 출금되었습니다.");
		Balance = Balance - 30;	
	}
}
