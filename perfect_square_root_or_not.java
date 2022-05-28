import java.util.Scanner;
class Sum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,per=1;
        n=sc.nextInt();
       for(i=1;i<=n;i++)
       {
          if(i*i==n)
       {
           System.out.println("True");
           per=0;
       }
       }
       if(per!=0)
           System.out.println("False");
          
          
    }
}