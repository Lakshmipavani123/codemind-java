import java.util.Scanner;
class coco
{
    public static void main(String args[])
    {
        int x;
        Scanner sc=new Scanner(System.in);
        x=sc.nextInt();
        if(x==7||x==8||x==9||x==10||x==11)
        System.out.println("Rainy");
        else if(x==12||x==1||x==11)
        System.out.println("Winter");
        else if(x==2||x==3)
        System.out.println("Spring");
        else if(x==4||x==5||x==6)
        System.out.println("Summer");
        else
        System.out.println("-1");
    }
}