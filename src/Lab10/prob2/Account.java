package Lab10.prob2;

public class Account {
	private int acctId;
	private double balance;
	
	public Account(int id, double startBalance) {
		if(startBalance <= 0) throw new IllegalArgumentException("Start balance must be > 0!");
		acctId = id;
		balance = startBalance;
	}
	public int getAcctId() {
		return acctId;
	}
	public double getBalance() {
		return balance;
	}
	@Override
	public boolean equals(Object o) {
		if(o == null) return false;
		if(!(o instanceof Account)) return false;
		Account account = (Account) o;
		return acctId == account.acctId && balance == account.balance;	
	}
}
