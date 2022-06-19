/*
Q. Write a short Java function that takes an array of int values  as an argument
and determines if there is a pair of numbers in the array whose product is odd.
 */
import java.util.*;
class productIsOdd {
    int arr[];
    int size;
    productIsOdd(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size ");
        int M=s.nextInt();
        this.size=M;
        arr=new int[M];
        System.out.println("Enter the total elements:");
        for(int i = 0; i<arr.length; i++){
            arr[i]= s.nextInt();
        }
    }
    public void Short(int []arr){
        boolean flag = false;
        for(int i=0; i<size;i++){
            for(int j = i+1; j<size; j++){
                if(arr[i]*arr[j]%2!=0){
                    flag=true;
                    System.out.println(arr[i]+" "+arr[j]+" whose product is odd.");
                }
            }
        }
        if(flag == false){
            System.out.println("NO any pair is present.");
        }
    }
    public static void main(String[] args) {
        productIsOdd obj = new productIsOdd();
        obj.Short(obj.arr);
    }
}
