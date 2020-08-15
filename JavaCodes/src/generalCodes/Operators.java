package generalCodes;

public class Operators {
	
	public static void main(String[] args) {
		 System.out.println("*****Scenario 1*******");
		  double balance = 600;   // Balance in the account
		  System.out.println("Amount to withdraw");
		  double amount = 200;   // Amount to be withdrawn
		  if(amount < 0 || amount > balance) 
		  {    // Using OR operator.
		    System.out.println("Withdrawal has failed.");
		  }
		  else
          {
		    balance -= amount;
		    System.out.println("Withdrawal has succeeded");
		  }
		    
		    /*****************************/
		    
		    System.out.println("***** Scenario 2 *******");
		     balance = 2600;
		    System.out.println("Amount to withdraw");
		     amount = 1500; 
		    double limit = 10000, minbal = 500;
		    if(amount <= limit && (balance - amount) > minbal) 
		    {    // Using AND
		      balance -= amount;
		      System.out.println("Withdrawal has succeeded");
		    }
		    
		    
		    System.out.println("***** Scenario 3 *******");
		     balance = 2000;
		    System.out.println("Amount to withdraw");
		     amount = 500; 
		     limit = 10000;
		     minbal = 500;
		    if(!(amount < 0)) 
		    {   // Using NOT
		      if(amount <= limit && (balance - amount) > minbal)
		      {
		        balance -= amount;
		        System.out.println("Withdrawal has succeeded");
		      }
		    }
	}
	
}
		      
		   

		    
		    
		    
		  
		



