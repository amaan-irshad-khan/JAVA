import java.util.Scanner;

class Calculator{
	public static void main(String[] args){

	System.out.println("Welcome to my calculator: ");
	Scanner input = new Scanner(System.in);
	System.out.println("Enter your number: ");

	int first = input.nextInt();
	int second = input.nextInt();

	int sum = first + second;

	System.out.println("The sum is: " + sum);
	}
}
