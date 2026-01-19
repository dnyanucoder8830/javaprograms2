package Collection;

import java.util.HashSet;

public class Hashset1 {
    public static void main(String[] args) {
        HashSet<Integer> h=new HashSet<>();
        h.add(12);
        h.add(45);
        h.add(67);
//        h.add(2.2); it will throw error
        System.out.println(h);
    }
}
