import java.util.concurrent.TimeUnit;

public class allPrimeV2_using_Seive_Eratosthenes {
    public static void main(String[] args)  throws InterruptedException{
        long s=System.nanoTime();
        int n=11;
        boolean [] fact = new boolean[n+1];
//naive method
        //divisor always appears in pairs like when we find factorial
        for(int i=2;i*i<=n;i++){
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
        System.out.println();

//new optimal code
        fact=new boolean[n+1];
        for(int i=2;i*i<=n;i++){
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
        System.out.println();

//most ofdptimal
        fact=new boolean[n+1];
        for(int i=2;i<=n;i++){
            if(!fact[i]){
                System.out.print(i+" ");
                for(int j=i*i;j<=n;j+=i){
                    fact[j]=true;
                }
            }
        }

        //checking time taken by the method
        TimeUnit.SECONDS.sleep(2);
        long e=System.nanoTime();
        System.out.println();
        System.out.println("time "+(double) (e-s)/1000000000+"s"                            );
    }
}
