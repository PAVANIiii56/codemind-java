import java.util.Scanner;
class Handshakes
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,p;
        n=sc.nextInt();
        p=(n*(n-1)/2);
        System.out.println(p);
    }
}