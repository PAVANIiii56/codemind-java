import java.util.Scanner;
class Gcd
{
    public static void main(String pavs[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,gcd=1,i;
        a=sc.nextInt();
        b=sc.nextInt();
        for(i=1;i<=a&&i<=b;i++)
        {
            if(a%i==0 && b%i==0)
                gcd=i;
        }
            System.out.format("%d",gcd);
        
    }
}