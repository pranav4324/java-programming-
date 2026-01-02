public class program4 {
    public static void main(String[] args) {
        // print this pattern 
        /*
                 * * * * 
                * * * *
               * * * * 
              * * * *
             * * * *
         */
        int n = 25;
        int m = 4;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <=m; j++){
                System.out.print("*");
            }
            System.out.println(); 
        }
    }
}
