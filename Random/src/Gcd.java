
public class Gcd {

	public static void main(String[] args) {
		System.out.print(simplify(-2, -3, 1));
		// System.out.print(gcdTest(-2,2));
	}

	public static String simplify(int totalNumer, int totalDenom, int totalWhole) {
		String simplified = "";
		int gcd = gcdTest(totalNumer, totalDenom);
		totalNumer = Math.abs(totalNumer);
		totalDenom = Math.abs(totalDenom);
		totalNumer /= gcd;
		totalDenom /= gcd;
		if (totalNumer > totalDenom) {
			totalWhole += totalNumer / totalDenom;
			totalNumer = totalNumer % totalDenom;
		}
		if (totalDenom == 1 || totalNumer == 0) {
			totalWhole += totalNumer;
			simplified = "" + totalWhole;
		} else {
			simplified = "" + totalWhole + "_" + totalNumer + "/" + totalDenom;
		}
		if (totalWhole == 0) {
			simplified = "" + totalNumer + "/" + totalDenom;
		}
		return simplified;
	}

	public static int gcdTest(int totalNumer, int totalDenom) {
		int gcd = 1;
		int smaller = totalNumer;
		if (totalNumer > totalDenom) {
			smaller = totalDenom;
		}
		if (totalNumer == totalDenom) {
			gcd = totalNumer;
		} else {
			for (int g = smaller; g >= 2; g--) {
				if (totalNumer % g == 0 && totalDenom % g == 0) {
					return g;
				}
			}
		}
		return gcd;
	}
}

//Code below is for fail safe
/**
 * @author Mr. Rasmussen
 */

package fracCalc;

import java.util.*;

import org.checkerframework.checker.units.qual.s;

public class FracCalc {
	public static void main(String[] args) {
		System.out.println("Welcome to Fraction Calculator.");
		System.out.println("I can calculate +, -, *, or / .");
		System.out.println("Type \"quit\" to quit the program.");
		System.out.print("Enter here: ");
		Scanner userInput = new Scanner(System.in);
		String input = userInput.nextLine();
		while (input.indexOf("quit") == -1) {
			System.out.println(produceAnswer(input));
			System.out.print("Enter here: ");
			input = userInput.nextLine();
		}
		System.out.println("Program quit.");
		userInput.close();
	}

	public static String produceAnswer(String input) {
		int totalNumer = 0;
		int totalDenom = 1;
		int totalWhole = 0;
		String total = "";
		int numerF = 0;
		int numerS = 0;
		if (input.charAt(0) == ' ') {
			input = input.substring(1);
		}
		int firstSpace = input.indexOf(" ");
		String firstOperand = input.substring(0, firstSpace);
		int wholeF = whole(firstOperand);
		if (wholeF < 0) {
			numerF = -1 * numerator(firstOperand);
		} else {
			numerF = numerator(firstOperand);
		}
		int denomF = denominator(firstOperand);
		String operator = input.substring(firstSpace + 1, firstSpace + 2);
		String secondOperand = input.substring(firstSpace + 3);
		int wholeS = whole(secondOperand);
		if (wholeS < 0) {
			numerS = -1 * numerator(secondOperand);
		} else {
			numerS = numerator(secondOperand);
		}
		int denomS = denominator(secondOperand);
		// the following if and else if statements perform the calculations.
		if (operator.equals("+")) {
			totalWhole = wholeF + wholeS;
			totalNumer = numerF * denomS + numerS * denomF;
			totalDenom = denomF * denomS;
		} else if (operator.equals("-")) {
			totalWhole = wholeF - wholeS;
			totalNumer = numerF * denomS - numerS * denomF;
			totalDenom = denomF * denomS;
		} else if (operator.equals("*")) {
			totalNumer = (wholeF * denomF + numerF) * (wholeS * denomS + numerS);
			totalDenom = denomF * denomS;
		} else {
			totalNumer = (wholeF * denomF + numerF) * denomS;
			totalDenom = denomF * (wholeS * denomS + numerS);
		}
		total = simplify(totalNumer, totalDenom, totalWhole);
		return total;
	}

	public static String simplify(int totalNumer, int totalDenom, int totalWhole) {
		String simplified = "";
		int gcd = gcdTest(totalNumer, totalDenom);
		totalNumer /= gcd;
		totalDenom /= gcd;
		if (totalDenom <0) {
			totalDenom = Math.abs(totalDenom);
			if (totalNumer < 0) {
				totalNumer = Math.abs(totalNumer);
			}else {
				totalNumer = -1 * totalNumer;
			}
		}
		if (Math.abs(totalNumer) >= totalDenom) {
			totalWhole += totalNumer / totalDenom;
			totalNumer = totalNumer % totalDenom;
		}
		totalNumer = Math.abs(totalNumer);
		if (totalDenom == 1 || totalNumer == 0) {
			totalWhole += totalNumer;
			simplified = "" + totalWhole;
		} else {
			simplified = "" + totalWhole + "_" + totalNumer + "/" + totalDenom;	
		}
		if (totalWhole == 0) {
			if (totalNumer == 0){
				simplified = "0";
			}else {
				simplified = "" + totalNumer + "/" + totalDenom;
			}
		}
		return simplified;
	}

	// The following method returns the GCD of the numerator and denominator
	public static int gcdTest(int totalNumer, int totalDenom) {
		int gcd = 1;
		totalNumer = Math.abs(totalNumer);
		totalDenom = Math.abs(totalDenom);
		int smaller = totalNumer;
		if (totalNumer > totalDenom) {
			smaller = totalDenom;
		}
		if (totalNumer == totalDenom) {
			gcd = totalNumer;
		} else {
			for (int g = smaller; g >= 2; g--) {
				if (totalNumer % g == 0 && totalDenom % g == 0) {
					return g;
				}
			}
		}
		return gcd;
	}

	// The following method parses the whole from the user input
	public static int whole(String operand) {
		int whole = 0;
		if (operand.indexOf("_") != -1) {
			whole = Integer.parseInt(operand.substring(0, operand.indexOf("_")));
		} else if (operand.indexOf("/") == -1) {
			whole = Integer.parseInt(operand);
		}
		return whole;
	}

	// The following method parses the numerator from the user input
	public static int numerator(String operand) {
		int numer = 0;
		if (operand.indexOf("/") != -1) {
			numer = Integer.parseInt(operand.substring(operand.indexOf("_") + 1, operand.indexOf("/")));
		}
		return numer;
	}

	// The following method parses the denominator from the user input
	public static int denominator(String operand) {
		int denom = 1;
		if (operand.indexOf("/") != -1) {
			denom = Integer.parseInt(operand.substring(operand.indexOf("/") + 1));
		}
		return denom;
	}

}
