import java.util.Scanner;
class Sample
{
    public static void main(String pavs[])
    {
        Scanner sc=new Scanner(System.in);
        int c=0;
        int l=sc.nextInt();
        int r=sc.nextInt();
        int k=sc.nextInt();
        for(int i=l;i<=r;i++)
        {
            if(i%k==0)
            {
                c+=1;
            }
        }
        System.out.println(c);
    }
}