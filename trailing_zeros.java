// package Calss_Questions;
import java . util. Scanner;
public class trailing_zeros {
    public static void main(String[] args) {
        Scanner s=new Scanner (System.in);
        System.out.println("Enter the factorial num:");
        int num = s.nextInt();
        int i=5;int count=0;
        //to count the total no of 5 in the num. because 5*2 gives 1 zero;
        while(i<=num){
            int t=i;
            while(t>=5){
               t= t/5;
               count+=1;
            }
            i+=5;
        }
        System.out.println("Trailing zeros is "+count);
    }
}
