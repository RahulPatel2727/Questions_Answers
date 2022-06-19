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
                if(t%5==0){
                    t= t/5;
                    count+=1;
                }
                else {break;}
            }
            i+=5;
        }
        System.out.println("Trailing zeros is "+count);
    }
}
///////
// method 2
//package practice;
//import java.util.*;
 class nw {
    public static void main(String[] args) {
        Scanner s = new Scanner( System.in);
        int n =s.nextInt();int count=0;
        for(int i =5; n/i >=1;i*=5){
            count+=n/i;
        }
        System.out.println(count);
    }
}
