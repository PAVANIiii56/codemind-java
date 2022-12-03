import java.util.Scanner;
class Sample
{
    public static void main(String pavs[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int v=(n*(n-3))/2;
        System.out.println(v);
    }
}