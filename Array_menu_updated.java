import java.util.Scanner;
public class Array_Menu {
    int arr[];
    public Array_Menu(){
        arr=new int[10];
        for(int i =0; i<arr.length;i++){
            arr[i]=Integer.MIN_VALUE;
        }
    }

//  1
    public void insertValueAtIndex(int index, int value){
        try{
            if(arr[index]==Integer.MIN_VALUE) {
                arr[index] = value;
                System.out.println("Inserted Successfully"+"\n");
            }
            else {
                System.out.println("Already has a value."+"\n");
            }
        }catch(IndexOutOfBoundsException e){
            System.out.println("Invalid index"+"\n");
        }
        System.out.println("If you want to INSERT  press -                  1");
        System.out.println("If you want to DELETE  a value press -          2");
        System.out.println("If you want to UPDATE any index value press -   3");
        System.out.println("If you want to SEARCH  any value press -        4");
        System.out.println("If you want to Print any Index value press -    5");
        System.out.println("If you want to Print All The Value press -      6");
        System.out.println("If you want to exit press -                     7"+"\n");

        int menu = new Scanner(System.in).nextInt();
        Menu(menu);
    }

    // 2
    public void deleteValue(int value){
        int count =0;boolean t= false;

        for(int i = 0; i<arr.length;){
            if(arr[i]==value){
                int j;
                count++;
                for(j=i; j<arr.length-count;j++){
                    arr[j]=arr[j+1];
                }
                arr[j]=Integer.MIN_VALUE;
                t=true;
            }
            else {
                i++;
            }
        }
        if(t==true) {
            System.out.println("Deleted"+"\n");
        }
        else {
            System.out.println("Value is not present in the array"+"\n");
        }
        System.out.println("If you want to INSERT  press -                  1");
        System.out.println("If you want to DELETE  a value press -          2");
        System.out.println("If you want to UPDATE any index value press -   3");
        System.out.println("If you want to SEARCH  any value press -        4");
        System.out.println("If you want to Print any Index value press -    5");
        System.out.println("If you want to Print All The Value press -      6");
        System.out.println("If you want to exit press -                     7"+"\n");
        int menu = new Scanner(System.in).nextInt();
        Menu(menu);
    }

    // 4
    public void searchValue(int value){
        boolean flag=false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==value){
                flag = true;
                System.out.println("Yes, the value "+value+" is present."+"\n");
                break;
            }
        }
        if(flag == false){
            System.out.println("Not Present the value "+value+"."+"\n");
        }
        System.out.println("If you want to INSERT  press -                  1");
        System.out.println("If you want to DELETE  a value press -          2");
        System.out.println("If you want to UPDATE any index value press -   3");
        System.out.println("If you want to SEARCH  any value press -        4");
        System.out.println("If you want to Print any Index value press -    5");
        System.out.println("If you want to Print All The Value press -      6");
        System.out.println("If you want to exit press -                     7"+"\n");
        int menu = new Scanner(System.in).nextInt();
        Menu(menu);
    }

    // 3
    public void updateIndexValue(int index , int value){
        try{
            arr[index]=value;
            System.out.println("Update successfully"+"\n");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("You Can't add the value at this index."+"\n");
        }
        System.out.println("If you want to INSERT  press -                  1");
        System.out.println("If you want to DELETE  a value press -          2");
        System.out.println("If you want to UPDATE any index value press -   3");
        System.out.println("If you want to SEARCH  any value press -        4");
        System.out.println("If you want to Print any Index value press -    5");
        System.out.println("If you want to Print All The Value press -      6");
        System.out.println("If you want to exit press -                     7"+"\n");
        int menu = new Scanner(System.in).nextInt();
        Menu(menu);
    }

    // 6
    public void printAll(){
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("If you want to INSERT  press -                  1");
        System.out.println("If you want to DELETE  a value press -          2");
        System.out.println("If you want to UPDATE any index value press -   3");
        System.out.println("If you want to SEARCH  any value press -        4");
        System.out.println("If you want to Print any Index value press -    5");
        System.out.println("If you want to Print All The Value press -      6");
        System.out.println("If you want to exit press -                     7"+"\n");
        int menu = new Scanner(System.in).nextInt();
        Menu(menu);
    }

    // 5
    public void printIndexValue(int index){
        try{
            System.out.println(arr[index]);
        }catch (IndexOutOfBoundsException e){
            System.out.println("No element here"+"\n");
        }
        System.out.println("If you want to INSERT  press -                  1");
        System.out.println("If you want to DELETE  a value press -          2");
        System.out.println("If you want to UPDATE any index value press -   3");
        System.out.println("If you want to SEARCH  any value press -        4");
        System.out.println("If you want to Print any Index value press -    5");
        System.out.println("If you want to Print All The Value press -      6");
        System.out.println("If you want to exit press -                     7"+"\n");
        int menu = new Scanner(System.in).nextInt();
        Menu(menu);
    }

    public static void main(String[] args) {
        System.out.println("Lets play with 10 elements of an array...."+"\n");
        Array_Menu obj = new Array_Menu();
        System.out.println("If you want to INSERT  press -                  1");
        System.out.println("If you want to DELETE  a value press -          2");
        System.out.println("If you want to UPDATE any index value press -   3");
        System.out.println("If you want to SEARCH  any value press -        4");
        System.out.println("If you want to Print any Index value press -    5");
        System.out.println("If you want to Print All The Value press -      6");
        System.out.println("If you want to exit press -                     7"+"\n");
        int menu = new Scanner(System.in).nextInt();
        obj.Menu(menu);
    }


    // for menu
    public void Menu(int menu) {
        Scanner sc = new Scanner(System.in);
        switch (menu) {
            case 1 -> {
                System.out.println("Enter the Index and Value");
                insertValueAtIndex(sc.nextInt(), sc.nextInt());
            }
            case 2 -> {
                System.out.println("Enter the Value to be delete");
                deleteValue(sc.nextInt());
            }
            case 3 -> {
                System.out.println("Enter the Index and Value to update");
                updateIndexValue(sc.nextInt(), sc.nextInt());
            }
            case 4 -> {
                System.out.println("Enter the Value to be search");
                searchValue(sc.nextInt());
            }
            case 5 -> {
                System.out.println("Enter the Index to print the index value");
                printIndexValue(sc.nextInt());
            }
            case 6 -> {
                printAll();
            }
            case 7 -> {
                System.out.println("Thank you for using this program.🙏🏻");
            }
            default -> {
                System.out.println("You entered wrong key try again"+"\n");
                System.out.println("If you want to INSERT  press -                  1");
                System.out.println("If you want to DELETE  a value press -          2");
                System.out.println("If you want to UPDATE any index value press -   3");
                System.out.println("If you want to SEARCH  any value press -        4");
                System.out.println("If you want to Print any Index value press -    5");
                System.out.println("If you want to Print All The Value press -      6");
                System.out.println("If you want to exit press -                     7"+"\n");
                int mnu = new Scanner(System.in).nextInt();
                Menu(mnu);

            }
        }
    }
}
