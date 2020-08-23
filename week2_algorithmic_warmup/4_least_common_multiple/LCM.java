import java.util.*;

public class LCM {
  private static long lcm_naive(int a, int b) {
    for (long l = 1; l <= (long) a * b; ++l)
      if (l % a == 0 && l % b == 0)
        return l;

    return (long) a * b;
  }
  
  public static long lcm_efficient(long a, long b) {
        return (a * b) / gcd_euclides(a, b);
    }

    public static long gcd_euclides(long a, long b) {
        if (b == 0) {
            return a;
        }

        return gcd_euclides(b, a % b);
    }

  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();

    System.out.println(lcm_efficient(a, b));
  }
}
