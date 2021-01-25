import java.util.Scanner;
public class hd_2006 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        int temp;
        int p=1;
        for (int j = 0; j <2 ; j++) {
            n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                temp = sc.nextInt();
                if (temp % 2 == 1) p *= temp;
            }
            System.out.println(p);
            p=1;
        }
    }
}
