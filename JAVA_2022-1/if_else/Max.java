import java.util.Scanner;
public class Max{
	public static void main(String args[]){
			Scanner sc=new Scanner(System.in);
			System.out.print("ù ��° �� �Է� : ");
			int n1 = sc.nextInt();

			System.out.print("�� ��° �� �Է� : ");
			int n2 = sc.nextInt();
			if(n1<n2) {
				System.out.print(n1+"�� "+n2+"�� ū���� "+n2+"�Դϴ�.");
			}else{
				System.out.print(n1+"�� "+n2+"�� ū���� "+n1+"�Դϴ�.");
					}
			
	}
}