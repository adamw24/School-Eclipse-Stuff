import java.util.*;

public class Calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner In = new Scanner(System.in);
		System.out.print("day: ");
		int d = In.nextInt();
		System.out.print("sunday: ");
		int s = In.nextInt();
		startSpace(s);
		num(d, s);
		int date = num(d, s);
		endSpace(date);
		In.close();
	}

	public static int num(int d, int s) {
		int date;
		for (int i = 1; i <= d; i++) {
			date = (8 - s) % 7;
			// number of whole weeks, s<= d so stop when no next week
			System.out.print("|");
			for (; date < 7 && i <= d; date++, i++) {
				// date keeps track of printing 7 numbers for each day of the week (8 - s) % 7
				// is for the half week at the start
				// && s<=d stops it in the middle of week so doesn't keep printing until the end
				// of week
				printDay(i);
			}
			System.out.println("");
			i--;
			s = 8;
			// after first partial week, s=8 so d will always start at 0, thus would print 7
			// days.
		}
		startSpace(s);
		return date;
	}

	public static void startSpace(int s) {
		for (int empty = 0; empty < (8 - s) % 7; empty++) {
			System.out.print("|      ");
		}

	}

	public static void endSpace(int date) {
		for (int empty = 0; empty < (8 - date) % 7; empty++) {
			System.out.print("      |");
		}

	}

	public static void printDay(int day) {
		System.out.printf("  %2d  |", day);
		// printf does padding with the digits
	}

}
