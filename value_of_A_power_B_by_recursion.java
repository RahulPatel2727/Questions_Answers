/*
Q1. Write a program to find x to the power n (i.e. x^n). 
Take x and n from the user. You need to return the answer.
Do this recursively.
Input format :
Two integers x and n (separated by space)
Output Format :
x^n (i.e. x raise to the power n)
Sample Input 1 :
 3 4
Sample Output 1 :
81
*/
import java.util.*;
 class findMultipleOf_A_to_B_times {
    public long power(long num1,long num2){
        if(num2 == 0){return 1;}
        else if(num1 == 0){return 0;}
        long a = power(num1,num2-1);
        System.out.println(a);
//        long b=num1*a;
        return a*num1;
    }
    
    public static void main(String[] args) {
        findMultipleOf_A_to_B_times obj = new findMultipleOf_A_to_B_times();
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the no A:");
        long A=sc.nextInt();
        System.out.println("Enter the no B:");
        long B=sc.nextInt();
        System.out.println("Value of A power B:");
        System.out.println(obj.power(A,B));
    }
}
