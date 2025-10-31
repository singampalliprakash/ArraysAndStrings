package arraysAndStrings;
@FunctionalInterface
interface Sol
{
	void dm1();
}
class Dem implements Sol
{

	@Override
	public void dm1() {
		System.out.println("Functional Interface using class..");
		
	}
	
}
public class FunctionalInterfaceUsingClass {

	public static void main(String[] args) {
		Dem d=new Dem();
		d.dm1();
		

	}

}
