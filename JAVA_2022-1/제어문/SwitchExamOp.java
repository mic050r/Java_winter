import java.util.Scanner;
public class SwitchExamOp{
    public static void main(String args[]){
  	 System.out.print("���� �Է�(���� ������ ���̴� ������ �� ��) : ");
  	 Scanner scan=new Scanner(System.in);
  	    int a=scan.nextInt();
  	    String op=scan.next();
   	    int b=scan.nextInt();
 	    switch(op){
      		 case "+":  System.out.println(a+" + "+b+" = "+(a+b));break;
      		 case "-":  System.out.println(a+" - "+b+" = "+(a-b));break;
       		 case "*":  System.out.println(a+" * "+b+" = "+(a*b));break;
       		 case "/":  System.out.println(a+" / "+b+" = "+(a/b));break;
       		 default: System.out.println("��Ģ �����ڰ� �ƴմϴ�.");
   }
   
   }
}