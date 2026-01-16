
import java.io.*;
import java.util.*;

public class ASCIIArtContest {

    static String solve(int[] arr) {
        Arrays.sort(arr);
        if(arr[2]-arr[0]>=10){
            return "check again";
        }
        else{
            return "final "+arr[1];
        }
    }

    public static void main(String[] args) throws IOException {
        FastReader fr = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

            int[] arr=new int[3];
            arr[0] = fr.nextInt();          
            arr[1] = fr.nextInt();          
            arr[2] = fr.nextInt();          

            out.println(solve(arr));       

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
