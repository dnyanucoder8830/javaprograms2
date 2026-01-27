package Exception;

public class Exception4 {
    public static void main(String[] args) {
        int a = 24;
        int b = 16;
        if(b>18){
            System.out.println("you can vote");
        }else {
            throw new RuntimeException("you can not vote");
        }
    }
}