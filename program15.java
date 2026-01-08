import java.util.*;
public class program1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        StringBuilder sb = new StringBuilder("Prana");
        System.out.println(sb);

        // char at index 0
        System.out.println(sb.charAt(0));

        // Set char at index 0
        sb.setCharAt(0, 'P');
        System.out.println(sb);

        // insert they any work on string
        sb.insert(3, 'a');
        System.out.println(sb);

        // delete the extra 'a'
        sb.delete(3, 4);
        System.out.println(sb);
    }
}
