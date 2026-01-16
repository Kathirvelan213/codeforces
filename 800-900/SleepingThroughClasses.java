
import java.io.*;
import java.util.*;

public class SleepingThroughClasses {

    static int solve(int k,String str) {
        int timeToSleep=0;
        int sleepHours=0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='0'){
                if(timeToSleep==0){
                    sleepHours++;
                }
                else{
                    timeToSleep--;
                }
            }
            else{
                timeToSleep=k;
            } 
        }
        return sleepHours;
    }

    public static void main(String[] args) throws IOException {
        FastReader fr = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int t = fr.nextInt(); // number of test cases
        while (t-- > 0) {
            int n = fr.nextInt();          
            int k = fr.nextInt();          
            String str = fr.next();     

            out.println(solve(k,str));       
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
