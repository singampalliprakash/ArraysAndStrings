package arraysAndStrings;

public class SortAStringUsingMergeSort {

	private static void merge(char[] arr, int l, int mid, int r) {
		
		int n1=mid-l+1;
		int n2=r-mid;
		char lArr[]=new char[n1];
		char[] rArr=new char[n2];
		
		for(int x=0;x<n1;x++)
		{
			lArr[x]=arr[l+x];
		}
		for(int y=0;y<n2;y++)
		{
			rArr[y]=arr[mid+1+y];
		}
		
		int i=0;
		int j=0;
		int k=l;
		while(i<n1&&j<n2)
		{
			if(lArr[i]<rArr[j])
			{
				arr[k]=lArr[i];
				i++;
			}
			else
			{
				arr[k]=rArr[j];
				j++;
			}
			k++;
		}
		
		
		while(i<n1)
		{
			arr[k]=lArr[i];
			i++;
			k++;
		}
		while(j<n2)
		{
			arr[k]=rArr[j];
			j++;
			k++;
		}
		
		
	}
	
	
	public static void mergerSort(char[] arr,int l,int r)
	{
		if(l<r)
		{
		int mid=(l+r)/2;
		mergerSort(arr, l, mid);
		mergerSort(arr, mid+1, r);
		merge(arr,l,mid,r);
		}
	}
	
	
	public static void print(char[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i] +" ");
		}
		System.out.println();
	}


	public static void main(String[] args) {
		String s= "geeksforgeeks";
		char[] arr=s.toCharArray();
		print(arr);
		 
		SortAStringUsingMergeSort me=new SortAStringUsingMergeSort();
		me.mergerSort(arr, 0, arr.length-1);
		print(arr);
			

	}

}
