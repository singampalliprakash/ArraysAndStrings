package arraysAndStrings;

public class StaticAndDefaultMethods {

	public static void main(String[] args) {
		coder cd=new coder();
		Test.m1();
		cd.m2();
		cd.m3();
	}
}
interface Test
{
	public static void m1()
	{
		System.out.println("m1");
		
	}
	public default void m2()
	{
		System.out.println("m2");
		
	}
	public void m3();
	
	
}

class coder implements Test
{

	@Override
	public void m3() {
		System.out.println("m3");
		
	}
	
}
