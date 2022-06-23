import java.util.*;

public class test2 {
    public static void main(String[] args) {
        List<List<Integer>>list=new ArrayList<>();
        List l=new ArrayList();
        l.add(1);
        l.add(3);
        l.add(4);
        list.add(l);
        list.add(l);
        list.add(l);

        System.out.println(list);
    }
}
