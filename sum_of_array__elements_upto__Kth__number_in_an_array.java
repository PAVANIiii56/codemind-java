import java.util.Scanner;
class min
{
    public static void main(String args[])
    {
            int n,i,m=1;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
       int x[]=new int[n];
        for(i=0;i<n;i++)
            x[i]=sc.nextInt();
        int k;
       k=sc.nextInt();
       int sum=0;
        for(i=0;i<k;i++)
{
    sum=sum+x[i];
}
             System.out.printf("%d ",sum);
             
        
    }
}