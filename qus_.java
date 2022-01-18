/*
Q. Mr Raman is having two unsorted arrays with names myarr1 and myarr2.
They can be of any size. They may contain duplicate values also.
Raman wants for each element in myarr1[ ] to count elements greater
than or equal to it in array myarr2[].

Example

Imagine the size of both the arrays are 5

myarr1[]  values  {3,4,1,2,2}
myarr2[] values  {1,2,1,3,1}

Output :
1,0,5,2,2

 */
import java.util.*;
public class newQ {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the size:");
        int size = sc.nextInt();
        int myarr1[] = new int[size];
        int myarr2[]= new int[size];
        System.out.println("Enter the Myarr1 array element:");
        for(int i = 0; i<size;i++){
            myarr1[i]=sc.nextInt();
        }
        System.out.println("Enter the Myarr2 array element:");
        for(int i =0 ;i<size;i++ ){
            myarr2[i]=sc.nextInt();
        }

        for(int i =0; i<size;i++){
            int count =0;
            for(int j=0 ; j<myarr1.length;j++){
                if(myarr2[j]>=myarr1[i]){
                    count++;
                }
            }
            myarr1[i]=count;
        }
        System.out.println("The resulting array as needed to Mr. Raman :");
        for(int i :myarr1){
            System.out.print(i+" ");
        }

    }
}
