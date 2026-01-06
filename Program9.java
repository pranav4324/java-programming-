
public class Program1 {

    public static void main(String[] args) {

        //  Print this pattern
        /*
             *             *
             * *         * *
             * * *     * * *
             * * * * * * * *
             * * * * * * * *
             * * *     * * *
             * *         * *
             *             * 
         */
        int n = 5;

        // Upper half
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            int spaces = 2 * (n - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Lower half
        for (int i = n; i >= 1; i--) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            int spaces = 2 * (n - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // print this pattern 
        /*
                  * * * * *
                * * * * *
              * * * * *
            * * * * *
          * * * * *
         */
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        // print this pattern 
        /*    
               1
              2 2
             3 3 3
            4 4 4 4
           5 5 5 5 5
           
         */
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // numbers -> print row no, row no times
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

       
    }
}
