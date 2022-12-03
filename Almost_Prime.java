import java.util.Scanner;
class pavani
{
    public int prime(int n)
    {
        int i,c=0;
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
        int t=sc.nextInt();
        for(int x=0;x<t;x++)
        {
            int n,i,f=0;
            n=sc.nextInt();
            for(i=2;i<=n/2;i++)
            {
                if(i==n/i)
                continue;
            if(n%i==0 && pa.prime(n/i)==0 && pa.prime(i)==0)
                f+=1;
            }
            if(f==0)
                System.out.println("NO");
            else
                System.out.println("YES");

        }
    }
}