import java.util.Scanner;
class Sample
{
    public static void main(String pavs[])
    {
        Scanner sc=new Scanner(System.in);
        int s,t,b,capacity=1;
        s=sc.nextInt();
        t=sc.nextInt();
        b=sc.nextInt();
        capacity=(2*s*t*b)/2;
        System.out.format("%dKB",capacity);
    }
}