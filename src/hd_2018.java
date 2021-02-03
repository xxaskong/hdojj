import java.util.Scanner;

public class hd_2018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();
        while(n!=0) {
            if (n < 4) System.out.println(n);
            else {
                System.out.println(count(n));
            }
            n=sc.nextInt();
        }
    }
    public static int count(int n){
        if(n<4) return n;
        else return count(n-1)+count(n-3);
    }
}
