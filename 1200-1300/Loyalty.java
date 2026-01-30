
import java.io.*;
import java.util.*;

public class Loyalty {

    static void solve(PrintWriter out, int X, int[] arr) {
        Arrays.sort(arr);
        int[] result=new int[arr.length];
        int l=0,r=arr.length-1;
        long bonusPoints=0;
        long loyaltyLevel=0;
        long totalPurchase=0;
        int index=0;
        while(l<=r){
            if((totalPurchase+arr[r])/X>loyaltyLevel){
                totalPurchase+=arr[r];
                bonusPoints+=arr[r];
                loyaltyLevel=totalPurchase/X;
                result[index]=arr[r];
                r--;
            }
            else{
                totalPurchase+=arr[l];
                result[index]=arr[l];

                l++;
            }
            index++;
        }
        out.println(bonusPoints);
        for (int i = 0; i < result.length; i++) {
            out.print(result[i]+" ");   
        }
        out.println();
    }

    public static void main(String[] args) throws IOException {
        FastReader fr = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int t = fr.nextInt(); // number of test cases
        while (t-- > 0) {
            int n = fr.nextInt();
            int X = fr.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = fr.nextInt();
            }

            solve(out, X, arr);
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
