import java.util.Scanner;
class Sample
{
    public static void main(String pavs[])
    {
        Scanner sc=new Scanner(System.in);
     int n,i,count=0,c;  
     n=sc.nextInt();
     int a[]=new int[n];
     
   
    for(i=0;i<n;i++)
    {
       a[i]=sc.nextInt();
    }
    c=sc.nextInt();
     for(i=0;i<n;i++)
     {
        if(a[i]==c)
        count++;
     }
     System.out.println(count);
    }
}