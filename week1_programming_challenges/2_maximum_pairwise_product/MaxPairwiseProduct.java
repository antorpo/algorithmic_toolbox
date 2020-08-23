import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class MaxPairwiseProduct {
    static BigInteger getMaxPairwiseProduct(int[] numbers) {
        BigInteger result = BigInteger.ONE;
        int index1 = 0, index2 = 0;

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > numbers[index1]) {
                index1 = i;
            }
        }

        for (int i = 0; i < numbers.length; i++) {

            if (index1 == 0 && index2 == 0) {
                index2 = 1;
            }

            if (i != index1 && numbers[i] > numbers[index2]) {
                index2 = i;
            }
        }

        result = result.multiply(BigInteger.valueOf(numbers[index1]));
        result = result.multiply(BigInteger.valueOf(numbers[index2]));
        return result;
    }

    public static void main(String[] args) {
        FastScanner scanner = new FastScanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println(getMaxPairwiseProduct(numbers));
    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream stream) {
            try {
                br = new BufferedReader(new
                    InputStreamReader(stream));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }

}
