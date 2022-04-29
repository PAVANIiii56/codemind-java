import java.util.Scanner;
class capacity
{
   public static void main(String args[])
   {
       int t,s,b,capacity;
       Scanner sc=new Scanner(System.in);
       t=sc.nextInt();
       s=sc.nextInt();
       b=sc.nextInt();
       capacity=2*t*b*s*512;
       System.out.println(+capacity);
   }
}