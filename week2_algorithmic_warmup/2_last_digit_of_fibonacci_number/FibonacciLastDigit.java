import java.util.*;

public class FibonacciLastDigit {
    private static int getFibonacciLastDigitNaive(int n) {
        if (n <= 1)
            return n;

        int previous = 0;
        int current  = 1;

        for (int i = 0; i < n - 1; ++i) {
            int tmp_previous = previous;
            previous = current;
            current = tmp_previous + current;
        }

        return current % 10;
    }
	
	public static int lastDigitFibonacci(int n){
        int fn = 0, n2 = 0, n1 = 1;

        for (int i = 0; i < n-1; i++) {
            fn = (n2 + n1)%10;
            n2 = n1;
            n1 = fn;
        }

        return fn;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int c = lastDigitFibonacci(n);
        System.out.println(c);
    }
}

