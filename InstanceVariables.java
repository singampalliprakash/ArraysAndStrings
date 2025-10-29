package arraysAndStrings;

public class InstanceVariables {
	//with in the class and outside of method or outside of a constructor
	int rollNo;
	public InstanceVariables() {
		this.rollNo=rollNo;
	}
	//default constructor
//	void display()
//	{
//		System.out.println("RollNo: " +rollNo);
//	}
	
	//parmetrized constructor
	void display(int rollNo)
	{
		System.out.println("RollNo: " +rollNo);
	}
	

	public static void main(String[] args) {
		InstanceVariables ins=new InstanceVariables();
		ins.display(15);
		

	}

}
