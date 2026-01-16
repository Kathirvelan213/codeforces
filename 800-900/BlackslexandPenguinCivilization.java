
import java.io.*;
import java.util.*;

public class BlackslexandPenguinCivilization {

    static void solve(int n, PrintWriter out) {
        long k = (1L << n) - 1;
        while (k > 0) {
            out.print(k);
            out.print(" ");
            k /= 2;
        }
        int t = 1;
        out.print("0 ");
        for (int i = 0; i < n; i++) {
            int next = t * 2;
            for (int j = t; j < next - 1; j++) {
                out.print(j);
                out.print(" ");
            }
            t *= 2;
        }
    }

    public static void main(String[] args) throws IOException {
        FastReader fr = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int t = fr.nextInt(); // number of test cases
        while (t-- > 0) {
            int n = fr.nextInt();
            solve(n, out);
            out.println();
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
            while (st == null || !st.hasMoreTokens()) {
                String line = br.readLine();
                if (line == null) {
                    return null;   // ← CRITICAL FIX

                }
                st = new StringTokenizer(line);
            }
            return st.nextToken();
        }

        int nextInt() throws IOException {
            String s = next();
            if (s == null) {
                return Integer.MIN_VALUE;
            }
            return Integer.parseInt(s);
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
