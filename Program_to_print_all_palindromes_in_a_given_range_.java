import java.util.Scanner;
class pavani
{
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
        int n,r,c2=0,c1=0,m,i,j;
        n=sc.nextInt();
        m=sc.nextInt();
        for(i=n;i<m;i++)
        {
            if(pa.pal(i)==1)
            {
                System.out.printf("%d ",i);
            }
        }
    }
}
}