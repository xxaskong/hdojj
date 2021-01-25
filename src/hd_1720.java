import java.util.Scanner;

public class hd_1720 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String ox,os;
        int b,a;
       while(sc.hasNext()){
            ox=sc.next();
            os=sc.next();
            b=Integer.valueOf(os,16);
            a=Integer.valueOf(ox,16);
            System.out.println(a+b);
        }
    }
}
