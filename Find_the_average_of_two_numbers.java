import java.util.Scanner;
class average
{
    public static void main(String[] args)
    {
        double a,b,c;
        Scanner sc=new Scanner(System.in);
        a=sc.nextDouble();
        b=sc.nextDouble();
        c=(a+b)/2;
        System.out.printf("%.4f",c);
    }
}