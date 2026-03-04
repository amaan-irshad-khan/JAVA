class ThisDemo{
	int  age;
	String name;
	String college;
	ThisDemo(int x){
		age = x;
	}

	ThisDemo(int x, String y){
		this(x);
		name = y;
	}

	ThisDemo(int x, String y, String z){
		this(x,y);
		college = z;
	}
}


class ThisDemoTester{
	public static void main(String[] args){
		ThisDemo td1 = new ThisDemo(20);
		ThisDemo td2 =  new ThisDemo(30, "chota bheem");
		ThisDemo td3 = new ThisDemo(40, "Zaid kinnar", "GB road Nivasi");
		System.out.println(td1.age);
		System.out.println(td2.age+ " " +td2.name);
		System.out.println(td3.age + " " +td3.name + " " + td3.college);
	}
}
