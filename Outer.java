class Outer{
	private String name;
	Outer(String s){
		name = s;
	}

	class Inner{
		private int age;
			Inner(int a) {
			age = a;
		}

		public void printer(){
			System.out.println(age);
			System.out.println(name);
		}
	}
}
