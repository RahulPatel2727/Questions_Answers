public class primeMostEfficient {
    public static void main(String[] args) {
        long start=System.nanoTime();
        int n=91;
        System.out.println(new primeMostEfficient().prime(n));
        long end = System.nanoTime();
        System.out.println("Nano second "+(end - start));
    }
    public boolean prime(int n){
        if(n==1)
            return false;
        if(n==2||n==3)
            return true;
        if(n%2==0||n%3==0)
            return false;
        for(int i=5;i*i<=n;i+=6){
            if(n%i==0 || n%(i+2)==0){
                return false;
            }
        }
        return true;
    }
}