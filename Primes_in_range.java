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
                c=1;
                break;
            }
        }
        return c;
    }

public static void main(String pavs[])
{
    Scanner sc=new Scanner(System.in);
    {
        pavani pa=new pavani();
        int n,r,c2=0,c1=0,m,i,j;
        n=sc.nextInt();
        m=sc.nextInt();
        for(i=n;i<=m;i++)
        {
            if(pa.prime(i)==0)
            {
                c1+=1;
            }
        }
        System.out.println(c1);
                
        
    }
}
}