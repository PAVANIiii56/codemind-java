import java.util.Scanner;
class Sample
{
    public static int reverse(int num)
    {
        int r,rev=0;
        while(num>0)
        {
            r=num%10;
            rev=rev*10+r;
            num=num/10;
        }
        return rev;
    }
    public static void main(String pavs[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,a[],c=0;
        n=sc.nextInt();
        a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            if(a[i]==Sample.reverse(a[i]))
            c++;
        }
        System.out.println(c);
        
    }
}