 import java.util.Scanner;
 class Spy
 {
     public static void main(String args[])
     {
         Scanner sc=new Scanner(System.in);
         int s=0,m=1,temp,d,n;
         n=sc.nextInt();
         temp=n;
         while(temp!=0)
         {
             d=temp%10;
             s=s+d;
             m=m*d;
             temp=temp/10;
         }
         if(s==m)
         {
             System.out.println("Spy Number");
         }
         else
          {
             System.out.println("Not Spy Number");
         }
         
     }
 }