import java.util.Scanner;

public class hd10 {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int n = 0;
            int a = 0;
            int count=sc.nextInt();

            for (int j = 0; j <count; j++) {
                n = sc.nextInt();
                for (int i = 0; i < n; i++) {
                    a += sc.nextInt();
                }
                System.out.println(a);
                System.out.println();
                a = 0;//清空

            }
        }
    }


