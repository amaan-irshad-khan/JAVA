class Pen{
	String color;
	String type;

//	public void write(){
//		System.out.println("Pen is writing something");

	public void printColor(){
		System.out.println(this.color); //jo object call hoga uska color print hoga  thats y this was used
	}


}

/*class Student{
	String name;
	int age;

	public void printInfo(){
		System.out.println(this.name);
		System.out.println(this.age);

	}

}*/

class Student{
	String name;
	int age;

	public void printInfo(){
		System.out.println(this.name);
		System.out.println(this.age);
	}
	Student(String name, int age){
			this.name = name;
			this.age = age;
	}
}



public class PenDemo{
	public static void main(String[] args){
/*		Pen p1 = new Pen();
		p1.color = "Green";
		p1.type = "Fountain";

		Pen p2 = new Pen();
		p2.color = "Blue";
		p2.type = "Ballpoint";

		p1.printColor();
		p2.printColor();

//		p1.write();*/


		Student s1 = new Student("Aliza", 21); /*Student s1 = new Student();
						s1.age = 21;
						s1.name = "Aliza";*/

		Student s2 = new Student("Amaan", 22); /* Student s2 = new Student();
							s2.age = 22;
							s2.name = "Amaan"; */

		/*s1.age = 21;
		s2.age = 22;

		s1.name = "Aliza";
		s2.name = "Amaan";*/

		s1.printInfo();
		s2.printInfo();



	}
}
