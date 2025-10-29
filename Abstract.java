package arraysAndStrings;

public class Abstract {

	public static void main(String[] args) {
		auto au=new auto();
		au.stop();
		au.start();
		
	}

}
abstract class vehicle
{
	abstract void start();
	void stop()
	{
		System.out.println("the vehicle is stoped....");
	}
}
class auto extends vehicle
{
	@Override
	void start() {
		System.out.println("the vehicle is started..with a key");
		
		
	}
	
}
