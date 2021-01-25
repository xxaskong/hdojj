import java.util.Scanner;
public class hd_1064 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float temp=0;
        int n=12;
        String result;
        for (int i = 0; i < n; i++) {
            temp+=sc.nextFloat();
        }
        result=String.format("%.2f",temp/12);
        System.out.println(result+"$");
    }
}
