import java.util.Scanner;

class MultiplicationTable{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = input.nextInt();
		table(n);
	}

	public static void table(int n){

		int i=1;
		while( i <= 10){
			System.out.println(n + " * " + i + " = " + (n*i));
			i++;
		}
	}
}
