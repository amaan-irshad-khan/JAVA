sealed interface MyInterface permits A{
	void printer();
}

final class A implements MyInterface{
	public  void printer(){
		System.out.println("Printer");
	}
}

class Tester2{
	public static void main(String[] args){
		A a = new A();
		a.printer();
	}
}
