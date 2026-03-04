class ThisDemo{
	private int x;
	ThisDemo(int a){
		x=a;
	}

	public void display(){
		System.out.println(this.x);
	}
}

class ThisTester{
	public static void main(String[] args){
		ThisDemo dd = new ThisDemo(50);
		dd.display();
		ThisDemo dd2 = new ThisDemo(20);
		dd2.display();
	}
}
