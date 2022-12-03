import java.util.Scanner;
class pavani
{
public int pretty(int n)
    {
        int i,c=0,r;
            r=n%10;
            if(r==2 || r==3 || r==9)
            {
                c+=1;
            }
            return c;
        
    }
public static void main(String pavs[])
{
    Scanner sc=new Scanner(System.in);
    {
        pavani pa=new pavani();
        int t=sc.nextInt();
        for(int x=0;x<t;x++)
        {
        int n,r,c2=0,c1=0,m,i,j;
        n=sc.nextInt();
        m=sc.nextInt();
        for(i=n;i<=m;i++)
        {
            if(pa.pretty(i)>=1)
            {
                c1+=1;
            }
        }
        System.out.println(c1);
        }
    }
}
}