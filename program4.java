import java.util.*;
public class program4 {
    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        // sum of print first n natuaral numbrers
        int a = sc.nextInt();

        int sum = 0;
        for(int i = 0; i<=a; i++){
            sum = sum +i;
        }
        System.out.println(sum);


        // print the table of a number input by the user.
        int n = sc.nextInt();
        for (int p = 0; p <=10; p++) {
            System.out.println(p*n);
        }
    }
}
