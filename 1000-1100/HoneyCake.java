
import java.io.*;
import java.util.*;

public class HoneyCake {

    static void solve(PrintWriter out, int w, int h, int d, int n) {
        int gcd1 = gcd(w, n);
        n /= gcd1;
        int gcd2 = gcd(h, n);
        n /= gcd2;
        int gcd3 = gcd(d, n);
        n /= gcd3;
        if (n > 1) {
            out.println(-1);
        } else {
            out.print(gcd1-1+" ");
            out.print(gcd2-1+" ");
            out.print(gcd3-1);
            out.println();
        }

    }

    static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static void main(String[] args) throws IOException {
        FastReader fr = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int w = fr.nextInt();
        int h = fr.nextInt();
        int d = fr.nextInt();
        int n = fr.nextInt();

        solve(out, w, h, d, n);

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
