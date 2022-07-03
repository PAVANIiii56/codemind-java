import java.util.Scanner;
class Disarium
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,r,s=0,q,d;
         n=sc.nextInt();
        d=(int)Math.log10(n)+1;
        q=n;
        while(q!=0)
        {
            r=q%10;
            s=s+(int)Math.pow(r,d);
            d--;
            q=q/10;
        }
        if(s==n)
        System.out.println("True");
        else
        System.out.println("False");
    }
}