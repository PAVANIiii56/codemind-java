import java.util.Scanner;
class Sum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,rev=0,r;
        n=sc.nextInt();
        while(n!=0)
        {
            r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
           System.out.printf("%d",rev);
          
    }
}