import java.util.Scanner;

public class hd_2017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for (int j = 0; j <n ; j++) {


            String a;
            a = sc.next();
            int count = 0;
            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(i) >= 48 && a.charAt(i) < 57) count++;
            }
            System.out.println(count);
        }
    }
}
