public class LCMv2 {
    public static void main(String[] args) {
        int a=15,b=5;
        System.out.println("LCM of "+a+" and "+ b);
        System.out.println(new LCMv2().lcm(a,b));
//        System.out.println(new LCMv2().gcd(a,b));
    }
    public int lcm(int a,int b){
        return (a*b)/gcd(a,b);
    }

    public int gcd(int a,int b){
        if(b==0)
            return a;
        else
            return gcd(b,a%b);
    }
}
