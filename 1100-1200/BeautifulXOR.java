
import java.io.*;
import java.util.*;

public class BeautifulXOR {

    static void solve(PrintWriter out, int a, int b) {
        int upper = (Integer.highestOneBit(a) << 1) - 1;
        if (b > upper) {
            out.println(-1);
            return;
        }
        int c = a ^ b;
        if (a == b) {
            out.println(0);
            return;
        }
        if (c <= a) {
            out.println(1);
            out.println(c);
            return;
        }
        out.println(2);
        int d = (a - Integer.highestOneBit(a)) ^ b;
        out.print(d + " ");
        out.println(Integer.highestOneBit(a));
    }

    public static void main(String[] args) throws IOException {
        FastReader fr = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int t = fr.nextInt(); // number of test cases
        while (t-- > 0) {
            int a = fr.nextInt();
            int b = fr.nextInt();

            solve(out, a, b);
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
