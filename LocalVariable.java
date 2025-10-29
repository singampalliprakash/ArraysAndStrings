package arraysAndStrings;

public class LocalVariable {
	//with in the class and with in the method or with in the constructor
	
	int a=20;
	int b=30;
	void display()
	{
		int b=35;
		int c=40;
		System.out.println(this.a);
		System.out.println(this.b);
		System.out.println(b);
		System.out.println(c);
		
	}

	public static void main(String[] args) {
		
		LocalVariable lc=new LocalVariable();
		lc.display();

		
	}

}
