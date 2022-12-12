package banking;

import java.util.LinkedHashMap;

/**
 * Private Variables:<br>
 * {@link #accounts}: List&lt;Long, Account&gt;
 */
public class Bank implements BankInterface {
	private LinkedHashMap<Long, Account> accounts;
	
	private static Long accountNumber = 0L;

	public Bank() {
		// complete the function
		this.accounts = new LinkedHashMap<>();
	}

	private Account getAccount(Long accountNumber) {
		// complete the function
		return accounts.get(accountNumber);
	}

	public Long openCommercialAccount(Company company, int pin, double startingDeposit) {
		// complete the function
		Long newAccountNumber = accountNumber++;
		CommercialAccount newCommercialAccount = new CommercialAccount(company, newAccountNumber, pin, startingDeposit);
		accounts.put(newAccountNumber, newCommercialAccount);
		return newAccountNumber;
	}

	public Long openConsumerAccount(Person person, int pin, double startingDeposit) {
		// complete the function
		Long newAccountNumber = accountNumber++;
		ConsumerAccount newConsumerAccount = new ConsumerAccount(person, newAccountNumber, pin, startingDeposit);
		accounts.put(newAccountNumber, newConsumerAccount);
		return newAccountNumber;
	}

	public boolean authenticateUser(Long accountNumber, int pin) {
		// complete the function
		Account account = this.accounts.get(accountNumber);
		
		if(account==null) return false;
		
		return account.validatePin(pin);
	}

	public double getBalance(Long accountNumber) {
		// complete the function
		Account account = this.accounts.get(accountNumber);
		
		if(account==null) return 0;
		
		return account.getBalance();
	}

	public void credit(Long accountNumber, double amount) {
		// complete the function
		Account account = this.accounts.get(accountNumber);
		
		if(account == null) return;
		
		account.creditAccount(amount);
	}

	public boolean debit(Long accountNumber, double amount) {
		// complete the function
		Account account = this.accounts.get(accountNumber);
		
		if(account == null) return false;
		
		return account.debitAccount(amount);
	}
}
