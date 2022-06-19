public class GCDv3 {
    public static void main(String[] args) {
        int a=78,b=9;
        System.out.println("GCD is");
        System.out.println(new GCDv3().gcd(a,b));
    }
    public int gcd(int a,int b){
        if(a==b){
            return a;
        }
        return gcd(Math.max(a,b)-Math.min(a,b),Math.min(a,b));
    }
}
