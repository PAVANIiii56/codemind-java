import java.util.Scanner;
class Gcd
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int m,n,i,gcd=1;
        m=sc.nextInt();
        n=sc.nextInt();
     
        for(i=1;i<=m&&i<=n;i++)
        {
          if(m%i==0&&n%i==0) 
              gcd=i;
        }
        System.out.printf("%d",gcd);
    }
}