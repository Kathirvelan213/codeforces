
import java.io.*;
import java.util.*;

public class NewYearCake {

    static int solve(int[] arr) {
        int result = 0;
        int bigger, smaller;
        int n1 = arr[0], n2 = arr[1];
        if (n1 < n2) {
            bigger = n2;
            smaller = n1;
        } else {
            bigger = n1;
            smaller = n2;
        }
        int pow = 1;
        List<Integer> list = new ArrayList();
        if (1 <= smaller) {

            list.add(1);
            result++;
            pow *= 2;
        } else {
            if (bigger >= 1) {
                return result + 1;
            }
            return result;
        }
        if (2 <= smaller) {

            list.add(2);
            result++;
            pow *= 2;
        } else {

            if (bigger >= 2) {
                return result + 1;
            }
            return result;
        }
        int i = 2;

        for (; pow + list.get(i - 2) <= smaller; pow *= 2, i++) {
            list.add(list.get(i - 2) + pow);
            result++;
        }

        if (pow + list.get(i - 2) <= bigger) {
            result++;
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        FastReader fr = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int t = fr.nextInt(); // number of test cases
        while (t-- > 0) {
            int[] arr = new int[2];
            for (int i = 0; i < 2; i++) {
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
