public class countSetBits_lookUpTableMethod {
    static int []table;
    public static void main(String[] args) {
        int n = 15274;
        table = new int[256];table[0]=0;
        for(int i=1; i<256; i++){
            table[i]=(i&1)+table[i/2];
        }
        System.out.println(new countSetBits_lookUpTableMethod().setBitsCount(n,table));
    }
    public int setBitsCount(int n,int[] table){
        int i=4; //for 4 bye data
        int count=0;
        while(i>0){
            count+=table[n & 255];  // of   0xff --> 255
            n>>=8;
            i--;
        }
        return count;
    }
}
