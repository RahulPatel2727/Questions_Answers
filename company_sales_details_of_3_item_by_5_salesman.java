//slaes details in a company of items and salseman.
import java.util.Scanner;
class Company{
    int item1,item2,item3;
    Company(int item1, int item2, int item3){
        this.item1= item1;
        this.item2= item2;
        this.item3= item3;
    }
}
 class company_Sales_details {
    Company emp_sales[];
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        company_Sales_details obj = new company_Sales_details();
        obj.emp_sales= new Company[5];
        for(int i =0; i<obj.emp_sales.length; i++){
            System.out.println("Enter the sales of all items sold by salesman:"+(i+1));
            System.out.println("item_1   item_2   item_3");
            obj.emp_sales[i]=new Company(s.nextInt(),s.nextInt(),s.nextInt());
        }
        for(int i = 0 ; i<obj.emp_sales.length; i++){
            System.out.println("Total sales by salesman "+(i+1)+" is:");
            System.out.println(obj.emp_sales[i].item1+obj.emp_sales[i].item2+obj.emp_sales[i].item3);
        }
        int item1=0,item2=0,item3=0;
        for(int i = 0; i<obj.emp_sales.length;i++){
            item1+=obj.emp_sales[i].item1;
            item2+=obj.emp_sales[i].item2;
            item3+= obj.emp_sales[i].item3;
        }
        System.out.println("Total sales of item 1 is: "+item1);
        System.out.println("Total sales of item 2 is: "+item2);
        System.out.println("Total sales of item 3 is: "+item3);
    }
}
