package arraysAndStrings;

public class SumOfEvennumber {

	public static void main(String[] args) {
		int number=9715028;
		char[] digits=String.valueOf(number).toCharArray();   //to convert a number into array or intdividual digits/.
		
		int evensum=0;
		int oddsum=0;
		for(int i=0;i<digits.length;i++)	
		{
			int numb=digits[i]-'0';  //it will convert the character into integer
			if(i%2==0)
			{
				evensum+=numb;
			}
			else
			{
				oddsum+=numb;
			}
		}
		
		int diff=evensum-oddsum;
		System.out.println(diff);
		}

	}


