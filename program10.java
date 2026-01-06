
public class program2 {

    public static void main(String[] args) {
        // print this pattern 
        /*    Palindromic pattern
                 1
               2 1 2
             3 2 1 2 3
           4 3 2 1 2 3 4
         5 4 3 2 1 2 3 4 5
        
         */
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }


        // print this pattern
        /*
                  *
                * * *
              * * * * * 
            * * * * * * *
            * * * * * * *
              * * * * *
                * * *
                  *
         */

        for(int i =1; i <= n; i++){
            for(int j =1; j <=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=2*i-1; j++){
            System.out.print("*");
            }
            System.out.println();
        }

        for(int i = n; i >=1; i--){
            for(int j =1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
