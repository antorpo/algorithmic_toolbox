import java.util.Scanner;

public class Fibonacci {
  private static long calc_fib_recu(int n) {
    if (n <= 1)
      return n;

    return calc_fib(n - 1) + calc_fib(n - 2);
	
  }
  
   private static long calc_fib(int n){
        long fn = 0, n2 = 0, n1 = 1;

        if(n <= 1) {
            return n;
        }

        for (int i = 0; i < n-1; i++) {
            fn = n2 + n1;
            n2 = n1;
            n1 = fn;
        }

        return fn;
    }

  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();

    System.out.println(calc_fib(n));
  }
}
