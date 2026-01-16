
import java.io.*;
import java.util.*;

public class BlackslexandShowering {

    static int solve(int[] arr) {
        int currMax=Math.abs(arr[0]-arr[1]);
        int sum=currMax;
        for (int i = 0; i < arr.length-2; i++) {
            sum+=Math.abs(arr[i+1]-arr[i+2]);
            int t=Math.abs(arr[i]-arr[i+1])+Math.abs(arr[i+1]-arr[i+2])-Math.abs(arr[i]-arr[i+2]);
            if(t>currMax){
                currMax=t;
            }
        }
        int t=Math.abs(arr[arr.length-1]-arr[arr.length-2]);
        if(t>currMax){
            currMax=t;
        }
        return sum-currMax;
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
