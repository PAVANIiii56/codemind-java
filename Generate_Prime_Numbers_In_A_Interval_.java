import java.util.Scanner;
class Sample
{
    public static void main(String pavs[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,m,count,j;
        n=sc.nextInt();
        m=sc.nextInt();
        for(i=n+1;i<m;i++)
        {
            count=0;
            for(j=2;j<=i/2;j++)
            {
            if(i%j==0)
           {
               count=1;
               break;
           }
            }
            if(count==0)
        System.out.println(i);
        }
    }
}