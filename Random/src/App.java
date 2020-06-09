import java.util.Random;
public class App {
	public static int linearSearch(int[] arr, int value) {
		int start = 0;
		int end = arr.length-1;
//		for (int i = 0; i<; i++) {
//			if (arr[i] == value) {
//				return i;
//			}
//		}
		return -1;
	}
	public static void main(String[] args) {
		int[] arr = new int[10];
		Random r = new Random();
		for (int i = 0; i<arr.length; i++) {
			arr[i]= r.nextInt(10);
			System.out.print(arr[i]);
		}
		System.out.print("\n");
		System.out.print(linearSearch(arr, 4));
	}
}
