import java.util.Scanner;

public class hd6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = 0;
        int a = 0;
        while (sc.hasNext()) {
            n=sc.nextInt();
            if(n==0)break;
            for (int i = 0; i < n; i++) {

                a += sc.nextInt();
            }
            System.out.println(a);
            a=0;//清空
        }
    }
        }