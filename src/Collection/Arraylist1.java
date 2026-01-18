package Collection;

import java.util.ArrayList;

public class Arraylist1 {
    public static void main(String[] args) {
        ArrayList a=new ArrayList();
        a.add(2);
        a.add(2.3);
        a.remove(1);
        System.out.println(a);
        a.add(1,56);
        System.out.println(a);
    }
}
