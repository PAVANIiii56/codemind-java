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
    {
        pavani pa=new pavani();
        int n,r,m,c1=0,v,i,j;
        n=sc.nextInt();
        m=sc.nextInt();
        for(i=1;i<m+n;i++)
        {
            if(pa.prime(n+m+i)==0)
            {
                System.out.println(i);
                break;
            }
        }
    }
}
}