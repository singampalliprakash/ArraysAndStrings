package arraysAndStrings;

public class Robo extends Thread{
	
	//multithreading concept
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("->" +i);
		
		try {
            Thread.sleep(500); // pause for half second
        }
		catch(InterruptedException e) {
            System.out.println(e);
        }
		}
	}

	public static void main(String[] args) {
		Robo r1=new Robo();
		Robo r2=new Robo();
		r1.start();
		r2.start();
		

	}

}
