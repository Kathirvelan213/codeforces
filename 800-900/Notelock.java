
import java.io.*;
import java.util.*;

public class Notelock {
//turns out i understood the problem wrong at the first read, so my implementation is not good
    static int solve(String s,int n,int k) throws  IOException {
        int l=0;
        int count=0, oneCount=0;
        for (int r = 0; r < n; r++) {
            if(s.charAt(r)=='1'){
                if(oneCount==0){
                    count++;
                }
                oneCount++;
            }
            if(r-l>=k-1){
                if(s.charAt(l)=='1'){
                    oneCount--;
                }
                l++;
            }
        }
        return count;
    }

    public static void main(String[] args) throws IOException {
        FastReader fr = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int t = fr.nextInt(); // number of test cases
        while (t-- > 0) {
            int n = fr.nextInt();          
            int k = fr.nextInt();  
            String s=fr.next();        
            

            out.println(solve(s,n,k));       
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
