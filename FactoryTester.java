/*class FactoryDemo{
	int age;
	String name;
	private FactoryDemo(int a, String s){
		age = a;
		name = s;
	}
	public static FactoryDemo factory(int x, String y){
		return new FactoryDemo(x,y);
	}
}

class FactoryTester{
	public static void main(String[] args){
		FactoryDemo fd1 = FactoryDemo.factory(20,"Neeraj");
		FactoryDemo fd2 = FactoryDemo.factory(30, "rahul");
		System.out.println(fd1.age + " " +fd1.name);
		System.out.println(fd2.age + " " +fd2.age);
	}
} 
*/


/*class FactoryDemo{
        int age;
        String name;
	public static FactoryDemo fd = null;
        private FactoryDemo(int a, String s){
                age = a;
                name = s;
        }
        public static FactoryDemo factory(int x, String y){
                if(fd == null){
			fd = new FactoryDemo(x,y);
		}
		return fd;
        }
}

class FactoryTester{
        public static void main(String[] args){
                FactoryDemo fd1 = FactoryDemo.factory(20,"Neeraj");
                FactoryDemo fd2 = FactoryDemo.factory(30, "rahul");
                System.out.println(fd1.age + " " +fd1.name);
                System.out.println(fd2.age + " " +fd2.name);
        }
}

*/





class FactoryDemo{
	public static FactoryDemo fd;
	public int age;
	static{
		fd = new FctoryDemo();
	}
	private FactoryDemo(){ age = 20;}
	public void main(){
		System.out.println("Show method");
	}
}


class FactoryTester{
	public static void main(String[] args){
		FactoryDemo.fd.show();
		System.out.println(FactoryDemo.fd.age);
		FactoryDemo.fd.age = 30;
		System.out.println(FactoryDemo.fd.age);
	}
}
