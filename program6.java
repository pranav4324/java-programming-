
public class program2 {

    public static void main(String[] args) {
        // print this pattern 
        /*
               *
             * *
           * * *
         * * * *
         */
        int n = 4;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // print this pattern 
        /*
        1 
        1 2 
        1 2 3
        1 2 3 4
         */
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        // print this pattern 
        /*
            1 2 3 4 
            1 2 3
            1 2 
            1
         */
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        // print this patterm
        /* 
        1
        2 3
        4 5 6
        7 8 9 10
         */
        int number = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(number);
                number++;  //number is = number +1; to show
            }
            System.out.println();
        }

        //    print this pattern
        /* 
    1
    0 1
    1 0 1
    0 1 0 1
         */
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                int sum = i + j;
                if (sum % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
                System.out.println("");
            }
        }
    }
}
 