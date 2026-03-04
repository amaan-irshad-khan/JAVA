public interface MyInterface{
	public static final int  x = 10;
	public abstract void display();
}


class MyClass implements MyInterface{
	public void display(){
		System.out.println("Display method");
	}
}


class MaionDemo{
	public static void main(String[] args){
		MyClass m1 = new MyClass();
		m1.display();
	}
}
