
import java.io.*;
import java.util.*;

public class YourName {

    static String solve(String s, String t) {
        int[] countList = new int[26];
        for (int i = 0; i < s.length(); i++) {
            countList[s.charAt(i)-'a']+=1;   
        }
        for (int i = 0; i < t.length(); i++) {
            countList[t.charAt(i)-'a']-=1;   
        }
        for(int i=0;i<countList.length;i++){
            if(countList[i]!=0) return "NO";
        }
        return "YES";
    }

    public static void main(String[] args) throws IOException {
        FastReader fr = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int testcases = fr.nextInt(); // number of test cases
        while (testcases-- > 0) {
            int n = fr.nextInt();
            String s = fr.next();
            String t = fr.next();

            out.println(solve(s, t));
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
