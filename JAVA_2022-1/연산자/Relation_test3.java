import java.util.Scanner;
public class Relation_test3{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("���̸� �Է��ϼ��� : ");
		int age = sc.nextInt();
		String result=(age>=19) ? "����" : "û�ҳ�";
		System.out.print("����� " + result + " �Դϴ�.");
		
		/*System.out.print("���� �Է� : ");
		int age = scan.nextInt(); 
		int  b = 19;
		String y="û�ҳ�";
		String a="����";
		String c = (age<b) ? y:a;
		System.out.println(c);
		int age;
		String result;
		System.out.print("���� �Է� :");
		age=scan.nextInt();
		result=(age>=19)?"����":"û�ҳ�";
		System.out.println("�����" +result+"�Դϴ�."); 
		*/
	}
}