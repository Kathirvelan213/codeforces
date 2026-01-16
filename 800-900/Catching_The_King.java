
import java.io.*;
import java.util.*;

public class Catching_The_King {

    static int solve(int n,int rk,int ck,int rd,int cd) {
        int vertical,horizontal;
        if(rk>rd){
            vertical=n-rd;
        }
        else if(rk<rd){
            vertical=rd;
        }
        else{
            vertical=0;
        }
        if(ck>cd){
            horizontal=n-cd;
        }
        else if(ck<cd){
            horizontal=cd;
        }
        else{
            horizontal=0;
        }
        return Math.max(horizontal, vertical);
    }

    public static void main(String[] args) throws IOException {
        FastReader fr = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int t = fr.nextInt(); // number of test cases
        while (t-- > 0) {
            int n = fr.nextInt();
            int rk = fr.nextInt();
            int ck = fr.nextInt();
            int rd = fr.nextInt();
            int cd = fr.nextInt();

            out.println(solve(n,rk,ck,rd,cd));
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
