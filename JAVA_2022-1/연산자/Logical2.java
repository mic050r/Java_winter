/*Ű����κ��� ����, ����(��:0,��:1) �Է¹޾�
���̰� 19�� �̸��̰� ������ ��� ������� 20%����
�̶� ����� �ݾ� = 50000��, �ݵ�� ��� ����, ��, �������, if*/
import java.util.Scanner;
public class Logical2{
	public static void main(String args[]){
	Scanner scan = new Scanner(System.in); 	
		final int M =50000;	
		int result = (int)(M*0.8);
		System.out.print("������ �Է��Ͻÿ�(��:0,��:1) : ");
		int sex = scan.nextInt();
		System.out.print("���̸� �Է��Ͻÿ� : ");
		int age = scan.nextInt();
			if((age<19)&&(sex==1)){ 
				System.out.print("����� �ݾ��� " + result+"�� �Դϴ�.");
			}else{
				System.out.print("����� �ݾ��� " + M +"�� �Դϴ�.");
			}
	}
}