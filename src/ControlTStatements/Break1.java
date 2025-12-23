package ControlTStatements;

public class Break1 {
    public static void main(String[] args) {
        int i;
        for (i = 1; i <= 5; i++) {
            if (i == 3) {
                System.out.println("Breaking the loop when i=" + i);
                break;
            }
            System.out.println("i=" + i);
        }
        System.out.println("loop is ended!");
    }
}