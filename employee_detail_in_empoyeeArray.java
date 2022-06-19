/*
Q. Write a program to create a class (Employee) with the information given below.
1. emp_id
2. name
	1. first_name
	2. last_name
3. address
    1. area
    2. city
    3. state
4. salary
5. designation
Read and print the data by creating  Employee array
Hint:- aggregation / containership
 */
import java.util.*;
class employee{
    int emp_id;
    String first_name,last_name;
    String area,city,state;
    int salary;
    String designation;
    employee(int emp_id,String first_name,String last_name,String area, String city, String state, int salary, String designation){
        this.emp_id=emp_id;
        this.first_name=first_name;
        this.last_name=last_name;
        this.area=area;
        this.city=city;
        this.state= state;
        this.salary= salary;
        this.designation= designation;
    }
}
class ques {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Total employee:");
        int n=sc.nextInt();
        employee Employee[]=new employee[n];
        for(int i=0;i<Employee.length;i++){
            System.out.println("Enter the details of employee no: "+(i+1));
            System.out.println("enter id");
            int id=sc.nextInt();
            System.out.println("enter first name ");
            String first=sc.next();
            System.out.println("enter last name ");
            String last=sc.next();
            sc.nextLine();
            System.out.println("enter the area");
            String area= sc.nextLine();
            System.out.println("enter the city");
            String city=sc.next();
            System.out.println("enter the state");
            sc.nextLine();
            String state=sc.nextLine();
            System.out.println("enter the salary");
            int salary =sc.nextInt();
            sc.nextLine();
            System.out.println("enter the designation");
            String designation = sc.nextLine();
            Employee[i]=new employee(id,first,last,area,city,state,salary,designation);
        }

        //print the all employee details
        System.out.println("Id  Name  Address  Salary  Designation");
        int ii=0;
        for(employee i :Employee){
            System.out.println("Employee ....");
            System.out.println(i.emp_id);
            System.out.println(i.first_name+" "+i.last_name);
            System.out.println(i.area+" "+i.city+" "+i.state);
            System.out.println(i.salary);
            System.out.println(i.designation);
            System.out.println();
        }

    }
}
