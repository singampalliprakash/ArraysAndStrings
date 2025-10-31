package arraysAndStrings;

interface Method
{
	void reference();
}
public class FunctionalClassUsingmethodReference {

	public static void main(String[] args) {
		Method m=Depres::ion;
		m.reference();
	}

}
class Depres
{
	static void ion()
	{
		System.out.println("Functional interface using method reference.....");
	}
}
