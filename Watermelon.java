import java.util.Scanner;
	public class Watermelon{
		public static void main(String args[]){
			Scanner scan = new Scanner(System.in);
			final double PI = 3.14;
			System.out.print("������ : ");
			int r = scan.nextInt();
			double cir = r*r*PI;
			System.out.print("��������"+ r +"�� ���� �ܸ��� ����: "+cir);
		}
}