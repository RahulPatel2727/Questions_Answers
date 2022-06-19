import java.util.*;
public class trailingZerosV2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a num ...");
        int fact=s.nextInt();
        System.out.println("trailing zeros are ...");
        System.out.println(new trailingZerosV2().trailingZero(fact,5));
    }
    public int trailingZero(int fact, int d){
        if(d>fact){
            return 0;
        }
        return fact/d + trailingZero(fact,d*5);
    }

}
