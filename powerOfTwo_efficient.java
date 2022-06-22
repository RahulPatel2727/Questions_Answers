public class powerOfTwo_efficient {
    public static void main(String[] args) {
        int n = 4;
//        System.out.println(new powerOfTwo_efficient().powOf2(n));
        System.out.println(n+" is equal to 2 power "+new powerOfTwo_efficient().pow(n));
    }
    public int pow(int n){
        if(powOf2(n)){
            int c=0;
            n=n-1;
            while(n>0){
                c+=(n&1);
                n>>=1;
            }
            return c;
        }
        else
            return -1;
    }

    public boolean powOf2(int n){
//        if(n==0) return  false;
        return (n!=0) && (n&(n-1))==0;
    }
}
