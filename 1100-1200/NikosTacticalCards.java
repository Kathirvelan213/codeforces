
import java.io.*;
import java.util.*;

public class NikosTacticalCards {

    static long solve(long[] arrA, long[] arrB) {
        long min = 0, max = 0;
        for (int i = 0; i < arrA.length; i++) {
            long currMax = Math.max(max - arrA[i], arrB[i] - min);
            long currMin = Math.min(min - arrA[i], arrB[i] - max);
            max = currMax;
            min = currMin;
        }
        return Math.max(max, min);
    }

    public static void main(String[] args) throws IOException {
        FastReader fr = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int t = fr.nextInt(); // number of test cases
        while (t-- > 0) {
            int n = fr.nextInt();
            long[] arrA = new long[n];
            for (int i = 0; i < n; i++) {
                arrA[i] = fr.nextLong();
            }
            long[] arrB = new long[n];
            for (int i = 0; i < n; i++) {
                arrB[i] = fr.nextLong();
            }

            out.println(solve(arrA, arrB));
        }

        out.close();
    }

    // Fast Input Reader (important for big inputs)
    static class FastReader {

        BufferedReader br;
        StringTokenizer st;

        FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() throws IOException {
            while (st == null || !st.hasMoreElements()) {
                st = new StringTokenizer(br.readLine());
            }
            return st.nextToken();
        }

        int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        long nextLong() throws IOException {
            return Long.parseLong(next());
        }

        double nextDouble() throws IOException {
            return Double.parseDouble(next());
        }

        String nextLine() throws IOException {
            return br.readLine();
        }
    }
}
