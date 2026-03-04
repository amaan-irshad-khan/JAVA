class LocalVariableTest{
	void printer(){
/*		int i=0;
		int j;
		System.out.println(i);
//
		System.out.println(j);
*/

		int i=10;
		if(true){
//			int i = 20;    (its wrong ; one var can only be defined once in a method)
			System.out.println(i);
		}
		System.out.println(i);

	}
	public static void main(String[] args){
		LocalVariableTest it = new LocalVariableTest();
		it.printer();
	}
}
