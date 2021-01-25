import java.util.Scanner;
public class hd_2003 {
    public static void main(String[] args) {
        double abs;
        Scanner sc=new Scanner(System.in);

        String result;
        for (int i = 0; i < 2; i++) {
            abs=sc.nextDouble();
            if (abs < 0) abs = -abs;
            result = String.format("%.2f", abs);
            System.out.println(result);
        }
    }
}
