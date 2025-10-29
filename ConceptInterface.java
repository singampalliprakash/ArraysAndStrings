package arraysAndStrings;
interface Animal
{
	void eat();
	void sleep();
}
class dog implements Animal
{

	@Override
	public void eat() {
		System.out.println("dog eat bones..");
		
	}

	@Override
	public void sleep() {
		System.out.println("dog sleep at kennel..");
	}
	
}

public class ConceptInterface {
	
	public static void main(String[] args) {
		dog bu=new dog();
		bu.eat();
		bu.sleep();

	}

}
