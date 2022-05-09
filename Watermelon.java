import java.util.Scanner;
	public class Watermelon{
		public static void main(String args[]){
			Scanner scan = new Scanner(System.in);
			final double PI = 3.14;
			System.out.print("반지름: ");
			int r = scan.nextInt();
			double cir = r*r*PI;
			System.out.print("반지름이"+ r +"인 수박 단면의 넗이: "+cir);
		}
}
