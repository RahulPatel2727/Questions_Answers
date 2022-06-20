public class primeFactorsv1 {
    public static void main(String[] args) {
        int n = 21420;
        new primeFactorsv1().factors(n);
    }
    public void factors(int n){
//        if(isPrime(n))
//            System.out.println(n);

        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                while(n%i==0){
                    System.out.print(i+" ");
                    n=n/i;
                }
            }
        }
        if(n>1)
            System.out.print(n);
    }
////    public boolean isPrime(int n){
////        if(n==1)return false;
////        if(n==2|| n==3) return true;
////        if(n%3==0|| n%2==0) return false;
////        for(int i=5; i*i<=n;i+=6){
////            if(n%i==0||n%(i+2)==0){
////                return false;
////            }
////        }
//        return true;
//    }
}
