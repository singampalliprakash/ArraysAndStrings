package arraysAndStrings;

public class MethodOverloading {
	
	//Compile Time PolyMorphism
	
	void add(int x,int y)
	{
		System.out.println("the result sum will be: " +(x+y));
	}
	void add(double x,int y,int z)
	{
		System.out.println("the result sum will be: " +(x+y+z));
	}
	void add(int x,int y,int z,int b)
	{
		System.out.println("the result sum will be: " +(x+y+z+b));
	}

	public static void main(String[] args) {
		MethodOverloading mo=new MethodOverloading();
		mo.add(10, 20);
		mo.add(10.45, 20, 30);
		mo.add(10, 20, 30, 40);

	}

}
