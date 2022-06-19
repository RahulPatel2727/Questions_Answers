import java.security.spec.RSAOtherPrimeInfo;
import java.util.*;
public class GCDv2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter A and B for GCD...");
        int a=s.nextInt(),b=s.nextInt();
        System.out.println(new GCDv2().gcd(Math.min(a,b),Math.max(a,b),Math.min(a,b)));
    }
    public int gcd(int a,int b,int c){
        if(c%a==0 && b%a==0){
            return a;
        }
        return gcd(a-1,b,c);
    }
}
