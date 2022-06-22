import java.util.Scanner;
public class test2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number to find their set Bits..");
        int n=s.nextInt();
        int []table=new int[256];
        table[0]=0;
        for(int i=1; i<256;i++){
            table[i]=(i&1)+table[i/2];
        }
        System.out.println("Set Bits are "+new test2().setBit(n,table));
    }
    public int setBit(int n,int []table){
        int count=0,size=4;
        while(size-->0){
            count+=table[n&255];//0xff
            n>>=8;
        }
        return count;
    }
}
