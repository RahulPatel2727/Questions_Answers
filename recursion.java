public class recursion {
    public static void main(String[] args) {
        int n=16;
//        p1(n);
        System.out.println(p2(n));
    }
    public static int p2(int n){
        if(n==1)
            return 0;
        else
            return 1+p2(n/2);
    }

    static void p1(int n){
        if(n==0)
            return;
        p1(n-1);
        System.out.print(n+" ");
        p1(n-1);
    }
}
