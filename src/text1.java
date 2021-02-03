import java.util.Scanner;

import static java.lang.Math.pow;

public class text1 {
    public static void main(String[] args) {
        int count=0;
      String a="1234bbabdsadg";
        for (int i = 0; i < a.length(); i++) {
            if(a.charAt(i)>=48&&a.charAt(i)<57)count++;
        }
        System.out.println(count);
    }
}
