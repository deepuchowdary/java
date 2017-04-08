/**
 * 
 */
package org.uday.inheritence.bank;

/**
 * @author bexadmin
 *
 */
public class SavingsAccountImplementation implements Account{

	/**
	 * 
	 */
	
	// composed helper class (i.e. composition).
	AccountHelper helper = new AccountHelperImplementation();
	
	public double calculateInterest (double amount) {
	// calculating interest for SavingsAccount
		return amount * 0.03;
	}
	
	public void deposit (double amount) {
		helper.deposit( amount); // code reuse via composition
	}
	
	public void withdraw (double amount) {
		helper.withdraw (amount); // code reuse via composition
	}
	
	public void initializeEfficientMode(){
		helper = new EfficientAccountHelperImplementation();
	}

}
