import java.util.*;

public class FibonacciSumLastDigit {
    private static long getFibonacciSumNaive(long n) {
        if (n <= 1)
            return n;

        long previous = 0;
        long current  = 1;
        long sum      = 1;

        for (long i = 0; i < n - 1; ++i) {
            long tmp_previous = previous;
            previous = current;
            current = tmp_previous + current;
            sum += current;
        }

        return sum % 10;
    }
    
	
	public static int fibonacciLastDigit(int n) {
        int n2 = 0, n1 = 1, fn = 0;

        if (n <= 1)
            return n;

        for (int i = 0; i < n-1; i++) {
            fn = (n2 + n1)%10;
            n2 = n1;
            n1 = fn;
        }

        return fn;
    }

    public static long getFibonacciSumFast(long n) {
        int new_n = (int) ((n + 2) % 60);
        long new_last = fibonacciLastDigit(new_n);
        if (new_last == 0) {
            return 9;
        } else {
            return new_last - 1;
        }
    }

	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long s = getFibonacciSumFast(n);
        System.out.println(s);
    }
}

