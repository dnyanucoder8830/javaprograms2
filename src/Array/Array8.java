package Array;

public class Array8 {
    public static void main(String[] args) {
        int [][]a={
                {1,2,3},
                {2,3,4}
        };
        int [][]b={
                {2,3,4},{5,7,8}
        };
        int [][]c=new int[a.length][a[0].length];
        for (int i = 0; i <a.length; i++) {
            for (int j = 0; j <a[i].length ; j++) {
                c[i][j]=a[i][j]+b[i][j];
            }

        }
        for (int i = 0; i <c.length; i++) {
            for (int j = 0; j <c[i].length ; j++) {
                System.out.print(c[i][j]+" ");

            }
            System.out.println();

        }
    }
}
