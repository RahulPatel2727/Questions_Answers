public class recursionP1 {
    public static void main(String[] args) {
        int n=3;
        rec(n);
    }
    static void rec(int n){
        if(n==0)
            return;
        rec(n-1);
        System.out.print(n+" ");
        rec(n-1);
    }
}
