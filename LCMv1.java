public class LCMv1 {
    public static void main(String[] args) {
        int a=1,b=27;
        int max=(a>b)?a:b;
        int min=(a<b)?a:b;
        System.out.println(new LCMv1().lcm(min,max,2));
    }
    public int lcm(int a,int b,int i){
        if(b%a==0){
            return b;
        }
        return lcm(a,b*i,i+1);
    }
}
