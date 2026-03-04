/*class Tester{
	public static void main(String[] args){
//		Outer ot = new Outer("Manoj Kr");
//		Outer.Inner it = ot.new Inner(20);
		Outer.Inner it = new Outer("Manoj Kr").new Inner(20);
		it.printer();
	}
}
*/




/*class Outer {
    static private String name;
    
    Outer(String s) {  // Added braces + body
        name = s;
    }
    
    class Inner {
        private int age;
        Inner(int a) {
            age = a;
        }
        public void printer() {
            System.out.println(age);      // 20
            System.out.println(name);     // Manoj Kr
        }
    }
}*/

/*class Tester {
    public static void main(String[] args) {
        Outer.Inner it = new Outer("Manoj Kr").new Inner(20);
        it.printer();
    }
}

*/


/*public class Tester{
	public static void main(String[] args){
		Sealed1 sa = new  Sealed1();
		SealedChild st = new SealedChild();
		sa.display();
		sa.printer();
		st.show();
	}
}
*/


class Tester{
	public static void main(String[] args){
		Outer ot = new Outer("Manoj Kumar");
		Outer.Inner it = ot.new Inner(20);
		it.printer();
	}
}

