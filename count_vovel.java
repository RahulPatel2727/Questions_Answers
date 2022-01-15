import java.util.*;
public class vovel_count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.next();
        int a = 0, e = 0, ii = 0, o = 0, u = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a') {
                a++;
            } else if (str.charAt(i) == 'e') {
                e++;
            } else if (str.charAt(i) == 'i') {
                ii++;
            } else if (str.charAt(i) == 'o') {
                o++;
            } else if (str.charAt(i) == 'u') {
                u++;
            }
        }
        System.out.println("a " + a);
        System.out.println("e " + e);
        System.out.println("i " + ii);
        System.out.println("o "+o);
        System.out.println("u "+u);
    }
}
