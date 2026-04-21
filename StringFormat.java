import java.util.*;

public class StringFormat{
	public static void main(String... args){
		String name = "Amaaan";
		int marks = 45;
		System.out.println("Hello mate " + name + " your marks are " + marks);

		System.out.printf("Hello buddy %-10s , your marks are:  %d, %n", name, marks);
		// 10s is used for spacing while %n is used for neew line

	}
} 
