public class allFactors_withOrder {
    public static void main(String[] args) {
//        this is the efficient way to find all factors of a number in increasing order
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
