import java.util.*;

public class FibonacciHuge {
    private static long getFibonacciHugeNaive(long n, long m) {
        if (n <= 1)
            return n;

        long previous = 0;
        long current  = 1;

        for (long i = 0; i < n - 1; ++i) {
            long tmp_previous = previous;
            previous = current;
            current = tmp_previous + current;
        }

        return current % m;
    }
	
	  /*
     * Devuelve la longitud de la periodicidad para un
     * entero m. => F(i) mod M
     */
    public static long get_pisano_period(long m) {
        long a = 0, b = 1, c = 0;

        for (int i = 0; i < m * m; i++) {
            c = (a + b) % m;
            a = b;
            b = c;
            if (a == 0 && b == 1) return i + 1;
        }

        return c;
    }

    public static long huge_fibonacci(long n, long m) {
        long remainder = n % get_pisano_period(m);

        long n2 = 0;
        long n1 = 1;

        long fn = remainder;

        for (int i = 1; i < remainder; i++) {
            fn = (n2 + n1) % m;
            n2 = n1;
            n1 = fn;
        }

        return fn % m;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long m = scanner.nextLong();
        System.out.println(huge_fibonacci(n, m));
    }
}

