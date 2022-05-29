import java.util.Scanner;
class Number
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
          int  a,b,c,res,r;
          a=sc.nextInt();
          b=sc.nextInt();
          c=sc.nextInt();
          res=(int)Math.pow(a,b);
          {
              r=res%c;
          }
          System.out.printf("%d",r);
    }
}