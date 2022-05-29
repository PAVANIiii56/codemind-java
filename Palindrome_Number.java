import java.util.Scanner;
class palindrome
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,rev=0,r,i,x[],q;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
        {
            rev=0;
            x[i]=sc.nextInt();
            q=x[i];
            while(x[i]>0)
            {
                r=x[i]%10;
                rev=rev*10+r;
                x[i]=x[i]/10;
            }
            if(q==rev)
            {
                System.out.println("True");
            }
            else
            {
                System.out.println("False");
            }
            
        }
    }
}