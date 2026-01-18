
import java.io.*;
import java.util.*;

public class SequenceGame {

    static String solve(int[] arr,int x) {
        boolean highFlag= false, lowFlag=false;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>=x) highFlag=true;   
            if(arr[i]<=x) lowFlag=true;   
        }
        if(highFlag&&lowFlag){
            return "YES";
        }
        return "NO";
    }

    public static void main(String[] args) throws IOException {
        FastReader fr = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int t = fr.nextInt(); // number of test cases
        while (t-- > 0) {
            int n = fr.nextInt();          
            int[] arr = new int[n];        
            for (int i = 0; i < n; i++) {
                arr[i] = fr.nextInt();     
            }
            int x = fr.nextInt();          

            out.println(solve(arr,x));       
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
