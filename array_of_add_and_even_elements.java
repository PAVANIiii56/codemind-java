import java.util.Scanner;
class Sample
{
    public static void main(String pavs[])
    {
        Scanner sc=new Scanner(System.in);
         int n,a[],i;
         n=sc.nextInt();
         a=new int[n];
         for(i=0;i<n;i++)
         {
             a[i]=sc.nextInt();
         }
         for(i=0;i<n;i++)
         {
             if(a[i]%2!=0)
             {
             System.out.printf("%d ",a[i]);
             }
         }
            for(i=0;i<n;i++)
         {
             if(a[i]%2==0)
             {
             System.out.printf("%d ",a[i]);
             }
         }
    }
}