import java.util.Scanner;
public class hd_2039 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m;

        m=sc.nextInt();
        for (int i = 0; i < m; i++) {
            int[] a=new int[3];
            for (int j = 0; j < 3; j++) {
                a[j]=sc.nextInt();
            }
            if( a[0]+a[1]>a[2]&&a[0]+a[2]>a[1]&&a[1]+a[2]>a[0]) System.out.print("yes ");
            else System.out.print("no ");
            System.out.println();
        }
    }
}
