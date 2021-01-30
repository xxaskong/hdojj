import java.util.Scanner;
public class hd_2012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y, temp;
        int point = 0;
        x = sc.nextInt();
        y = sc.nextInt();
        while (x != 0 || y != 0) {

            for (int i = x; i <= y && point != 1; i++) {
                temp = i * i + i + 41;
                for (int j = 2; j * j <= temp && point != 1; j++) {
                    if (temp % j == 0) point = 1;
                }
            }
            if (point == 1) System.out.println("sorry");
            else System.out.println("ok");
            x = sc.nextInt();
            y = sc.nextInt();
        }
    }
}
