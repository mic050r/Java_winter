import java.util.Scanner;
	public class Absolute_test{
		public static void main(String args[]){
			Scanner sc = new Scanner(System.in);
			System.out.print("���� �Է� : ");
			int ess = sc.nextInt();
			int asl = ess*(-1);
			int result = (ess<0) ? asl : ess;
			System.out.print(ess+"�� ���밪�� " + result +"�Դϴ�");
	}
}