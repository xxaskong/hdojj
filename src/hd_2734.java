import java.util.Scanner;

public class hd_2734 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 1;

        String str;
        str = sc.nextLine();
        int temp = 0;
        while (!str.equals("#")) {
            for (int i = 0; i< str.length(); i++) {
                if (str.charAt(i) == 32) {
                    n++;
                    continue;
                }
                temp += n * (str.charAt(i) - 64);
                n++;
            }
            System.out.println(temp);
            str = sc.nextLine();
            temp=0;
            n=1;
        }
    }
}
