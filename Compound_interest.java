import java.util.Scanner;
class Sample
{
    public static void main(String pavs[])
    {
        Scanner sc=new Scanner(System.in);
        double n=sc.nextInt();
        double m=sc.nextInt();
        double b=sc.nextInt();
        double ci=n*(Math.pow((1+m/100),b));
        System.out.printf("%.2f",ci);
    }
}