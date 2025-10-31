package arraysAndStrings;

public class UpCasting {

	public static void main(String[] args) {
	First f=new Second();
	f.m1();
	
	}

}
interface First
{
	public  void m1();
	
}
class Second implements First
{

	public void m1() {
		System.out.println("child....");
		
	}

	

	
	
}
