import org.w3c.dom.DOMStringList;

import java.util.*;

public class test2 {
    public static void main(String[] args) {
        List <String >list = new ArrayList<>();
        list.add("");
        list.add("rahul");
        list.add("patel");
        list.add("singh");
        list.add("patel");
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}
