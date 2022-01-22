/*
Q3. Write a program to find out and return the number of digits present in a number recursively.

Sample Input 1 :
 156
Sample Output 1 :
3
Sample Input 2 :
 7
Sample Output 2 :
1
*/
import java.util.Scanner;
class noOfDigitsUsingRecursion {
    //head recursion
    public int digit(long n){
        if(n==0){return 0;}
        return 1+digit(n/10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num:");
        long num = sc.nextLong();
        noOfDigitsUsingRecursion obj = new noOfDigitsUsingRecursion();
        System.out.println("Digits are:");
        System.out.println(obj.digit(num));
    }
}
