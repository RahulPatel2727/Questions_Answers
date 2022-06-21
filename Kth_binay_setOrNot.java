import java.security.spec.RSAOtherPrimeInfo;

public class Kth_binay_setOrNot {
    public static void main(String[] args) {
        int a=15274,k=14;  // k always less than the max bit in a no or in a range 32/64...
        System.out.println(new Kth_binay_setOrNot().Kth(a,k));
        System.out.println(new Kth_binay_setOrNot().KthV1(a,k));
        System.out.println(new Kth_binay_setOrNot().Kthv2(a,k));
    }
//    naive solution
    public boolean Kth(int a, int k){
        while(k!=0){
            if(k==1 && a%2==1){
                return true;
            }
            a=a/2;
            k--;

        }
        return false;
    }
//    efficient using left shift
    public boolean KthV1(int a, int k){
        if((a & 1<<(k-1))==0)
            return false;
        else
            return true;
    }
//    efficient using right shift
    public boolean Kthv2(int a, int k){
        if((a>>(k-1) & 1)==1)
            return true;
        else
            return false;
    }
}
