import java.util.*;
public class ButtonPressKickstart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i =1; i <=4; i++){
			for (int j=1; j<=i+1; j++){
				System.out.print("*");
			}
			int k=1;
			for (; k<=9 && k<=13-3*i; k++){
				System.out.print(k);
			}
			for (; k<=13-3*i; k++){
				System.out.print(0);
			}
			for (int j=1; j<=2*i; j++){
				System.out.print("*");
			}
			System.out.println();

		}		
		}
	}
