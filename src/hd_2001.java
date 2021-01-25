import java.util.Scanner;
        import static java.lang.Math.*;
public class hd_2001 {
    public static void main(String[] args) {
        double[] zb = new double[4];
        double temp;
        String result;
        Scanner sc = new Scanner(System.in);
        for (int j = 0; j < 2; j++) {


            for (int i = 0; i < zb.length; i++) {
                zb[i] = sc.nextDouble();
            }
            temp = sqrt(pow(zb[0] - zb[1], 2) + pow(zb[2] - zb[3], 2));
            result = String.format("%.2f", temp);
            System.out.println(result);
        }
    }
}
