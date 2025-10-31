package arraysAndStrings;

import java.util.Scanner;

public class CustomException {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your age: ");
		int age=sc.nextInt();
		try {
			Person.canvote(age);
		}
				catch (Exception e) {
			System.out.println("Exception:Invalid Age ");
		}

	}

}
class Person
{
	public static void canvote(int age) throws InvalidAgeException
	{
		if(age>=18)
		{
			System.out.println("can vote");
		}
		else
		{
			InvalidAgeException obj=new InvalidAgeException();
			throw obj;
		}
	}
}
class InvalidAgeException extends Exception
{
	
}
