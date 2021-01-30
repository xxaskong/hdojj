import java.util.Scanner;

public class hd_2013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int temp = 1;
        int temp2;
        while (sc.hasNext()) {
            n = sc.nextInt();
            for (int i = 0; i < n - 1; i++) {
                temp = (temp + 1) * 2;
            }
            System.out.println(temp);
        }
        sc.close();
    }
}
