public class countSetBit {
    public static void main(String[] args) {
        int a=15274;
        System.out.println(new countSetBit().setBit(a));
    }
//    naive method
    public int setBit(int a){
        int count = 0;
        while(a!=0){
            if(a%2==1){
                count++;
            }
//            a/=2;
            // or
            a>>=1;
        }
        return count;
    }
}
