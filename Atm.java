package arraysAndStrings;
class Bank
{
	private double balance;
	private String pin;
	
	 public Bank(double balance,String pin) {
		this.balance=balance;
		this.pin=pin;
	}
	 
	 public void withdraw(double amount,String EnteredPin)
	 {
		 if(EnteredPin.equals(pin)&& amount<=balance)
		 {
			 balance-=amount;
			 System.out.println("amount succcesfully debited..."+balance);
		 }
		 else
			 
		 {
			System.out.println("Invalid PIN or Insufficient Balance.");
		 }
	 }
	 
	 public double checkBalance(String EnteredPin)
	 {
		 if(EnteredPin.equals(pin))
		 {
			 return balance;
		 }
		 else
			 return 0;
		
	 }	 

}

//inheritance
class SuperAtm extends Bank
{

	public SuperAtm(double balance, String pin) {
		super(balance, pin);
		
	}
	
	public void transeferMoney(double amount,String EnteredPin)
	{
		System.out.println("succesfully transferring money.." +amount);
		super.withdraw(amount, EnteredPin);
	}
	
	//overriding
	@Override
	public void withdraw(double amount, String EnteredPin) {
		System.out.println("Super Atm:withdraw  processsing....");
		super.withdraw(amount, EnteredPin);
	}
	
}
public class Atm {
	
	public static void main(String[] args) {
		Bank ba=new Bank(10000, "abcd");
		ba.withdraw(4000, "abcd");
		ba.withdraw(14000, "abcd");
		ba.checkBalance("abcd");
		System.out.println(ba.checkBalance("abcd"));
		
		SuperAtm sa=new SuperAtm(15000, "abcd");
		sa.withdraw(3000, "abcd");      
        sa.transeferMoney(2000, "abcd"); // Extra feature (Inheritance)
        System.out.println("Balance: " + sa.checkBalance("abcd"));

	}

}
