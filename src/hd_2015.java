import java.util.Scanner;

public class hd_2015 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n,m,m2;
        float temp=0;
        float temp2=0;
        while (sc.hasNext()) {
            n = sc.nextInt();
            m = sc.nextInt();
            if (m % 2 == 1) {
                System.out.println("执行奇数");
                m2 = m / 2 + 1;
                for (int i = m2; i <= n; i += m) {
                    System.out.println(i * 2);
                    if (n - i < m) {
                        m = n - i - 1;
                        break;
                    }
                }
                for (int i = n - m + 1; i <= n; i++) {
                    temp2 += i;
                }
                System.out.println((temp2 / m) * 2);
            } else {
                System.out.println("执行偶数");
                for (float i = 2; i <= n; i += m) {
                    System.out.println((2 * i + 1) / 2);
                    if (n - i <= m) {
                        m = n - (int) (i + 2);
                        break;
                    }
                }
                for (int i = n - m + 1; i <= n; i++) {
                    temp2 += i;
                }
                System.out.println((temp2 / m) * 2);
            }
        }
        sc.close();
    }
}
