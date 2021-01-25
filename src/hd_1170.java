import java.util.Scanner;

import static java.lang.Math.pow;

public class hd_1170 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char chara;
        int n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            chara = sc.next().charAt(0);
            int a = sc.nextInt();
            int b = sc.nextInt();
            switch (chara) {
                case '+':
                    System.out.println(a+b);
                    break;
                case '-':
                    System.out.println(a - b);
                    break;
                case '*':
                    System.out.println(a * b);
                    break;
                case '/':
                    System.out.println(String.format("%.2f", 1.0 * a / b));
                    break;
            }
        }
    }
}
