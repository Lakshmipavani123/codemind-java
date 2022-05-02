import java.util.Scanner;
class hand
{
    public static void main(String args[])
    {
    int x,total;
    Scanner sc=new Scanner(System.in);
    x=sc.nextInt();
    total=x*(x-1)/2;
    System.out.println(total);
    }
}