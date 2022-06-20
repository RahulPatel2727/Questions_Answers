public class allFactors_withOrder {
    public static void main(String[] args) {
        int n = 49;
        int i;
        for(i=1;i*i<=n;i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
        for(;i>=1;i--){
            if(i==n/i)
                continue;
            if(n%i==0){
                System.out.print(n/i+" ");
            }
        }
    }
}
