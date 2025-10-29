package arraysAndStrings;

public class SingleInheritance {

	public static void main(String[] args) {
		ElectricCar ec=new ElectricCar();
		ec.start();
		ec.charging();	

	}
}
	class car
	{
		String brand="Toyato";
		
		void start()
		{
			System.out.println(brand + " car is starting");
		}
	}
	class ElectricCar extends car
	{
		int batterylevel=90;
		void charging()
			{
			System.out.println("charging...battery level " +batterylevel);
		}	
	}


