import java.util.Scanner;
class Sample
{
    public static int findSum(int m[], int x,int y)
    {
        int sum=0;
        for(int i=0;i<m.length;i++)
        {
            if(m[i]<x||m[i]>y)
            sum=sum+m[i];
        }
        return sum;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],a,b,i,res=0;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
        x[i]=sc.nextInt();
        a=sc.nextInt();
        b=sc.nextInt();
        res=Sample.findSum(x,a,b);
        System.out.println(res);
        sc.close();
        
        
    }
}