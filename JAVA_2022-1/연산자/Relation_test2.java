import java.util.Scanner;
public class Relation_test2{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int age = scan.nextInt(); 
		if (age>=19) {
			System.out.println("����");
		}else{ //age<19
			System.out.println("û�ҳ�");
		}
	}
}