
import java.io.*;
import java.util.*;

public class DistinctElements {

    static long[]  solve(long[] arr) {
        long[] result=new long[arr.length];
        result[0]=1;
        int newNumber=2;
        for (int i = 1; i < arr.length; i++) {
            long required=arr[i-1]+i+1;
            long difference=required-arr[i];
            if(difference==0) {
                result[i]=newNumber;
                newNumber++;
            }
            else{
                result[i]=result[(int)difference-1];
            }
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        FastReader fr = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int t = fr.nextInt(); // number of test cases
        while (t-- > 0) {
            int n = fr.nextInt();          
            long[] arr = new long[n];        
            for (int i = 0; i < n; i++) {
                arr[i] = fr.nextLong();     
            }
            var result=solve(arr);
            for (int i = 0; i < result.length; i++) {
                out.print(result[i]+" ");
            }
            out.println();
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
