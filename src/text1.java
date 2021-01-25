import java.util.Scanner;

import static java.lang.Math.pow;

public class text1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,m;
        int temp=0;
        int temp2;
        n=sc.nextInt();
        m=sc.nextInt();
        for (int i = n; i <=m; i++) {
            temp2=i;
            while(i>0){
                temp+=pow(i%10,3);
                i/=10;
            }
            System.out.println(temp);
            temp=0;
        }
    }
}
