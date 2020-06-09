
public class sequences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int SIZE = 4;
			for (int line= 1; line <= SIZE; line ++) {
				for (int space =2; space< 2*line ; space++ ) {
					System.out.print("  ");
				}
				for (int dash=1; dash <= (5*SIZE-1)-4*line; dash ++){
					System.out.print("-");
				}
				System.out.println();
				
			}
	}

}
