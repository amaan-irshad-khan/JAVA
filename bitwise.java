import java.util.Scanner;


class bitwise{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int n;
		System.out.println("Enter the number");
		n = input.nextInt();
		if((n & 1) == 1){
			System.out.println("The no. is odd");
		}else{
			System.out.println("The no. is even");
		}
		System.out.println();
	}
} 

