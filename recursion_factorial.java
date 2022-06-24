public class recursion_factorial {
    public static void main(String[] args) {
        int n=5;
        System.out.println(notTail(n));

    }

//    this is not a tail recursion
    public static int notTail(int n){
        if(n==0||n==1)
            return 1;
        return n*notTail(n-1);
    }
}
