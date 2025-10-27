package arraysAndStrings;

public class MissingNumberAndRepeatingNmber {
	public static void missingNumberAndRepeatingNumber(int[] arr)
	{
		
		int missing=-1;
		int repeating=-1;
		int n=arr.length;
		
		for(int i=1;i<n;i++)
		{
			int count=0;
			for(int j=0;j<n;j++)
			{
				if(arr[j]==i)
				{
					count++;
				}
				
				
			}
			if(count==0)
			{
				missing=i;
			}
			else if(count>1)
			{
				repeating=i;
			}
		
			
			
		}
		System.out.println(missing);
		System.out.println(repeating);
		
		
	}

	public static void main(Stringx[] args) {
		int[] arr = {8, 2, 4, 5, 3, 7, 1, 5};
		missingNumberAndRepeatingNumber(arr);

	}

}
