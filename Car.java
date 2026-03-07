public class Car{
	int noOfWheels;

	String color;

	float maxSpeed;

	float currentFuelInLiters;

	int noOfSeats;

	public void drive(){
		if(currentFuelInLiters == 0){
			System.out.println("Car is out of fuel");
		}else if(currentFuelInLiters <= 5){
			System.out.println("Car is low on fuel please refuel");
		}else{
			System.out.println("Car is driving");
			currentFuelInLiters--;
		}
	}

	public void addFuel(float fuel){
		System.out.println("Car is being Fueled");
		currentFuelInLiters += fuel;
	}
}
