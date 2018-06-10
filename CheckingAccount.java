/**
 * 
 * @author Tom Abraham
 * Period #1
 */

public class CheckingAccount {
	private double myBalance;
	private int myAccountNumber;
	
	/**
	 * Constructor for CheckingAccount class that initializes instance variables
	 */
	public CheckingAccount()
	{
		myBalance = 0;
		myAccountNumber = 0;
	}
	/**
	 * Constructor that creates new checking account
	 * @param initialBalance - balance when first creating account
	 * @param acctNum - account number 
	 */
	public CheckingAccount(double initialBalance, int acctNum)
	{
	      if (initialBalance < 0){
			   throw new IllegalArgumentException("Negative balance in account 10101");
			}
			myBalance = initialBalance;
			myAccountNumber = acctNum;
			
	}
	/**
	 * Method to return the current balance 
	 * @return balance
	 */
	public double getBalance()
	{
		return myBalance;
	}
	/**
	 * Method to deposit money into the checking account
	 * @param amount - amount that is deposited
	 */
	public void deposit(double amount)
	{
	   if (amount < 0){
	      throw new IllegalArgumentException("Negative amount deposited in account 10110");
	   }
		myBalance += amount;
	}
	/**
	 * Method to withdraw money from the account
	 * @param amount - amount that is withdrawn
	 */
	public void withdraw(double amount)
	{
	   if (amount > myBalance){
	      throw new IllegalArgumentException("Account 10111 overdrawn");
	   }
		myBalance -= amount;
	}
}
