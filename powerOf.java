import java.security.spec.RSAOtherPrimeInfo;

public class powerOf {
    public static void main(String[] args) {
        int a = 4,b=3;
        if(b==0) System.out.println(1);
        System.out.println(new powerOf().pow(a,b-1,a));
        System.out.println(new powerOf().powV2(a,b));
    }
//naive method
    public int pow(int a,int b,int it){
        if(b==0) return a;
        return pow(a*it,b-1,it);
    }
//second method better than naive
    public int powV2(int a,int b){
        int temp =(int) Math.pow(a,b/2);
        temp*=temp;
        if(b%2==0){
            return temp;
        }
        else {
            return temp*a;
        }
    }
//using recursion
    public int powRec(int a,int b){
        if(b==0) return 1;
        int temp = powRec(a,b/2);
        temp*=temp;
        if(b%2==0)
            return temp;
        else
            return temp*a;
    }
}
