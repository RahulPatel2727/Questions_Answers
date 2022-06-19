/*
Q4. Write a program to find and return the sum of all elements of the array. Do this recursively.

Sample Input 1 :
3
9 8 9
Sample Output 1 :
26
Sample Input 2 :
3
4 2 1
Sample Output 2 :
7
 */
import java.util.Scanner;
class sum_of_all_element_of_an_array_using_recursion {
    int arr[];
    public long sum(int arr[],int s){
        if(s==0){return arr[s];}
        return arr[s]+sum(arr,s-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sum_of_all_element_of_an_array_using_recursion obj = new sum_of_all_element_of_an_array_using_recursion();
        System.out.println("Size");
        int size= sc.nextInt();
        obj.arr=new int[size];
        System.out.println("Elements");
        for(int i =0; i<obj.arr.length;i++){
            obj.arr[i]=sc.nextInt();
        }
        System.out.println("Sum of all element is:");
        System.out.println(obj.sum(obj.arr,size-1));
    }
}
