import java.util.Arrays;

public class allPrimeV2_using_Seive_Eratosthenes {
    public static void main(String[] args) {
        int n=11;
        boolean [] fact = new boolean[n+1];
        for(int i=2;i<=n;i++){
            if(!fact[i]){
                for(int j=2*i;j<=n;j+=i){
                    fact[j]=true;
                }
            }
        }
        for(int i=2;i<=n;i++){
            if(!fact[i]){
                System.out.print(i+" ");
            }
        }
    }
}
