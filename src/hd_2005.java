import java.util.Scanner;
public class hd_2005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int grade;

        for (int i = 0; i < 2; i++) {
            grade = sc.nextInt();
            grade /= 10;
            if (grade <= 5 && grade >= 0) grade = 5;
            if (grade == 100) grade = 1;
            if (grade > 10) grade = 10;
            if (grade < 0) grade = -1;
            switch (grade) {
                case -1:
                    System.out.println("Score is error!");
                    break;
                case 10:
                    System.out.println("Score is error!");
                    break;
                case 5:
                    System.out.println("E");
                    break;
                case 6:
                    System.out.println("D");
                    break;
                case 7:
                    System.out.println("C");
                    break;
                case 8:
                    System.out.println("B");
                    break;
                case 9:
                    System.out.println("A");
                    break;
                case 1:
                    System.out.println("A");
                    break;
            }
        }
    }
}
