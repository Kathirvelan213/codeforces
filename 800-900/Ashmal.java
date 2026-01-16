
import java.io.*;
import java.util.*;

public class Ashmal {

    static String solve(String[] arr) {
        StringBuilder sb=new StringBuilder();
        sb.append(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            String prefixed=arr[i]+sb.toString();
            String suffixed=sb.toString()+arr[i];
            if(prefixed.compareTo(suffixed)<=0){
                sb.insert(0,arr[i]);
            }
            else{
                sb.append(arr[i]);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) throws IOException {
        FastReader fr = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int t = fr.nextInt(); // number of test cases
        while (t-- > 0) {
            int n = fr.nextInt();          
            String[] arr = new String[n];        
            for (int i = 0; i < n; i++) {
                arr[i] = fr.next();     
            }

            out.println(solve(arr));       
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
