import java.util.Scanner;
class Sample
{
  public static void main(String pavs[])
  {
     Scanner sc=new Scanner(System.in);
        long a,c;
      a=sc.nextLong();
        if(a>=0)
         {
             c=(long)a/10;
             System.out.println(c);
         }
      
        else if(a<=0)
         {
             if(a%10==0)
             {
              c=((long)(a/10));
             System.out.println(c);
             }
            else if(a%10!=0)
            {
             System.out.println(((long)a/10-1));
            }
         }
         
 
    }
}