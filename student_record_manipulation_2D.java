/*
Consider an array MARKS[4][5] which stores the marks
obtained by 4 students in 5 subjects. Now write a program to...
(a) find the average marks obtained in each subject.
(b) find the average marks obtained by every student.
(c) find the number of students who have scored below 50 in their average.
(d) display the scores obtained by every student.
 */
import java.util.HashMap;
import java.util.*;
import java.util.Scanner;
class program_for_student_details_in_2D {
    public static void main(String[] args) {
        program_for_student_details_in_2D obj = new program_for_student_details_in_2D();
        obj.averageMarksInEachSubject();//a
        obj.avgMarksOfEachStudent(); //b
        obj.below50Students();//c
        obj.scoreObtain();//d
    }

    int stu[][];
    int student,subjects;
    public program_for_student_details_in_2D(){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter total no of student:");
        int no_of_student = sc.nextInt();
        this.student=no_of_student;
        System.out.println("Enter total no of subjects they have:");
        int no_of_subject = sc.nextInt();
        this.subjects=no_of_subject;
        stu=new int[no_of_student][no_of_subject];
        for(int i = 0; i<no_of_student; i++){
            System.out.println("Enter the marks of student: "+(i+1));
            for(int j =0; j<no_of_subject; j++){
                stu[i][j]=sc.nextInt();
            }
        }
    }

    //1
    public void averageMarksInEachSubject(){
        float avgSum[]=new float[subjects];
        for(int i =0; i<subjects; i++){
            int sum=0;
            for(int j =0; j<student;j++){
                sum+=stu[j][i];
            }
            avgSum[i]=(float) sum/student;
        }
        System.out.println("Average marks of each subject is:");
        for(float i : avgSum){
            System.out.print(i+ " ");
        }
        System.out.println();
    }

    // 2
    float arr[];
    public void avgMarksOfEachStudent(){
        arr=new float[student];
        for(int i = 0; i<student; i++){
            int sum =0;
            for(int j=0; j<subjects; j++){
                sum+=stu[i][j];
            }
            arr[i]=(float)sum/subjects;
        }
        System.out.println("Average marks of each student is :");
        for(float i: arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    //3
    public  void below50Students(){
        System.out.println("Average marks below 50 student list is: ");
        for(float i: arr){
            if(i<50){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }

    //4
    public void scoreObtain(){
        System.out.println("Every student scores in every subjects:");
        for(int i =0; i<student; i++){
            System.out.println("Student "+(i+1)+" :");
            for ( int j = 0; j<subjects; j++){
                System.out.print(stu[i][j]+" ");
            }
            System.out.println();
        }
    }

}
