package arraysAndStrings;

public class Student {
	int rollNo;
	String name;
	char grade;
	void display()
	{
		System.out.println("RollNo: " +rollNo);
		System.out.println("Name: " +name);
		System.out.println("grade: " +grade);
	}

	public static void main(String[] args) {
		Student st=new Student();
		st.grade='A';
		st.name="Prakash";
		st.rollNo=439;
		st.display();
	}

}
