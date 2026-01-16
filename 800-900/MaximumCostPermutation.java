
import java.io.*;
import java.util.*;

public class MaximumCostPermutation {

    static int solve(int[] arr) {
        int leftSum = 0, rightSum = 0, middleSum = 0;
        int l = -1, r = -1;
        for (int i = 0; i < arr.length; i++) {
            leftSum += arr[i];
            if (arr[i] != i + 1) {
                l = i;
                break;
            }
        }
        if (l != -1) {
            for (int i = arr.length - 1; i >= 0; i--) {
                rightSum += arr[i];
                if (arr[i] != i + 1) {
                    r = i;
                    break;
                }
            }
        }
        if (r == l) {
            return 0;
        }
        int zeroCount = 0;
        int zeroIndex = -1;
        if (arr[l] == 0) {
            zeroCount++;
            zeroIndex = l;
        }
        if (arr[r] == 0) {
            zeroCount++;
            zeroIndex = r;
        }
        for (int i = l + 1; i < r; i++) {
            middleSum += arr[i];
            if (arr[i] == 0) {
                zeroCount++;
                zeroIndex=i;
            }
            if (zeroCount >= 2) {
                return r - l + 1;
            }
        }
        int n = arr.length;
        if ((n * (n + 1) / 2) - middleSum - leftSum - rightSum == zeroIndex+1) {
            return r - l;
        }
        return 0;
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

            out.println(solve(arr));
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
