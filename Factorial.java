package arraysAndStrings;

public class Factorial {

	public static void main(String[] args) {
		
		Factorial f=new Factorial();
		for(int i=0;i<=10;i++)
		{
			int res=f.fact(i);
			System.out.println(i + " != " + res);
		}
	}

	private int fact(int n) {
		if(n==1 ||n==0)
		{
			return 1;	
		}
		int x=n*fact(n-1);
		return x;
	}

}
