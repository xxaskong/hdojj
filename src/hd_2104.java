import java.util.Scanner;

public class hd_2104 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,m;
        int temp;
        n=sc.nextInt();
        m=sc.nextInt();
        temp=n%m;
        while(n!=-1&& m!=-1) {
            while (temp != 0) {
                temp = n % m;
                n = m;
                m = temp;
            }
            if (n == 1) System.out.println("YES");
            else System.out.println("POOR Haha");
            n = sc.nextInt();
            m = sc.nextInt();
        }
    }
}
