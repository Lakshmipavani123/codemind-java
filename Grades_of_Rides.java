import java.util.Scanner;
class tyu
{
    public static void main(String args[])
    {
        int hf,sp,mp;
        Scanner sc=new Scanner(System.in);
        hf=sc.nextInt();
        sp=sc.nextInt();
        mp=sc.nextInt();
         if(hf>50&&sp>60&&mp>100)
          System.out.println("10");
         else if(hf>50&&sp>60)
          System.out.println("9");
         else if(sp>60&&mp>100)
          System.out.println("8");
         else if(hf>50&&mp>100)
         System.out.println("7");
         else if(hf>50||sp>60||mp>100)
         System.out.println("6");
         else
         System.out.println("5");
    }
}