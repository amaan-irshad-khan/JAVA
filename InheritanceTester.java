/*class Parent{
	public void show(){
		System.out.println("Show of parent");
	}

	private void display(){
		System.out.println("Display of Parent");
	}
}

class Child extends Parent{
	void printer(){
		System.out.println("Printer of child");
	}
}



class InheritanceTester{
	public static void main(String[] args){
		Parent p = new Parent();
		p.show();
//		p.display();
		Child ch  = new Child();
		ch.show();
//		ch.display();
		ch.printer();
	}
}
*/




class Parent{
        public void show(){
                System.out.println("Show of parent");
        }

        private void display(){
                System.out.println("Display of Parent");
        }
	Parent(int x){ System.out.println("Constructor of parent");}
}

class Child extends Parent{
        void printer(){
                System.out.println("Printer of child");
        }
	Child(){
		super(5);
		System.out.println("Constructor of Child");}
//		super(5); if we call super at the end it will give us an error cause child's first task is to call parents constructor but here its at the  last
}



class InheritanceTester{
        public static void main(String[] args){
 /*               Parent p = new Parent();
                p.show();
                p.display();*/
                Child ch  = new Child();
                ch.show();
//              ch.display();
                ch.printer();
        }
}
