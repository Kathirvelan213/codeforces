
import java.io.*;
import java.util.*;

public class YuuKoitoandMinimumAbsoluteSum {

    static void solve(int[] arr,PrintWriter out) {
        int minDif=0;
        int first=arr[0];
        int last=arr[arr.length-1];
        if(first==-1){
            if(last==-1){
                arr[0]=0;
                arr[arr.length-1]=0;
            }
            else{
                arr[0]=last;
            }
        }
        else if(last==-1){
            arr[arr.length-1]=first;
        }
        else{
            minDif=Math.abs(last-first);
        }
        
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==-1){
                arr[i]=0;
            }  
        }
        out.println(minDif);
        for (int i = 0; i < arr.length; i++) {
            out.print(arr[i]+" ");   
        }
        out.println();
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

            solve(arr,out);       
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
