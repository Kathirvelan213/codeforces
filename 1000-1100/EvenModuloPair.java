
import java.io.*;
import java.util.*;

public class EvenModuloPair {

    static void solve(PrintWriter out, int[] arr) {
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<i;j++){
                if((arr[i]%arr[j])%2==0){
                    out.print(arr[j]+" "+arr[i]);
                    out.println();
                    return;
                }
            }
        }
        out.println(-1);
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

            solve(out, arr);       
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
