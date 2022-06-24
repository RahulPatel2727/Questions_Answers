public class Fibonacci_usingRecursion {
    public static void main(String[] args) {
        int n=3;
        System.out.println(Nth(n));
    }
    public static int Nth(int n){
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        return Nth(n-1)+Nth(n-2);
    }
}
