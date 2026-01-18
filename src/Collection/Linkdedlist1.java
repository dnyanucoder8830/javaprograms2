package Collection;

import java.util.LinkedList;

public class Linkdedlist1 {
    public static void main(String[] args) {
        LinkedList a=new LinkedList();
        a.add(12);
        a.add("hello");
        a.addFirst(11);
        a.addLast("bye");
        System.out.println(a);
        a.removeFirst();
        a.removeLast();
        System.out.println(a);
    }
}
