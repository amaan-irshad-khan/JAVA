class {		// factory method
	int age;
	private DemoFactory(){
		age = 20;
	}

	public void display(){
		System.out.println("display method");
	}
	public static  DemoFactory getInstance(){
		return new DemoFactory();
	}
}

class MainClass{
	public static void main(String[] args){
		DemoFactory dt = DemoFactory.getInstance();
		dt.display();
		System.out.println(dt.age);
	}
}
