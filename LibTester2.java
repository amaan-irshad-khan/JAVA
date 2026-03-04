class LibTester2{
	public static void main(String[] args){
		LibClass2 ls = new LibClass2();
		MyInterface mi = (x,y)-> x+y;
		ls.caller(mi,10,20);
	}
} 
