import java.util.Scanner;

public class hd2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a1=sc.nextInt();
        int an=sc.nextInt();
        int n=an-a1+1;
        int sn=n*a1+((n*(n-1))/2);
        System.out.println(sn);
    }
}
