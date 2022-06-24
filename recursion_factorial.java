public class recursion_factorial {
    public static void main(String[] args) {
        int n=5;
//        System.out.println(notTail(n));
        System.out.println(Tail(n,1));
    }
//    convert notTail recursion to Tail recursion
    public static int Tail(int n,int res){
        if(n==0||n==1)
            return res;
        return Tail(n-1,n*res);
    }

//    this is not a tail recursion
    public static int notTail(int n){
        if(n==0||n==1)
            return 1;
        return n*notTail(n-1);
    }
}
