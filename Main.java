import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Kaca sayi:");
        int a = input.nextInt();
        int b=0,c=1,temp;
        for(int i=0; i<=a; i++)
        {
            System.out.print(c+" ");
             temp=c;
             c=c+b;
             b=temp;
        }
    }
}