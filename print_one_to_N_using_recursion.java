/*
Q2. Write a program to print numbers from 1 to n in increasing order recursively.

Sample Input 1 :
 6
Sample Output 1 :
1 2 3 4 5 6
 */
import java.util.*;
public class print_one_to_N_using_recursion {
    public void disp(int n){
        if(n==0){return;}
        disp(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the num:");
        new print_one_to_N_using_recursion().disp(sc.nextInt());
    }
}
