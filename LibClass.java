interface MyInterface{
//	void printer();
	void printer(String s);
}

class LibClass{
//	public void caller(MyInterface mi){
	public void caller(MyInterface mi, String s){
		mi.printer(s);
	}
}
