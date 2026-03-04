import java.util.Scanner;

class SumOfOdd{
	public static void main(String[] args){
		Scanner input =new Scanner(System.in);
		int n;
		System.out.println("Enter your number: ");
		n = input.nextInt();
		SumOfOdd(n);
	}

	public static void SumOfOdd(int n){

		int sum = 0;
		int i = 1;
		while( i <= n){
			if(i % 2 != 0){
				sum += i;
			}
			i++;

		}
		System.out.println("sum of odd nos are: " + sum );
	}
}







/*import java.util.Scanner;

class SumOfOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your number: ");
        int n = input.nextInt();

        sumOfOdd(n);
    }

    public static void sumOfOdd(int n) {
        int sum = 0;
        int i = 1;

        while (i <= n) {
            if (i % 2 != 0) {
                sum = sum + i;
            }
            i++;
        }

        System.out.println("Your sum of odd numbers is: " + sum);
    }
}
*/
