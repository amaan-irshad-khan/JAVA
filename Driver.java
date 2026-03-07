public class Driver{
	public static void main(String[] args){

		Car mc = new Car();
		mc.drive();
		System.out.println(mc.currentFuelInLiters);
		mc.addFuel(6);
		mc.drive();
		mc.drive();
		mc.drive();
		
	}
}
