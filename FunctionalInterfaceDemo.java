package arraysAndStrings;

@FunctionalInterface

interface Demo
{
  void m1();
}
public  class FunctionalInterfaceDemo
{

	public static void main(String[] args) {
		Demo d=()->
			System.out.println("Functional interface..");
		d.m1();

	}

}
