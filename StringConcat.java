import java.util.*;
class StringConcat{
	public static void main(String[] args){
		String firstName = "Amaan";
		String lastName = "Khan";
		String fullName =  firstName.concat(" ").concat(lastName);
		System.out.println(fullName.toUpperCase());
	}
}
