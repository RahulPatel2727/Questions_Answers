public class oneToN_recursion {
    public static void main(String[] args) {
        int n=19;
        new oneToN_recursion().print(n);
    }
    public int print(int n){
        if(n==0) return 0;
        System.out.print(n+" ");
        return print(n-1);
    }
}
