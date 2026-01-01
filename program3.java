
import java.util.*;

public class program3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // creating loop is (for ,do-while , while)
        for (int i = 0; i < 10; i++) {
            System.out.print(i);
            System.out.println("Hello this is code this parfet ");
        }

        // print the number 0 to 10 to show in output //
        // for (int counter = 0; counter < 10; counter++) {
        //     System.out.println(counter);
        // } 
        // while loop to show 
        int a = 0;
        while (a < 10) {
            System.out.println(a);
            a = a + 1;
        }

        // do - while loop to show
        int b = 0;
        do {
            System.out.println(b);
            b = b + 1;
        } while (b < 7);
    }
}
