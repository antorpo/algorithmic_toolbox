import java.util.*;

public class FibonacciSumSquares {
    private static long getFibonacciSumSquaresNaive(long n) {
        if (n <= 1)
            return n;

        long previous = 0;
        long current  = 1;
        long sum      = 1;

        for (long i = 0; i < n - 1; ++i) {
            long tmp_previous = previous;
            previous = current;
            current = tmp_previous + current;
            sum += current * current;
        }

        return sum % 10;
    }

    public static long fibonacci_square(long n) {
        long n2 = 0, n1 = 1, fn = 0, sum = 1;

        if(n <= 1){
            return n;
        }

        for (int i = 0; i < n-1; i++) {
            fn = (n2 + n1)%10;
            n2 = n1;
            n1 = fn;
            sum = sum%10 + (fn*fn)%10;
        }

        return sum%10;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long s = fibonacci_square(n);
        System.out.println(s);
    }
}

