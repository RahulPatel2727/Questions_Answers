//package Calss_Questions;
import java.util.Scanner;
 class find_odd_index_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.printf("Enter the size of the array:");
        int size = sc.nextInt();
        int arr[]= new int[size];
        System.out.println("Enter the elements of array:");
        for(int i = 0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=1;i<arr.length;i+=2) {
            sum+=arr[i];
        }
        System.out.println("Odd index sum is:"+sum);
    }
}
