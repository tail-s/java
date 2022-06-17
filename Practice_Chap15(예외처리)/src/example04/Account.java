package example04;

public class Account {

	private long balance;
	
	public Account() {
	}
	
	//현재 잔액을 가져오기
	public long getBalance() {
		return this.balance;
	}
	
	//입금하기
	public void deposit(int money) {
		this.balance += money;
	}
	
	//출금하기
	public void withdraw(int money) throws BalanceException {
		if(this.balance < money) {
			//강제로 예외 발생
			throw new BalanceException("잔액 부족");
		}
		this.balance -= money;
	}
}
