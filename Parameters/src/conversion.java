
public class conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		feetToMeters(10.7);
	}
	public static void feetToMeters(double x) {
	
		double meter = 0.3048 * x;
		
		System.out.print(x + " feet is " + meter + " meters.");
		
	}
}