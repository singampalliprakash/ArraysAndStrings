package arraysAndStrings;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchException {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//try with multiple exceptions
		try {
			System.out.println("Enter a value: ");
			int a=sc.nextInt();
			System.out.println("Enter b value: ");
			int b=sc.nextInt();
			
			int c=a+b;
			System.out.println(c);
			}
		
//		catch (InputMismatchException e) {
//			System.out.println("Input must be int...");
//		}
//		catch (ArithmeticException e) {
//			System.out.println("Exception:can not divide with zero..");
//		}
		catch (Exception e) {
			System.out.println("Exception: " +e.getMessage());
		}

	}

}
