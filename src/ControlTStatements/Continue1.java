package ControlTStatements;

public class Continue1 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            if(i==3){
                System.out.println("Skippning i="+i);
                continue;
            }
            System.out.println("i="+i);
        }
        System.out.println("Loop completed");
    }
}
