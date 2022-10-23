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
            if((int)s1.charAt(i)>=97 && (int)s1.charAt(i)<=122)
            {
                c++;
            }
        }
        System.out.println(c);
    }
}