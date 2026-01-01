package ObjectClass;

class Student{
    int id = 32;
    String name = "hari";

    @Override
    public String toString() {
        return "Student id="+id+", name="+name;
    }
}

public class ObjectClass3 {
    public static void main(String[] args) {
        Student obj = new Student();
        System.out.println(obj);
    }
}
