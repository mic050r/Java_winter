import java.util.Scanner;
public class IfExam2{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.print("�����ڸ� �Է��ϼ��� : ");
		int a = 20, b =10; 
		String op = scan.next();
		if(op.equals("+")) {
			System.out.println( a+"+"+b+"="+(a+b));
		}else if(op.equals("-")) {
			System.out.println( a+"-"+b+"="+(a-b)); 
		}else if(op.equals("*")) {
			System.out.println( a+"*"+b+"="+(a*b));
		}else if(op.equals("/")) {
			System.out.println( a+"/"+b+"="+(a/b));
		}else{
			System.out.println("��Ģ�����ڰ� �ƴմϴ�.");
		}
	
	}
}