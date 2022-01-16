import java.util.*;
public class vovel_count_by_hashMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String str = sc.nextLine();
        HashMap <Character,Integer> obj = new HashMap<>();
//        System.out.println(obj.size());
        int a = 0, e = 0, ii = 0, o = 0, u = 0;
        int i = 0;
        while( i < str.length()){
            if (str.charAt(i) == 'a') {
                a++;
            }
            else if (str.charAt(i) == 'e') {
                e++;
            }
            else if (str.charAt(i) == 'i') {
                ii++;
            }
            else if (str.charAt(i) == 'o') {
                o++;
            }
            else if (str.charAt(i) == 'u') {
                u++;
            }
            i++;
        }

        obj.put('a',a);
        obj.put('e',e);
        obj.put('i',ii);
        obj.put('o',o);
        obj.put('u',u);

        //1
        for(Map.Entry map : obj.entrySet()){
            System.out.println(map.getKey()+" "+map.getValue());
        }

        //2
//        Iterator it = obj.entrySet().iterator();
//        while(it.hasNext()) {
//            System.out.println(it.next());
//        }

        //3
//        obj.forEach((k,v)-> System.out.println(k+" "+v));
    }
}
