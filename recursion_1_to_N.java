public class recursion_1_to_N {
    public static void main(String [] args){
        int n = 9;
        print(n);
    }
    public static void print(int n){
        if(n==0)
            return;
        print(n-1);
        System.out.print(n+" ");
    }
    
}
