import java.util.Scanner;
class Sample
{
    public static void main(String pavs[])
    {
        Scanner sc=new Scanner(System.in);
        int n1=0,n2=1,n,sum=0,flag=0,i;
        int n3=n1+n2;
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(n3==n)
            {
                flag=1;
                break;
            }
            if(n3>n)
            break;
        n1=n2;
        n2=n3;
        n3=n1+n2;
        }
        if(flag==1)
        {
            System.out.println("True");
        }
        else
         {
            System.out.println("False");
        }
    }
}