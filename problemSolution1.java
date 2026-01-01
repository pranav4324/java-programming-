import java.util.*;
public class problemSolution1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i = 0; i < 10; i++) {
            a = a % 2;
        }
        System.out.println(a);
    }
}
