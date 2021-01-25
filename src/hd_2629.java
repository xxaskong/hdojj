import java.util.Scanner;

import static java.lang.Math.pow;

public class hd_2629 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long num;
        num=sc.nextLong();
        int temp;
        temp=(int)(num/pow(10,16));
        System.out.println(temp);
    }
}
