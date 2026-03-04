/*public class MyClass{
	public static void main(String[] args){
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		t1.start();
		t2.start();
	}
}*/

class MyClass{
	int x = 10;
	static{
		MyClass m1 =  new MyClass();
		System.out.println(m1.x);
	}
}
