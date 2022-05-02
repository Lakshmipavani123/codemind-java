import java.util.Scanner;
class area
{
    public static void main(String args[])
    {
        double r,area;
        Scanner sc=new Scanner(System.in);
        r=sc.nextDouble();
        area=3.14*r*r;
        System.out.printf("%.2f",area);
    }
}
