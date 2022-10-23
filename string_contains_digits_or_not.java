import java.util.Scanner;
class Sample
{
    public static void main(String pavs[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        for(int j=0;j<t;j++)
        {
        String s1=sc.nextLine();
        int c=0;
        for(int i=0;i<s1.length();i++)
        {
        if(Character.isDigit(s1.charAt(i)))
           {
            c++;
           }
        }
        if(c==0)
        {
        System.out.println("No");
        }
        else if(c!=0)
        {
        System.out.println("Yes");
        }
        }
        sc.close();

    }
}