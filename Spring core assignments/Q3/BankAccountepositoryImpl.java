package Q3;

import org.springframework.stereotype.Repository;

@Repository
public class BankAccountepositoryImpl implements BankAccountRepository{

	BankAccount b = new BankAccount();
	
	@Override
	public double getBalance(long accountId) {
		if(b.getAccountId() == accountId) {
			return b.getAccountBalance();
		}
		else {
				System.out.println("not valid ID");
		}
		return accountId;
	}
	
	@Override
	public double updateBalance(long accountId, double newBalance) {
		if(b.getAccountId() == accountId) {
			b.setAccountBalance(newBalance);
			System.out.println("Balance Updated : "+ getBalance(accountId));
		}
		else {
				System.out.println("not valid ID");
		}
		return accountId;
	}
	
	
}