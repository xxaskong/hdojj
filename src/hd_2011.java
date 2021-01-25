import java.util.Scanner;
public class hd_2011 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m;
        double n;
        m=sc.nextInt();
        for (int k = 0; k < m; k++) {
        n=sc.nextInt();
        double sum=n;
       double temp=n;
       double temp2=0;
        String result;
        for (int i = 1; i <sum; i++) {
            temp*=i;
        }
        for (int j = 1; j <=sum; j++) {
            if(j%2==1) temp2+=temp/j;
            else temp2-=temp/j;
        }

        temp2/=temp;
        result=String.format("%.2f",temp2);
        System.out.println(result);
    }
}
}
