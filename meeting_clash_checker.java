/*
Q.In GLA University there is various department. It is asked to
every dept to conduct meeting for all the employees of GLA University.
The central Management asked the dept kindly share starting time and
ending time of the meeting in 24 hours format so that after verifying
it will be circulated among the GLA employees. But there is a problem
that before circulating the meeting information, the central management
will find out if there are any clashes between time or not. If there are
clashes it means the employee cannot attend all the meetings. Can you help
central management to find it out

// use this class structure

public class TimeInterval
{
 int start;
 int end;
// use constructor, getter and setter methods as per requirement
public boolean canAttendMeeting(TimeInterval [ ] tlarr)
{
	// set of statements
}

 Hint:- Single Dimension array
 */

import java.util.*;
class timeInterval{
   private int start;
    private int end;
    private String meetingPurpose;
    timeInterval(String meetingPurpose, int start, int end){
        this.meetingPurpose = meetingPurpose;
        this.start=start;
        this.end = end;
    }
    timeInterval(){}
    public int getStart(){
        return start;
    }
    public int getEnd(){
        return end;
    }
    public String getMeetingPurpose(){
        return meetingPurpose;
    }

    public boolean canAttendMeeting(timeInterval obj[]){
        for( int i=0; i<obj.length; i++){
            for(int j=0; j<obj.length ; j++){
                if (i==j){continue;}
                else if(obj[i].getStart()<=obj[j].getStart() && obj[i].getEnd()>= obj[j].getStart()){
                    System.out.println("The very First clash is between : \n"+obj[i].getMeetingPurpose());
                    System.out.println(obj[i].getStart()+" to "+obj[i].getEnd());
                    System.out.println(obj[j].getMeetingPurpose()+"\n"+obj[j].getStart()+" to "+obj[j].getEnd());
                    System.out.println("So,");
                    return false;
                }
            }
        }
        System.out.println("NO clash so,");
        return true;
    }
}


class newQ2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("total schedule for today:");
        int size = sc.nextInt();
        timeInterval arr[]= new timeInterval[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the schedule " + (i + 1));
            System.out.println("Who take the meeting");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("Staring time");
            int start = sc.nextInt();
            System.out.println("End time ");
            int end = sc.nextInt();
            arr[i]=new timeInterval(name,start,end);
        }

//        for(int i =0; i<arr.length; i++){
//            if(arr[i].getStart()%2==0){
//                System.out.println(arr[i].getStart());
//            }
//        }
        if(new timeInterval().canAttendMeeting(arr)==true){
            System.out.println("you can take the meeting.");
        }
        else {
            System.out.println("you can't take the meeting due to clashing");
        }
    }
}
