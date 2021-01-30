import java.util.Scanner;

public class text {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext())
        {
            int x =in.nextInt();
            int y = in.nextInt();
            //结束的标志
            if(x == 0 && y == 0)
            {
                break;
            }
            int sum = 0;
            //遍历范围，搜寻是不是有存在不是素数的例子
            for(int i = x; i<=y; i++)
            {
                int result = i*i+i+41;
                //如果不是素数，则显示sorry
                if(isPrime(result) == false)
                {
                    System.out.println("Sorry");
                    break;
                }
                else
                {
                    sum++;
                }
            }
            //如果刚好满足全部都是素数，则显示ok
            if(sum == y-x+1)
            {
                System.out.println("OK");
            }
        }
        in.close();
    }

    //判断素数方法，返回布尔值
    public static boolean isPrime(int result)
    {
        boolean isPrime = true;
        for(int i = 3; i<Math.sqrt(result); i+=2)
        {
            if(result%i == 0)
            {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}