package Collection;

import java.util.LinkedHashSet;

public class LinkedSet1 {
    public static void main(String[] args) {
        LinkedHashSet l=new LinkedHashSet();
        l.add(21);
        l.add(false);
        l.add(null);
        l.add(21);
        l.add("hello");
        System.out.println(l);
    }
}
