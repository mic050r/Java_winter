import java.util.Scanner;
public class SwitchExam1{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.print("�а� �Է� : ");
		int major = scan.nextInt();	
		//1:����Ʈ 3. ���� 3. ������
		switch(major) {
			case 1: System.out.println("���̵�����Ʈ�����"); break;
			case 2: System.out.println("���̵�����ַ�ǰ�"); break;
			case 3 :System.out.println("���̵������ΰ�"); break;
			default: System.out.println("�߸��� �Է��Դϴ�."); 
		}


	}
}