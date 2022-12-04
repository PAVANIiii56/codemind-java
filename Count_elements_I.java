import java.util.Scanner;
class pavani
{
    public static void main(String pavs[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c=0,i,j;
        a=sc.nextInt();
        b=sc.nextInt();
        int l[]=new int[a];
        int k[]=new int[b];
        for(i=0;i<a;i++)
        {
            l[i]=sc.nextInt();
        }
        for(i=0;i<b;i++)
        {
            k[i]=sc.nextInt();
        }
        for(i=0;i<a;i++)
        {
            for(j=0;j<a;j++)
            {
            if(l[i]==l[j] && i!=j)
            {
                l[j]=-1;
            }
            }
        }
        for(i=0;i<b;i++)
        {
            for(j=0;j<b;j++)
            {
            if(k[i]==k[j] && i!=j)
            {
                k[j]=-1;
            }
            }
        }
        for(i=0;i<a;i++)
        {
            if(l[i]==-1)
            {
                continue;
            }
            for(j=0;j<b;j++)
            {
            if(l[i]==k[j])
            {
                c+=1;
            }
            }
        }
       System.out.println(c); 
    }
}