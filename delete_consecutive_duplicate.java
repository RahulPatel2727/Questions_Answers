/*
Q. Write a program to remove consecutive duplicate elements in an array.

Input values

10 10 30 30 40 50 50 50 9 45

Output

10 30 40 50 9 45
 */
import java.util.*;
class remove_consecutive_duplicates {
    public static void main(String[] args) {
//        int arr[] = {10 , 10 , 20 , 30 , 30 , 30 , 10};
        System.out.println("Size");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[]= new int[size];
        System.out.println("Enter the elements");
        for(int i = 0; i<size; i++){
            arr[i]=sc.nextInt();
        }
        int count = 0;
        for(int i = 0; i<arr.length-count;){
            if (arr[i]==arr[i+1]){
                int j;count++;
                for( j = i; j<arr.length-count; j++){
                    arr[j]=arr[j+1];
                }
                arr[j]=Integer.MAX_VALUE;
            }
            else {
                i++;
            }
        }
        System.out.println("After delete consecutive duplicates.......");
        for(int i= 0; i<arr.length - count; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
