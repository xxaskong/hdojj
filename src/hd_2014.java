import java.util.Scanner;

public class hd_2014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int small;
        int big;
        float temp;
        while (sc.hasNext()) {
            n = sc.nextInt();
            float[] grade = new float[n];
            temp = 0;
            big = n - 2;
            small = n - 1;
            grade[n - 1] = 100;
            grade[n - 2] = -1;
            for (int i = 0; i < n; i++) {
                grade[i] = sc.nextFloat();
                if (grade[i] > grade[big]) big = i;
                if (grade[i] < grade[small]) small = i;
            }
            grade[big] = 0;
            grade[small] = 0;
            for (int i = 0; i < n; i++) {
                temp += grade[i];
            }
            temp /= (n - 2);
            System.out.println(String.format("%.2f", temp));
        }
        sc.close();
    }
}
