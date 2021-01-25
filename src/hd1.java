import java.util.Scanner;

public class hd1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double i=0;
        i=scanner.nextDouble();
        if(scanner.hasNextDouble()){
            i+=scanner.nextDouble();
        }
        System.out.println(i);
    }
}
