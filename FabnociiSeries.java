package arraysAndStrings;

public class FabnociiSeries {
	private int fabnocii(int n) {
		if(n==1 || n==0)
		{
			return 1;
		}
		int x=fabnocii(n-1)+fabnocii(n-2);
		return x;
	}
	

	public static void main(String[] args) {
		FabnociiSeries fb=new FabnociiSeries();
		for(int i=0;i<=10;i++)
		{
			int res=fb.fabnocii(i);
			System.out.println("FabNocii of " +i+ " is " +res);
		}
		
		
		

	}

	

}
