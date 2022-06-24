class recursionN_to_1{
    public static void main(String [] args){
        int n = 23;
        print(n);
    }
    public static void print(int n){
        if(n==0)
            return;
        System.out.print(n+" ");
        print(n-1);
    }
}