import java.util.Scanner;
class Sample
{
    public static void main(String pavs[])
    {
        Scanner sc=new Scanner(System.in);
     int n,i,sum_e=0,sum_o=0;
     n=sc.nextInt();
     int a[]=new int[n];
    for(i=0;i<n;i++)
    {
       a[i]=sc.nextInt();
    }
     for(i=0;i<n;i++)
     {
         if(a[i]%2==0)
         {
             sum_e=sum_e+a[i];
         }
     }
  
     for(i=0;i<n;i++)
     {
         if(a[i]%2!=0)
         {
             sum_o=sum_o+a[i];
         }
     }
     
         if(sum_e>sum_o)
         {
             System.out.format("%d",sum_e-sum_o);
         }
        else
     
         System.out.format("%d",sum_o-sum_e);
     
    } 
}