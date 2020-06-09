
public class BubbleSort {

	public BubbleSort() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 21, 5, 2, 17, 10, 11 };
		sequenceSort(array);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		boolean found = binarySearch2(array, 20, 0, array.length-1);
		System.out.println(found);
		/*
		 * MyIntClass val3 = new MyIntClass(10); passRef(val3);
		 * System.out.println(val3);
		 */
	} 

	public static boolean binarySearch2(int[] array, int val, int l, int h) {
		if (l > h) {
			return false;
		}
		int m = (h + l) / 2;
		if (array[m] > val) {
			h = m - 1;
		} else if (array[m] < val) {
			l = m + 1;
		} else {
			return true;
		}
		return binarySearch2(array, val, l, h);
	}

	public static boolean binarySearch(int[] array, int val) {
		int lower = 0;
		int upper = array.length - 1;
		while (lower <= upper) {
			int m = (upper + lower) / 2;
			if (array[m] > val) {
				upper = m - 1;
			} else if (array[m] < val) {
				lower = m + 1;
			} else {
				return true;
			}
		}
		return false;
	}

	private static void bubbleSort(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					swap(array, j, j + 1);
				}
			}
		}
	}

	private static void swap(int[] array, int i, int j) {
		int p = array[j];
		array[j] = array[i];
		array[i] = p;
	}

	public static void sequenceSort(int[] array) {
		int min;
		int index = 0;
		for (int i = 0; i < array.length - 1; i++) {
			min = array[i];
			index = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < min) {
					index = j;
					min = array[j];
				}
			}
			swap(array, i, index);
		}
	}

	private static void passRef(MyIntClass x) {
		x.inc();
		x.print();
	}

	private static void passVal(int x) {
		x++;
		System.out.println(x);
	}
}