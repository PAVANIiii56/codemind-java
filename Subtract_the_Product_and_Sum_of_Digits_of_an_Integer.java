import java.util.Scanner;
class pro
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,r,s=0,p=1,res=0;
        n=sc.nextInt();
        while(n>0)
        {
            r=n%10;
            p=p*r;
            s=s+r;
            n=n/10;
        }
        res=p-s;
        System.out.printf("%d",res);
    }
}