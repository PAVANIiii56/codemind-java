import java.util.Scanner;
class palindrome
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,r,rev=0,k;
        n=sc.nextInt();
        k=n;
        while(k!=0)
    {
        r=k%10;
        rev=(rev*10)+r;
        k=k/10;
    }
    if(rev==n)
    System.out.println("True");
    else
    System.out.println("False");
    }
}