import java.util.Scanner;
class pavani
{
public static void main(String pavs[])
{
    Scanner sc=new Scanner(System.in);
    {
        int n,r,c2=0,c=0,v,i,j;
        n=sc.nextInt();
         int a=0;
        int b=1;
        System.out.printf("%d %d",a,b);
    for(i=0;i<n-2;i++)
    {
     c=a+b;
     System.out.printf(" %d",c);
     a=b;
     b=c;
        }
    }
}
}