import java.util.*;

public class RockPaperScissors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		start();
		for (int i=0; i<10; i++) {
		String computerChoice = computer();
		System.out.print("Your choice: ");
		String s = in.nextLine();
		s = s.toLowerCase();
		String result = comparison(s, computerChoice);
		System.out.println("The computer chose "+ computerChoice + ".");
		System.out.println(result);
		}
		in.close();

	}

	public static void start() {
		System.out.println("Hello, welcome to Rock Paper Scissors but the Elements Version!");
		System.out.println();
		System.out.println("Here, the options are Fire, Water, Earth, Air, and Light:");
		System.out.println("Water beats Fire and Air");
		System.out.println("Fire beats Earth and Light.");
		System.out.println("Earth beats Light and Water");
		System.out.println("Air beats Fire and Earth.");
		System.out.println("Light beats Water and Air.");
		System.out.println();
	}

	public static String computer() {
		Random r = new Random();
		String computerGuess = "";
		int v = r.nextInt(5);
		if (v == 0) {
			computerGuess = "fire";
		} else if (v == 1) {
			computerGuess = "water";
		} else if (v == 2) {
			computerGuess = "earth";
		} else if (v == 3) {
			computerGuess = "air";
		} else {
			computerGuess = "light";
		}
		return computerGuess;

	}

	public static String comparison(String u, String c) {
		String result = "";
		if (u.equals(c)) {
			return  "Tie";
		}
		if (u.equals("water") && c.equals("fire") || u.equals("water") && c.equals("air")) {
			result = "You Won! :)";
		} else if (u.contentEquals("water")) {
			result = "You Lost :(";
		} else if (u.equals("fire") && c.equals("earth") || u.equals("fire") && c.equals("air")) {
			result = "You Won! :)";
		} else if (u.equals("fire")) {
			result = "You Lost :(";
		} else if (u.equals("earth") && c.equals("light") || u.equals("earth") && c.equals("water")) {
			result = "You Won! :)";
		} else if (u.equals("earth")) {
			result = "You Lost :(";
		} else if (u.equals("air") && c.equals("fire") || u.equals("air") && c.equals("earth")) {
			result = "You Won! :)";
		} else if (u.equals("air")) {
			result = "You Lost :(";
		} else if (u.equals("light") && c.equals("water") || u.equals("light") && c.equals("air")) {
			result = "You Won! :)";
		} else if (u.equals("light")) {
			result = "You Lost :(";
		}
		return result;
	}
}
