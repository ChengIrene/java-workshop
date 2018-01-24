package idv.workshop.homework;

public class FibonacciRecursive {

    //Fibonacci number (費式數列), 利用遞迴(Recursion)
    public static long fibonacciNumber(int n) {
        long result = 0;

        if(n < 0) {
            throw new IllegalArgumentException("Input should greater than 0");
        }

        for (int i = 1; i <= n; i++) {
            if (n <= 1) {
                result = n;
            } else {
                //第一次用遞迴.......還不是很懂 囧
                result = fibonacciNumber(n - 1) + fibonacciNumber(n - 2);
            }
        }
        return result;
    }
}
