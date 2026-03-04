class MethodLocalDemo{
	int age = 20;
	public void caller(){
//	public LocalDemo caller(){
		class LocalDemo{
			String name =  "Ajay Sing";
			public void display(){
				System.out.println(name);
				System.out.println(age);
			}
		}
		LocalDemo ld = new LocalDemo();
		ld.display();
//		return new LocalDemo();
	}
}

