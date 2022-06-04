import java.util.Scanner;
class Descending
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],i,s=0;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        for(i=0;i<n-1;i++)
        {
            if(x[i]>x[i+1])
            {
                s++;
            }
        }
        if(s==n-1)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
    }
}