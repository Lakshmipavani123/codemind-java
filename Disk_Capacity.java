import java.util.Scanner;
class capacity
{
    public static void main(String args[])
    {
        int t,s,b,C;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        s=sc.nextInt();
        b=sc.nextInt();
        C=t*s*b*512*2;
        System.out.println(C);
    }
}