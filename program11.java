import java.util.*;

public class program1{
    // AddITION of two number using function
    public static int calculateSum(int a, int b){
        int sum = a + b;
        return sum;
    }
    // find the product to used multipication on function
    public static int calcualateProdut(int a , int b){
        return a * b;
    }
    // print the factorial number 
    public static void printFactorial(int n) {
        // loop
        if (n < 0){
            System.out.println("Invalid number");
            return;
        }
        int factorial = 1;

        for(int i = n; i >= 1; i--){
            factorial = factorial * i;
        }
        System.out.println(factorial);
        return ;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the A value :");
        int a = sc.nextInt();
        System.out.println("Enter the B value :");
        int b = sc.nextInt();
        System.out.println("Enter the factoria number :");
        int n = sc.nextInt();

        int sum = calculateSum(a,b);
        System.out.println("sun of two number a + b:"+sum);
        System.out.println("product of two number a * b:"+calcualateProdut(a,b));
        printFactorial(n);
    }
}