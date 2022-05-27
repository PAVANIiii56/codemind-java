import java.util.Scanner;
class min
{
    public static void main(String args[])
    {
            int n,i,c=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
       int x[]=new int[n];
        for(i=0;i<n;i++)
            x[i]=sc.nextInt();

        for(i=0;i<n;i++)
        {
        if(x[i]%2!=0)
        {
        System.out.printf("False");
        c=1;
        break;
        }
        }
            
        if(c==0)
        {
        System.out.printf("True");
        }

    }
}