import java.util.Scanner;
class Sample
{
    public static void main(String pavs[])
    {
         Scanner sc=new Scanner(System.in);
         String s1=sc.nextLine();
         char c=sc.next().charAt(0);
         int co=0;
         for(int i=0;i<s1.length();i++)
         {
         if((s1.charAt(i))==c)
             {
             co++;
             }
         }
     if(co==0)
     {
         System.out.println("-1");
     }
     else
     {
         System.out.println(co);
     }
    }
}