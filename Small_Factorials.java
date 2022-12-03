import java.util.Scanner;
class Sample
{
    public static void main(String pavs[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int x=0;x<t;x++)
        {
        int n=sc.nextInt();
        int fact=1;
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.println(fact);
        }
    }
}