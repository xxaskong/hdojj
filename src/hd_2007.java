import java.util.Scanner;

import static java.lang.Math.pow;

public class hd_2007 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int odd=0;
        int even=0;
        int s,e;
        for (int j = 0; j < 2; j++) {
            s = sc.nextInt();
            e = sc.nextInt();
            for (int i = s; i <= e; i++) {
                if (i % 2 == 1) odd += pow(i, 3);
                else even += pow(i, 2);
            }
            System.out.print( even+" ");
            System.out.println(odd);
            odd=0;even=0;
        }
    }
}
