package arraysAndStrings;

public class Car {
	
	//encapsulation
		String colour;
		int Speed;
		void drive()
		{
			System.out.println("it can be drive the car is in condition whith colour of " + colour);
		}
		void brake()
		{
			
			System.out.println("brakes fail because of speed exceeds " +Speed);
		}

	public static void main(String[] args) {
		Car myCar=new Car();
		myCar.colour="green";
		myCar.Speed=125;
		myCar.drive();
		myCar.brake();
		

	}

}
