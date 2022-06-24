public class recursion {
    public static void main(String[] args) {
        int n=10;
//        p1(n);
//        System.out.println(p2(n));
        p3(n);
    }

    // this recursion find bits
    public static void p3(int n){
        if(n==0)
            return ;
        p3(n/2);
        System.out.print(n%2);
    }

    //this recursion find floor of log n base 2, you can change the base and base case accordingly
    public static int p2(int n){
        if(n==1)
            return 0;
        int nm=1 + p2(n/2);
        return nm;
    }

    // recursion analysis
    static void p1(int n){
        if(n==0)
            return;
        p1(n-1);
        System.out.print(n+" ");
        p1(n-1);
    }
}
