public class VarTypeTest1{
   public static void main(String args[]){
              //���� 1.byte, 8��Ʈ, |(-128~127) �ܵ��� �������� ���ϴ°��� ������ ����
             //byte hakgub = 18;
             //System.out.println(hakgub);
             byte b1 = 20;
             byte b2 = 30;
             //byte b3 = b1 + b2;
             //System.out.println(b3);
            //���� 2.short, 16��Ʈ (-32768~32767)
            //short s1 = 300;
            //short s2 = 1000;
            //short s3 = 2000;
            //short s4 = s2 + s3;
            //System.out.println("�츮 �б� �������� : " + s1);



           //���� 3.int, 32��Ʈ (-2147483648~2147483647) 
           int n1 = 2147483647;
           int n2 = 1;
           int n3 = n1 + n2;
           System.out.println(n1);
           System.out.println(n2);
           System.out.println(n3);
           //�Ǽ� 4.double 123.456=> 1.23456*102
          float f1 = 12.3456F;
          float f2 =345.678F;
          float f3 =f1+f2;
          System.out.println(f1);
          System.out.println(f2);

          double d1 = 0.00000000000000000123456789;
          System.out.println(d1);
     
   }
}