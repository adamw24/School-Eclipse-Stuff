import java.util.Arrays;

public class MergeSort {

	public MergeSort() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1, 5, 7, 9, 10 };
		int[] b = { 2, 3, 4 };
		int[] result = merge(a, b);
		System.out.println(Arrays.toString(result));
	}

	public static int[] merge(int[] a, int[] b) {
		int[] sorted = new int[a.length + b.length];
		int indexA = 0;
		int indexB = 0;
		for (int i = 0; i < sorted.length; i++) {
			if (indexA >= a.length) {
				sorted[i] = b[indexB];
				indexB++;
			} else if (indexB >= b.length) {
				sorted[i] = a[indexA];
				indexA++;
			} else if (a[indexA] <= b[indexB]) {
				sorted[i] = a[indexA];
				indexA++;
			} else {
				sorted[i] = b[indexB];
				indexB++;
			}

		}
		return sorted;
	}

}
