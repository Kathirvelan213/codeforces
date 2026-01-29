
import java.io.*;
import java.util.*;

public class DriftingAway {

    static int solve(String current) {
        int r = 0;
        int leftArrowCount = 0;
        int rightArrowCount = 0;
        int startCount=0;

        while (r<current.length() && current.charAt(r) == '<') {
            leftArrowCount++;
            r++;
        }
        while (r<current.length() && current.charAt(r) == '*') {
            startCount++;
            r++;
        }
        while (r<current.length() && current.charAt(r) == '>') {
            rightArrowCount++;
            r++;
        }
        if(r!=current.length()) return -1;
        if(startCount>1) return -1;
        return Math.max(leftArrowCount,rightArrowCount)+startCount;
    }

    public static void main(String[] args) throws IOException {
        FastReader fr = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int t = fr.nextInt(); // number of test cases
        while (t-- > 0) {
            String str = fr.next();
            out.println(solve(str));
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
