
import java.io.*;
import java.util.*;

public class CutTheArray {

    static int[] solve(int[] arr) {
        int[] prefixSum=new int[arr.length];
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
            prefixSum[i]=sum;
        }
        for (int i = 0; i < arr.length-2; i++) {
            int s1=prefixSum[i];
            for(int j=i+1;j<arr.length-1;j++){
                int s2=prefixSum[j]-s1;
                int s3=prefixSum[arr.length-1]-prefixSum[j];
                if((s1%3==s2%3&&s1%3==s3%3) || (s1%3!=s2%3&&s1%3!=s3%3&&s2%3!=s3%3)){
                    return new int[]{i+1,j+1};
                }
            }
            
        }
        return new int[2];

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
            var result=solve(arr);
            for(int i=0;i<2;i++){
                out.print(result[i]);
                out.print(" ");
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
