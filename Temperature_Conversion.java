import java.util.Scanner;
class celsius
{
    public static void main(String args[])
    {
        float f,c;
        Scanner sc=new Scanner(System.in);
        c=sc.nextFloat();
        f=32+(c*9/5);
        System.out.format("%.2f",+f);
    }
}