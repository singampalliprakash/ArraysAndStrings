package arraysAndStrings;
@FunctionalInterface
interface Anony
{
	void Inner();
}

public class FunctionalInterfaceUsingAnonymousInner {

	public static void main(String[] args) {
		Anony an=new Anony() {
			
			@Override
			public void Inner() {
				System.out.println("FUnctional Interface Using Anonymous Innner classes..");
				
			}
		
		};
		an.Inner();
		

	}

}
