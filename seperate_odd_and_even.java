/*
Q. Write a program to input the elements of a two- dimensional array.
Then from this array, make two arrays one that stores all odd elements of the
two-dimensional array and the other that stores all even elements of the array.
Note:-  Resulting arrays will be of ArrayList type
 */
import java.util.*;
public class twoD {
    int inputArr[][];
    int M,N;
    twoD() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dimension M * N value:");
        int M = sc.nextInt();
        this.M=M;
        int N = sc.nextInt();
        this.N=N;
        System.out.println("Enter the all elements:");
        inputArr = new int[M][N];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                inputArr[i][j] = sc.nextInt();
            }
        }
    }
    public static void main(String[] args) {
        twoD obj =  new twoD();
        ArrayList <Integer>odd= new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();
        for(int i = 0; i<obj.M;i++){
            for(int j = 0; j<obj.N; j++){
                if(obj.inputArr[i][j]%2==0){
                    even.add(obj.inputArr[i][j]);
                }
                else{
                    odd.add(obj.inputArr[i][j]);
                }
            }
        }
        System.out.println("Odd elements are:");
        for(Integer i:odd){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("Even elements are:");
        for(Integer i: even){
            System.out.print(i+" ");
        }
    }
}
