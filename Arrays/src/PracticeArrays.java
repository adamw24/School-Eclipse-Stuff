import java.util.*;
public class PracticeArrays {
	public static void main(String [] args) {
		//1a
		int[] array = new int [8];
		//2a
		for (int i = 0; i<8; i++) {
			array[i] = i*i;
		}
		//2b
		int[] array2b = new int [8];
		for (int i = 0; i<8; i++) {
			array2b[i] = i*i;
		}
		//2c
		int[] array2c = new int [5];
		for (int i = 0; i<5; i++) {
			array2c[i] = i;
		}
		
		//2d
		Scanner in = new Scanner(System.in);
		double[] array2d = new double[5];
		for (int i = 0; i<5; i ++) {
			System.out.print("Insert a number: ");
			array2d[i] = in.nextDouble();
			System.out.println();
		}
		System.out.println(Arrays.toString(array2d));
		
		
	}
}
