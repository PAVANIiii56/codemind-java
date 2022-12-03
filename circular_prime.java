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
    public int reve(int m)
    {
        int rev=0,r;
        while(m>0)
        {
            r=m%10;
            rev=rev*10+r;
            m=m/10;
        }
        return rev;
        
    }
    public static void main(String pavs[])
    {
        Scanner sc=new Scanner(System.in);
        pavani pa=new pavani();
        int n,i,b,c=0;
        n=sc.nextInt();
        if(pa.prime(n)==0)
        {
        if(pa.prime(pa.reve(n))==0)
          {
        System.out.println("circular prime");
          }
        else
          {
        System.out.println("prime but not a circular prime");
          }
        }
        else
        {
        System.out.println("not prime");
        }
    }
}