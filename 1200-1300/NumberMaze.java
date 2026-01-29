
import java.io.*;
import java.util.*;

public class NumberMaze {

    static String solve(String str,int j, int k) {
        Map<String, String[]> map = new HashMap<>();
        map.put("12", new String[]{"12", "21"});
        map.put("123", new String[]{"123", "132", "213", "231", "312", "321"});
        map.put("1234", new String[]{"1234", "1243", "1324", "1342", "1423", "1432", "2134", "2143", "2314", "2341", "2413", "2431", "3124", "3142", "3214", "3241", "3412", "3421", "4123", "4132", "4213", "4231", "4312", "4321"});
        String a=map.get(str)[j];
        String b=map.get(str)[k];
        int count=0;
        for (int i = 0; i < a.length(); i++) {
            if(a.charAt(i)==b.charAt(i)) count++;
        }
        return count+"A"+(a.length()-count)+"B";
    }

    public static void main(String[] args) throws IOException {
        FastReader fr = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int t = fr.nextInt(); // number of test cases
        while (t-- > 0) {
            String str = fr.next();
            int j = fr.nextInt();
            int k = fr.nextInt();
            

            out.println(solve(str, j-1, k-1));
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
