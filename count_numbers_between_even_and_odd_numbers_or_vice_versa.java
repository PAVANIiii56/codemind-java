import java.util.Scanner;
class Sample
{
    public static void main(String pavs[])
    {
        Scanner sc=new Scanner(System.in);
     int n,i,count=0;  
     n=sc.nextInt();
   int a[]=new int[n];
    for(i=0;i<n;i++)
    {
       a[i]=sc.nextInt();
    }
     for(i=0;i<n-2;i++)
     
     {
         if((a[i]%2==0 && a[i+2]%2!=0)  || (a[i]%2!=0 && a[i+2]%2==0))
         {
            
             count++;
         }
     }
     System.out.println(count);
    }
}