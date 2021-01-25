import java.util.Scanner;

public class hd_2008 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int pos=0;
        int zero=0;
        int neg=0;
        int n;
        int temp;
        n=sc.nextInt();
        while(n!=0) {
            for (int i = 0; i < n; i++) {
                temp = sc.nextInt();
                if (temp > 0) pos++;
                else if (temp == 0) zero++;
                else neg++;
            }
            System.out.println(pos + " " + zero + " " + neg);
            pos=0;neg=0;zero=0;temp=0;
            n=sc.nextInt();
        }

    }
}
