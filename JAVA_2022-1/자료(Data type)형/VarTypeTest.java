public class VarTypeTest{
   public static void main(String args[]){
         boolean gender = true; //8bit�� ������ ��������
         boolean hungry = true;
         System.out.println(gender);
         if (hungry ==true){      
            System.out.println("�������");
         }else{
            System.out.println("��θ���");
         }

   
         int a = 5; 
         if(a > 10) System.out.println("a�� 10���� ũ��");//boolean false
         if(a < 10) System.out.println("a�� 10���� �۴�");//boolean true
         
         char day = '��';
         System.out.println(day+"����");

   }
}