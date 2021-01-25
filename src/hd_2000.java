import java.util.Scanner;
public class hd_2000 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str;
        char temp;
        char[] a;
        for (int k= 0; k <3 ; k++) {
            str=sc.nextLine();
            a=str.toCharArray();
            for (int i = 0; i < a.length; i++) {
                for (int j = i; j >0&&a[j]<a[j-1];j--) {
                    temp=a[j];
                    a[j]=a[j-1];
                    a[j-1]=temp;
                }
            }
            for (int x = 0; x <3; x++) {
                System.out.print(a[x]);
                if(x<2) System.out.print(" ");
            }
            System.out.println();
        }
        }
}
