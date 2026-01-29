
import java.io.*;
import java.util.*;

public class RenakoAmaoriandXORGameeasyversion {

    static String solve(int[] arr1,int[] arr2) {
        int aCount=0, bCount=0;
        int last=0;
        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i]==1) aCount++;
            if(arr2[i]==1) bCount++;
            if(arr1[i]!=arr2[i]) last=i;
        }
        if((aCount%2!=0 && bCount%2!=0) ||(aCount%2==0 && bCount%2==0) ) return "Tie";

        if(last%2==0) return "Ajisai";
        return "Mai";
    }

    public static void main(String[] args) throws IOException {
        FastReader fr = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int t = fr.nextInt(); // number of test cases
        while (t-- > 0) {
            int n = fr.nextInt();          
            int[] arr1 = new int[n];        
            for (int i = 0; i < n; i++) {
                arr1[i] = fr.nextInt();     
            }
            int[] arr2 = new int[n];        
            for (int i = 0; i < n; i++) {
                arr2[i] = fr.nextInt();     
            }

            out.println(solve(arr1,arr2));       
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
