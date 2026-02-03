package Collection;

import java.util.LinkedHashSet;

public class Linkedhashset1 {
    public static void main(String[] args) {
        LinkedHashSet l=new LinkedHashSet();
        l.add(12);
        l.add(12);
        l.add(null);
        l.add("a");
        System.out.println(l);
    }
}
