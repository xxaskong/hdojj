import java.util.Scanner;

public class hd3 {
    public static void main(String args[])
    {
        int a,b;
        Scanner reader=new Scanner(System.in);
        while(reader.hasNextInt())
        {
            a=reader.nextInt();
            b=reader.nextInt();
            System.out.println(a+b);
        }


    }
}
