class LibTester{
	public static void main(String[] args){
		LibClass ls = new LibClass();
	//	ls.caller(() -> {System.out.println("Hello");});
	//	MyInterface mi = () -> {System.out.println("Hello");};\
		MyInterface mi  = s -> System.out.println(s);
		ls.caller(mi,"Lucknow");
	}
}
