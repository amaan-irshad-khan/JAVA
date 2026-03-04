/*public interface MyInterface{
	public static final int  x = 10;
	public abstract void display();
}


class MyClass implements MyInterface{
	public void display(){
		System.out.println("Display method");
	}
}
*/

/*class MainDemo{
	public static void main(String[] args){
		MyClass m1 = new MyClass();
		m1.display();
	}
}*/



/*public interface MyInterface{
	void display();
	void show();
	void printer();
}

public class AdapterDemo implements MyInterface{
	public void display(){}
	public void show(){}
	public void printer(){}
}
*/



/*interface MyInterface{
	default void my method(){
		System.out.println("my mthod");
	}
	default void display(){}
	default void show(){}
	default void print(){}
}


class NoAdapterDemo implements MyInterface{
	public void display(){
		System.out.println("Display method");
	}
}*/






/*interface MyInterface{
        static void my method(){
                System.out.println("my mthod");
        }
        default void display(){}
        default void show(){}
        default void print(){}
}


class NoAdapterDemo implements MyInterface{
        public void display(){
                System.out.println("Display method");
        }

	public void mymethod(){
		System.out.println("mymethod of class");
	}
}
}

*/



/*interface MyInterface{
	void m1();
}

*/

/*interface MyInterface{
	void display();
}
