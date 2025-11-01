
import java.io.*;
import java.util.*;

//not a good implementation by me
public class BeautifulString {

    static void solve(String s,PrintWriter out) {
        int l=0,r=s.length()-1;
        var output=new ArrayList<Integer>();
        int p1=0,p2=0;
        while(l<=r){
            if(s.charAt(l)!=s.charAt(r)){
                if(s.charAt(l)=='0'){
                    output.add(p1,l);
                    p1++;p2++;
                    l++;
                }
                else{
                    output.add(p2,r);
                    r--;
                }
            }
            else{
                l++;r--;
            }
        }
        out.println(output.size());
        for (int i = 0; i < output.size(); i++) {
            out.print(output.get(i)+1);
            out.print(" ");
        }
        out.println();
    }

    public static void main(String[] args) throws IOException {
        FastReader fr = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int t = fr.nextInt(); // number of test cases
        while (t-- > 0) {
            int n = fr.nextInt();          // number of elements in this test case
            String s=fr.next();

            solve(s,out);       // solve this test case
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
