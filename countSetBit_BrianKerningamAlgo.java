public class countSetBit_BrianKerningamAlgo {
    public static void main(String[] args) {
        int a=15274;
        int count=0;
        while(a!=0){
            a=a&(a-1);
            count++;
        }
        System.out.println(count);
    }
}
