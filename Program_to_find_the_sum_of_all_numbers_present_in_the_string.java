import java.util.Scanner;
class Sample
{
    public static void main(String pavs[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        int sum=0;
        for(int i=0;i<s1.length();i++)
        {
        if(Character.isDigit(s1.charAt(i)))
        {
            sum=sum+s1.charAt(i)-'0';
        }
        }
       System.out.println(sum);
        }
}