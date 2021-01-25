import java.util.Scanner;

import static java.lang.Math.pow;

public class hd_2010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m;
        int temp = 0;
        int temp2;
        int count = 0;

        for (int k = 0; k < 2; k++) {
            n = sc.nextInt();
            m = sc.nextInt();
            for (int i = n; i <= m; i++) {
                temp2 = i;
                while (temp2 > 0) {
                    temp += pow(temp2 % 10, 3);
                    temp2 /= 10;
                }
                if (temp == i) {
                    System.out.print(i + " ");

                    count++;
                }
                System.out.println();
                temp = 0;
            }
            if (count == 0) System.out.println("no");
        }
    }
}
