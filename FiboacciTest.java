class FibonacciTest{
	int  fib(int n){
		if(n == 0||n ==1) return 1;
		return fib(n-1) + fib(n-2);
	}

	public staic void main(String[] args){
		FibonacciTest ft = new FibonacciTest();
		int result = ft.fib(50);
		System.out.print;n(result);
	}
}
