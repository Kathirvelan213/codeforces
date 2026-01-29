
import java.io.*;
import java.util.*;

public class NeedleinaHaystack {

    static String solve(String s, String t) {
        int[] list = new int[26];
        var sb = new StringBuilder();
        for (int i = 0; i < t.length(); i++) {
            list[t.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if ((list[s.charAt(i) - 'a']) < 1) {
                return "Impossible";
            }
            list[s.charAt(i) - 'a']--;
        }
        int curr=0;
        for (int i = 0; i < 26; i++) {
            if (curr<s.length() && i + 'a' == s.charAt(curr)) {
                int k=curr;
                while(k<s.length() && s.charAt(k)<=s.charAt(curr)){
                    sb.append(s.charAt(k));
                    k++;
                }
                curr=k;
            }
            sb.append((String.valueOf((char) (i + 'a'))).repeat(list[i]));
        }
        return sb.toString();
    }

    public static void main(String[] args) throws IOException {
        FastReader fr = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int t = fr.nextInt(); // number of test cases
        while (t-- > 0) {
            String sString = fr.next();
            String tString = fr.next();

            out.println(solve(sString, tString));
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
