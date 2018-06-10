/**
 * 
 * @author Tom Abraham
 * Period #1
 */
public class CheckingAccountDriver {
   
   /**
    * Method to run the entire method 
    * @param args - arguments that are passed into the main method
    */
	public static void main(String[] args) {
		try{
			CheckingAccount acc1 = new CheckingAccount(-500, 100);
		}
		catch(IllegalArgumentException e){
			System.out.println("Negative balance in account 100");
			try{
				CheckingAccount acc2 = new CheckingAccount(500, 102);
				acc2.deposit(-50);
			}
			catch(IllegalArgumentException d){
				System.out.println("Negative amount deposited in account 102");
				try{
					CheckingAccount acc3 = new CheckingAccount(200, 103);
					acc3.withdraw(1100);
				}
				catch(IllegalArgumentException f){
					System.out.println("Account 103 overdrawn");
				}
			}
	    }

	}

}
