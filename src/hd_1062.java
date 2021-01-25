import java.util.Scanner;
public class hd_1062 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int e = -1;
        int m = sc.nextInt()+1;
        for (int k = 0; k < m; k++) {
            String st = sc.nextLine();
            char[] word = new char[200];
            char[] stack = st.toCharArray();

            for (int i = 0; i < stack.length; i++) {
                if (stack[i] != 32) {
                    word[++e] = stack[i];

                } else {
                    delallstack(word, e);
                    e = -1;
                    System.out.print(" ");
                }
            }
            delallstack(word, e);
            e = -1;
            System.out.println();
        }
    }
    public static void delallstack(char[] stack,int e){
        for (int i = e; i >=0; i--) {
            System.out.print(stack[i]);
        }
    }
}
