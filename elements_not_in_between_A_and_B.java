import java.util.*;
class Sample
{
    public static void findSum(int m[], int x,int y)
    {
         int count=0;
        for(int i=0;i<m.length;i++)
        {
            if(m[i]<x||m[i]>y)
            {
            System.out.print(m[i]+" ");
            count++;
            }
        }
        if(count==0)
        System.out.println(-1);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],a,b,i;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
        x[i]=sc.nextInt();
        a=sc.nextInt();
        b=sc.nextInt();
        Sample.findSum(x,a,b);
        sc.close();
    }
}