
import java.io.*;
import java.util.*;

public class TripleRemoval {

    static int solve(int[] arr,int l ,int r) {
        int[] dist=new int[arr.length];
        int[] realIndex=new int[arr.length];
        int count=0;
        while (true) { 
            int i=-1,j=-1,k=-1,realI=-1,realK=-1,realJ=-1;
            int last0=arr.length,last1=arr.length,realLast0=arr.length,realLast1=arr.length;
            int min=Integer.MAX_VALUE;
            int index=0;
            for(int a=l-1;a<r;a++){
                if(dist[a]<0){
                    continue;
                }
                if(arr[a]==0){
                    dist[a]=Math.max(0,index-last0);
                    realIndex[a]=Math.max(0,a-realLast0);
                    last0=index;
                    realLast0=a;
                }
                else{
                    dist[a]=Math.max(0,index-last1);
                    realIndex[a]=Math.max(0,a-realLast1);
                    last1=index;
                    realLast1=a;
                }
                if(dist[a]==1){
                    j=index;
                    i=index-1;
                    realJ=a;
                    realI=a-realIndex[a];
                    break;
                }
                if(dist[a]>0 && dist[a]<min){
                    min=dist[a];
                    j=index;
                    i=index-min;
                    realJ=a;
                    realI=a-realIndex[a];
                }
                index++;
            }
            if(l==-1||j==-1){
                break;
            }
            index=0;
            int num=arr[realI];
            for(int b=l-1;b<r;b++){
                if(dist[b]>=0){
                    if(arr[b]==num && b!=realI &&b!=realJ){
                        k=index;
                        realK=b;
                        break;
                    }
                    index++;
                }
            }
            if(k==-1){
                return -1;
            }
            dist[realI]=-1;
            dist[realJ]=-1;
            dist[realK]=-1;
            if(k>j){
                count+= Math.min(j-i,k-j);
            }
            else{
                count+= Math.min(i-k,j-i);
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
            int q = fr.nextInt();          
            int[] arr = new int[n];        
            for (int i = 0; i < n; i++) {
                arr[i] = fr.nextInt();     
            }
            while(q-->0){
                int l=fr.nextInt();
                int r=fr.nextInt();
                out.println(solve(arr,l,r));       
            }

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
