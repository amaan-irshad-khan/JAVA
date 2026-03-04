class Outer2{
	private String name = "Amit singh";
		MyInterface mi = new MyInterface(){
			public void display(){
				System.out.println(name);
			}
		};
}
