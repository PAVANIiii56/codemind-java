import java.util.Scanner;
class Sample
{
    public static void main(String pavs[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        int c=0;
        for(int i=0;i<s1.length();i++)
        {
            if(s1.charAt(i)==' ')
            {
                c++;
            }
        }
        System.out.println(c);
    }
}