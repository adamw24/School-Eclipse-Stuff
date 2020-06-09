
public class MyIntClass {
	private int value;
	public MyIntClass(int x) {
		value= x;
	}
	public void inc() {
		value ++;
	}
	public void print() {
		System.out.println(value);
	}

	public String toString() {
		return ""+ value;
	}
}
