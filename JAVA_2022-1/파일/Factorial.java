import java.util.Scanner;
public class Factorial{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.print("n�� �Է��ϱ� : ");
		int n = scan.nextInt();
        int result = 1;
		for(int i = 1; i <= n; i++){ //���� ���� �� ���ϱ�
            result *= i;
		}
        System.out.print("n! = "+ result);
   	}
}