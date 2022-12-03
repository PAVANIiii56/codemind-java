import java.util.Scanner;
class pavani
{
    public int prime(int n)
    {
        int i,c=0;
        if(n==1)
        {
            c=1;
        }
        for(i=2;i<(int)Math.sqrt(n)+1;i++)
        {
            if(n%i==0)
            {
                c+=1;
            }
        }
        return c;
    }
    public static void main(String pavs[])
    {
        Scanner sc=new Scanner(System.in);
        pavani pa=new pavani();
        int n,i,b,c=0;
        n=sc.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            if(pa.prime(a[i])==0)
            {
                c+=1;
            }
        }
        System.out.println(c);
    }
}