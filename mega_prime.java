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
        int n,r,c=0,c1=0;
        n=sc.nextInt();
        int temp=n;
        while(n>0)
        {
            r=n%10;
            if(pa.prime(r)==0)
            {
                c+=1;
            }
            c1+=1;
            n=n/10;
        }
        if(pa.prime(temp)==0 && c==c1)
        {
            System.out.println("Mega Prime");
        }
        else
        {
            System.out.println("Not Mega Prime");
        }
    }
}
}