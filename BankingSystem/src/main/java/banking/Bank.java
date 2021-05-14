package banking;

import java.util.LinkedHashMap;
import java.util.Set;

/**
 * Private Variables:<br>
 * {@link #accounts}: List&lt;Long, Account&gt;
 */
public class Bank implements BankInterface {
	private LinkedHashMap<Long, Account> accounts;

	public Bank() {
		// complete the function
	}

	private Account getAccount(Long accountNumber) {
		// complete the function
		
        return  accounts.get(accountNumber);
	}


	public Long openCommercialAccount(Company company, int pin, double startingDeposit) {
		// complete the function
		 /*Set<Long> keySet = accounts.keySet();
		 for(Long acct : keySet) {
			   new Account
		 }
		*/
		
		return 1L;
       
	}

	public Long openConsumerAccount(Person person, int pin, double startingDeposit) {

     
        return -1L;
	}

	public boolean authenticateUser(Long accountNumber, int pin) {
		// complete the function
        return true;
	}

	public double getBalance(Long accountNumber) {
		
        return getAccount(accountNumber).getBalance();
	}

	public void credit(Long accountNumber, double amount) {
		// complete the function
		getAccount(accountNumber).creditAccount(amount);
	}

	public boolean debit(Long accountNumber, double amount) {
		// complete the function
	
        return getAccount(accountNumber).debitAccount(amount);
	}
}
