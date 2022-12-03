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
        for(i=2;i<n;i++)
        {
            if(n%i==0 && pa.prime(i)==0 && pa.prime(n/i)==0)
            {
                System.out.printf("%d %d",i,(n/i));
                c=1;
                break;
            }
        }
        if(c==0)
        {
            System.out.println("-1");
        }
    }
}