import java.util.*;

public class FibonacciPartialSum {
    private static long getFibonacciPartialSumNaive(long from, long to) {
        long sum = 0;

        long current = 0;
        long next  = 1;

        for (long i = 0; i <= to; ++i) {
            if (i >= from) {
                sum += current;
            }

            long new_current = next;
            next = next + current;
            current = new_current;
        }

        return sum % 10;
    }
    
	public static long fibonacci_partial_sum(long m, long n) {
        long n2 = 0, n1 = 1, fn = 0, sum = 0;

        if(m==1){
            sum = 1;
        }

        for (int i = 2; i <= n; i++) {
            fn = (n2 + n1)%10;
            n2 = n1;
            n1 = fn;

            if(i >= m){
                sum = sum%10 + fn;

            }
        }

        return sum%10;
    }
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long from = scanner.nextLong();
        long to = scanner.nextLong();
        System.out.println(fibonacci_partial_sum(from, to));
    }
}

