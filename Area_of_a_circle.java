import java.util.Scanner;
class Area
{
    public static void main(String[] args)
    {
    int r;
    float pi=3.14F,area;
    Scanner sc=new Scanner(System.in);
    r=sc.nextInt();
    area=pi*r*r;
    System.out.println(+area);
}
}