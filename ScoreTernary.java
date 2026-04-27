import java.util.Scanner;

class ScoreTernary{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the score: ");
		int score = in.nextInt();
		String cat = score > 80 ? "High" : (score > 50 ? "Moderate" : "Low");
		System.out.println("Your category is: "  + score);
	}
}
