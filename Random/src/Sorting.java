
public class Sorting {

	public Sorting() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5,3,6,4,6,6};
		System.out.print(isSorted(arr[]));
		
	}
	public boolean isSorted(int[] arr) {
			for (int i=0; i<arr.length-1; i++) {
				if (arr[i]>arr[i+1]) {
					return false;
				}
			}
			return true;
	}

}
