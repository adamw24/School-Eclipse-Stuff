
public class Dates {
	private int totalDays;
	public void TimeSpan(int weeks, int days) {
		totalDays = 0;
		add(weeks, days);
	}
	public void add(int weeks, int days) {
		totalDays += 7 * weeks + days;
	}
	public String toString() {
		return (totalDays/7) + "weeks and " + (totalDays%7) + " days.";
	}
}




