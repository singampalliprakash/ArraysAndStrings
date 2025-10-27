package arraysAndStrings;

import java.util.Arrays;

public class MoveZeros {
	public static void moveZeroes(int nums[])
	{
		int inc=0;
		for(int val:nums)
		{
			if(val!=0)
			{
				nums[inc]=val;
				inc++;
			}
		}
		while(inc<nums.length)
		{
			nums[inc]=0;
			inc++;
		}
	}
	public static void main(Stringx[] args) {
		int[] nums= {0,1,0,3,12};
		moveZeroes(nums);
		System.out.println(Arrays.toString(nums));
		

	}

}
