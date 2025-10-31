package arraysAndStrings;

import java.util.Scanner;

public class LowBalanceCustomException {

	public static void main(String[] args) {
		Scanner  sc=new Scanner(System.in);
		System.out.println("Enter your Amount : ");
		int amount=sc.nextInt();
		
		try {
			withdraw.withdrawAmount(amount);
			
		} catch (Exception e) {
			System.out.println("Invalid:Low Balance...");
		}
		

	}

}
class withdraw
{
	static int balance=3000;
	public static void withdrawAmount(int amount) throws lowBalanceException
	{
		if(amount<=balance)
		{
			System.out.println("collect cash..");
			balance=balance-amount;
			System.out.println(balance);
		}
		else
		{
		lowBalanceException obj=new lowBalanceException();
		throw obj;
		}
	}
}
class lowBalanceException extends Exception
{
	
}
