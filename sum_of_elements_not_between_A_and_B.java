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
        int a,b;
       a=sc.nextInt();
       b=sc.nextInt();
       int sum=0;
        for(i=0;i<n;i++)
{
    if(x[i]<a||x[i]>b)
    sum=sum+x[i];
}
             System.out.printf("%d ",sum);
             
        
    }
}