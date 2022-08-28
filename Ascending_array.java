import java.util.Scanner;
class Sample
{
    public static void main(String pavs[])
    {
        Scanner sc=new Scanner(System.in);
        int n,a[],i,s=0;
        n=sc.nextInt();
        a=new int[n];
        for(i=0;i<n;i++)
       {
        a[i]=sc.nextInt();
       }
       for(i=0;i<n-1;i++)
       {
           if(a[i]<a[i+1])
           {
               s++;
           }
       }
       if(s==n-1)
       {
           System.out.println("yes");
       }
       else
        {
           System.out.println("no");
       }
    }
}