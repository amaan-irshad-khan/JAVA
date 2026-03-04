/*class FactTest{
	public int fact(int n){
		if(n==0 || n==1)return1;
		return n*fact(n-1);
	}
}*/



class FactTest{
	public int power(int a, int n){
		if(n==0) return 1;
		if(n==1) return a;
		return a*power(0,n-1);
	}
}
