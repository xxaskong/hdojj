import java.util.Scanner;

public class hd_2009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double temp;
        double n;
        int m;
        String result;
        for (int j = 0; j < 2; j++) {


            n = sc.nextInt();
            temp = n;
            m = sc.nextInt();
            for (int i = 0; i < m - 1; i++) {
                n = Math.sqrt(n);
                temp += n;
            }
            result = String.format("%.2f", temp);
            System.out.println(result);
            temp = 0;
        }
    }
}
