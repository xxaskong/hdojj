public class hd_1192 {
    public static void main(String[] args) {
        for (int i = 1000; i < 10000; i++) {
            if (turn(16, i) == turn(12, i) && turn(10, i) == turn(16, i)) System.out.println(i);
        }
    }
    public static int turn(int system,int num){
        int[] stack=new int[5];
        int e=-1;
        int temp=0;
        for (int i = 0;num!=0 ; i++) {
            stack[++e]=num%system;
            num/=system;

        }
        for (int i = 0; i < stack.length; i++) {
            temp+=stack[i];
        }
        return temp;
    }
}
