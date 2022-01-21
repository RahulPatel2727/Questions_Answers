/*
input   [2 6 9 1 4 77]
output  [2 1 6 4 77 8]
*/

import java.util.*;
public class greater_small_gerater {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.println("give the size");
        int size = s.nextInt();
        System.out.println("elements");
        int arr[]=new int[size];
        for(int i =0; i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        Arrays.sort(arr);
        for(int i =0; i<arr.length-1;i+=2){
            int temp = arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
