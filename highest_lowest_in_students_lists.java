//java program to display the details of student who have got max and min in dynamic student list.
import java.util.Scanner;

class Student{
   private int roll; private String name; private int marks;
    Student(int roll, String name, int marks){
        this.roll= roll;
        this.name=name;
        this.marks= marks;
    }
    public int getRoll(){
        return roll;
    }
    public String getName(){
        return name;
    }
    public int getMarks(){
        return marks;
    }
}
public class highest_lowest_in_students_lists {
    Student arr[];
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        highest_lowest_in_10_students obj = new highest_lowest_in_10_students();
        System.out.println("Enter the total no of student: ");
        int st_size= s.nextInt();
        obj.arr= new Student[st_size];

        for(int i = 0; i<st_size; i++) {
            System.out.println("Enter the "+ (i+1) +" student details :\nRoll");
            int roll=s.nextInt();
            s.nextLine();
            System.out.println("Name");
            String name = s.nextLine();
            System.out.println("Marks");
            int marks= s.nextInt();
            obj.arr[i] = new Student(roll, name, marks);
        }
        int max=obj.arr[0].getMarks();
        int min=max;
        for(int i=0,j=0;i<obj.arr.length && j<obj.arr.length;i++,j++){
            if(obj.arr[i].getMarks()>=max){
                max=obj.arr[i].getMarks();
            }
            if(obj.arr[j].getMarks()<=min){
                min = obj.arr[j].getMarks();
            }
        }
        for(int i = 0 ; i < obj.arr.length; i++){
            if(obj.arr[i].getMarks()==max){
                System.out.println("Highest scoring Student details:");
                System.out.println("Roll no: "+obj.arr[i].getRoll()+"Name: "+obj.arr[i].getName()+"Marks: "+obj.arr[i].getMarks());
            }
            if(obj.arr[i].getMarks()==min){
                System.out.println("Lowest scoring Student details: ");
                System.out.println("Roll no: "+obj.arr[i].getMarks()+"Name: "+obj.arr[i].getName()+"Marks: "+obj.arr[i].getMarks());
            }
        }
    }
}
