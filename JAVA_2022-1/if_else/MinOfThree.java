import java.util.Scanner;
public class MinOfThree{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		/*System.out.print("���� 3�� �Է� : ");
		int n1 = sc.nextInt(); 
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		System.out.print("���� ���� ���� ");
		if(n1>n2){
			if(n2>n3) {
				System.out.println("n3");
			}else{
				System.out.println(n2);
			}
		}else{
			if(n1<n3){
				System.out.println(n1);
			}else{
				System.out.println(n3);
			}
		}
	}
}*/
		System.out.print("ù ��° �� �Է� : ");
			int n1 = sc.nextInt();
		System.out.print("�� ��° �� �Է� : ");
			int n2 = sc.nextInt();
		System.out.print("�� ��° �� �Է� : ");
			int n3 = sc.nextInt();
				if(n1<n2) {
					if(n1<n3)
						System.out.println(n1+"�� "+n2+"�� "+n3 +" �� ���� ���� ���� "+n1+"�Դϴ�.");
				}else if(n2<n1){
					if(n2<n3)
						System.out.println(n1+"�� "+n2+"�� "+n3 +" �� ���� ���� ���� "+n2+"�Դϴ�.");
				}else if(n3<n1){
					if(n3<n2)
						System.out.println(n1+"�� "+n2+"�� "+n3 +" �� ���� ���� ���� "+n2+"�Դϴ�.");
				}
	}
}
