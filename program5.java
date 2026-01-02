
import java.util.*;

public class program1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // print this pattern
        /*   * * * * *
             * * * * *
             * * * * *
             * * * * *
         */
        for (int j = 1; j <= 5; j++) {
            for (int i = 1; i <= 5; i++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }



        //  print this pattern
        /*
        * * * * *
        *       *
        *       *
        * * * * * 
         */
        int n = 4;
        int m = 5;

        for (int a = 1; a <= n; a++) {
            for (int b = 1; b <= m; b++) {
                if (a == 1 || b == 1 || a == n || b == m) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }


        // print this pattern 
        /* *
           * *
           * * *
           * * * *
           
         */

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        // print this pattern
        /* 

        * * * * 
        * * *
        * *
        * 
           */

        for(int i=n; i>=1; i--){
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
