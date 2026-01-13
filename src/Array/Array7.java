package Array;

public class Array7 {
    public static void main(String[] args) {
        int[][]a= {
                {1, 2, 3, 4, 5},
                {1,2,3,4,5}
        };
        int [][]b={
                {1,2,3,4,5},
                {1,2,3,4,5}
        };
        for (int i = 0; i <a.length; i++) {
            for (int j = 0; j <a[i].length ; j++) {
               if(a[i][j] != b[i][j]) {
                   System.out.println("the are not equal");
              return;
               }

            }

        }


        System.out.println("the are equal");
    }
}
