import java.util.Scanner;

class FactNum{
	public static void main(String[] args){
		System.out.println("Enter ypur number: ");
		int n;
		Scanner input = new Scanner(System.in);
		n = input.nextInt();
		long fact = Factorial(n);
		Factorial(n);
		System.out.println("Factorial is: " + fact);
	}


	public static long Factorial(int n){
		if (n < 2) {
			return 1;
		}
		long fact = 1;
		int i =2;
		while(i <= n){
			fact *= i;
			i++;
		}
		return fact;
	}
}
