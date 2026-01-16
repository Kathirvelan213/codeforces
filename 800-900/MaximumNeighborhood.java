
import java.io.*;
import java.util.*;

public class MaximumNeighborhood {

    static int solve(int n) {
        int square=n*n;
        if(n==1) return 1;
        if(n==2) return 9;
        int nw=square-1+square-n-1+square-2*n-1+square-n+square-n-2;
        int ne=square+square-n+square-n-1+square-2*n;
        int sw=square+square-1+square-2+square-n-1;
        int se=square+square-1+square-n;
        return Math.max(Math.max(nw,ne),Math.max(sw,se));
    }

    public static void main(String[] args) throws IOException {
        FastReader fr = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int t = fr.nextInt(); // number of test cases
        while (t-- > 0) {
            int n = fr.nextInt();          
            out.println(solve(n));       
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
