import java.util.*;
public class Abc {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);
		System.out.println("Welcome to my Echo Program!");
		System.out.print("Give me a number: ");
		int value = userInput.nextInt();
		
		System.out.println("Thanks! Your number is " + value);
		
		userInput.close();
		
	}

}
