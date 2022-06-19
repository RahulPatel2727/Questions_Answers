/*
Q. Write a Java class, Flower, that has three instance variables of type String, int, and float,
which respectively represent the name of the flower, its number of petals, and price.
Your class must include a constructor method that initialises each variable to an appropriate value,
and your class should include methods for setting the value of each type, and getting the value of each type.
Create an array of 5 Flower objects and print the value.
 */
import java.util.*;
class flower{
    private String name;
    private int noOfPetals;
    private float price;
    public void flowerr(String name , int noOfPetals, float price){
        this.name=name;
        this.noOfPetals=noOfPetals;
        this.price = price;
    }
    public String getName(){
        return name;
    }
    public int getNoOfPetals(){
        return noOfPetals;
    }
    public float getPrice(){
        return price;
    }

    //we can use this method also for displaying the all instances.
//    public void dipAll(){
//        System.out.print(name+" "+noOfPetals+" "+price);
//    }
}
class flowers_class {
    public static void main(String[] args) {
        flower arr[] = new flower[2];
        Scanner sc = new Scanner(System.in);
        flower fl = new flower();
        for(int i =0; i<2;i++){
            System.out.println("Enter the flower name:");
            String name=sc.nextLine();
            System.out.println("Enter the no of petals");
            int noOfPetals= sc.nextInt();
            System.out.println("Enter the price");
            float price = sc.nextFloat();
            sc.nextLine();
            fl.flowerr(name,noOfPetals,price);
            arr[i]=fl;
        }
        System.out.println("All the flowers are:");
        for(flower obj: arr){
            System.out.println(obj.getName()+" "+obj.getNoOfPetals()+" "+obj.getPrice());
        }
    }
}
