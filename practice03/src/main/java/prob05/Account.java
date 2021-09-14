package prob05;

public class Account {
	String account = "078-3762-293"; // 주어진 계좌는 초기값으로 지정
	int Balance = 0; // 계좌의 잔액을 0원으로 초기화
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
		Balance = Balance + save; // 입금된 금액을 계좌에 저장
	}
	public void deposit(int deposit) {
		deposit = 30;
		System.out.println(account+" 계좌에 "+deposit+"만원이 출금되었습니다.");
		Balance = Balance - 30;	 // 출금된 금액만큼 차감해 계좌에 저장
	}
}
