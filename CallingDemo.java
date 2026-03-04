class CallingDemo{
	void printer(){
		System.out.println("printer");
	}

	static void display(){
		System.out.println("static display");
	}

	void caller(){
		CallingDemo cd=new CallingDemo();
		printer();
		display();
		//CallingDemo.printer();
		CallingDemo.display();
		cd.printer();
		cd.display();
	}

	public static void main(String[] args){
		CallingDemo cd1=new CallingDemo();
//		printer();
		display();
//		CallingDemo.printer();
		CallingDemo.display();
		cd1.printer();
		cd1.display();
		cd1.caller();
	}
}
