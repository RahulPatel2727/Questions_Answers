/*
Write a program to find whether the array of integers contains a duplicate number. 
if yes print the location where duplicate numbers are found.
 */

public class find_duplicate_element_location {
    public static void main(String[] args) {
        int arr[]={10,10,2,3,4,5,5,6,10};
        for(int i =0; i<arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    System.out.println(arr[i]+" Duplicate Location: index is "+j);
                }
            }
        }
    }
}
