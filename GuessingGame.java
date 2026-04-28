import java.util.*;

class GuessingGame{
	public static void main(String[] args){
		Random random = new Random();
		int numberToGuess = random.nextInt(100) + 1;

		int userGuess = (int)Math.random();
		Scanner input = new Scanner(System.in);

		System.out.println("Guess the number: ");

		 while( userGuess != numberToGuess){
			userGuess = input.nextInt();

			if(userGuess < numberToGuess){
				System.out.println("Too low! Try again: ");
			}else if(userGuess > numberToGuess){
				System.out.println("Too high! be humble: ");
			}else{
				System.out.println("Booyah! you hit the spot ");
			}
		}
	}
}
