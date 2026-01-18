package Collection;

import java.util.Vector;

public class Vector1 {
    public static void main(String[] args) {
        Vector a = new Vector();
        a.add(1);
        a.add("hello");
        System.out.println(a);
        a.removeAll(a);
        System.out.println(a);

    }
}
