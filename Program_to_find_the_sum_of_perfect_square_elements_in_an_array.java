import java.util.Scanner;
class min
{
    public static void main(String args[])
    {
            int n,i,j,sum=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
       int x[]=new int[n];
        for(i=0;i<n;i++)
            x[i]=sc.nextInt();
        for(i=0;i<n;i++)
        {
            for(j=1;j<=x[i];j++)
            {
        if(j*j==x[i])
        {
        sum=sum+x[i];
        }
            }
        }
        System.out.printf("%d",sum);


    }
}