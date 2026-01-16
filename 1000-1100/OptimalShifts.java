
import java.io.*;
import java.util.*;

public class OptimalShifts {

    static int solve(String bString) {
        int runCount=0;
        int maxRun=0,currRun=0;
        for (int i = 0; i < bString.length(); i++) {
            if(bString.charAt(i)=='0'){
                currRun++;
                if(currRun>maxRun){
                    maxRun=currRun;
                }
            }
            else{
                currRun=0;
                runCount++;
            }
        }
        if(bString.charAt(bString.length()-1)=='0') runCount++;
        if(runCount>1){
            if(bString.charAt(0)=='0' && bString.charAt(bString.length()-1)=='0'){
                int tempCount=0;
                int i=0;
                while(bString.charAt(i)!='1'){
                    tempCount++;
                    i++;
                }
                i=bString.length()-1;
                while(bString.charAt(i)!='1'){
                    tempCount++;
                    i--;
                }
                if(tempCount>maxRun){
                    maxRun=tempCount;
                }
            }
        }
        return maxRun;
    }

    public static void main(String[] args) throws IOException {
        FastReader fr = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int t = fr.nextInt(); // number of test cases
        while (t-- > 0) {
            int n = fr.nextInt();          
            String binaryString=fr.next();

            out.println(solve(binaryString));       
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
