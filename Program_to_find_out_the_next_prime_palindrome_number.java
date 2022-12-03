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
public int pal(int m)
{
    int rev=0,r;
    int temp=m;
    while(m>0)
    {
    r=m%10;
    rev=rev*10+r;
    m=m/10;
    }
    if(temp==rev)
    return 1;
    else
    return 0;
    
}
public static void main(String pavs[])
{
    Scanner sc=new Scanner(System.in);
    {
        pavani pa=new pavani();
        int n,r,c2=0,c1=0,v,i,j;
        n=sc.nextInt();
        for(i=n+1;i<99999;i++)
        {
            if(pa.pal(i)==1 && pa.prime(i)==0)
            {
                System.out.println(i);
                break;
            }
        }
    }
}
}