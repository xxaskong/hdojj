import java.util.Scanner;
import static java.lang.Math.pow;
public class hd_2002 {
    public static void main(String[] args) {
        double r;
        Scanner sc = new Scanner(System.in);
        String result;
        final double PI = 3.1415927;
        double V;
        for (int i = 0; i <2; i++) {
            r = sc.nextDouble();
            V = (4.0 / 3) * PI * pow(r, 3);
            result = String.format("%.3f", V);
            System.out.println(result);
        }
    }
}
