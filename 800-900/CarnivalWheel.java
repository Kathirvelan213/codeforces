
import java.io.*;
import java.util.*;

public class CarnivalWheel {

    static int solve(int l, int a, int b) {
        if(b>l){
            b%=l;
        }
        if(b==0) return a;
        int g=gcd(l, b);
        int remainingSteps=(l-1-a)/g;

        return a+remainingSteps*g;
    }

    static int gcd(int a,int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }

    public static void main(String[] args) throws IOException {
        FastReader fr = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int t = fr.nextInt(); // number of test cases
        while (t-- > 0) {
            int l = fr.nextInt();
            int a = fr.nextInt();
            int b = fr.nextInt();

            out.println(solve(l, a, b));
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
