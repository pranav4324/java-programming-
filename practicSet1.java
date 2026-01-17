import java.util.Scanner;
public class practicSet1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // what will be the result of athe following expresso=ion 
        // flaoat a = 7/ 4 * 9/2;
        float a = 7 / 4 * 9 / 2;
        System.out.println(a);
        
        // write ajava program to encrypt a grade by adding 8 ti it . Decrypt it to show the correct grade.
        char grade = 'B';
        grade = (char)(grade + 8);
        System.out.println("The encrypted grade is: " + grade);
        grade = (char)(grade - 8);
        System.out.println("The decrypted grade is: " + grade);
        
        // use comparison operators to find out whether given number is greater than the user entered number or not.
        int a1 = sc.nextInt();
        System.out.println("Enter a number to compare:"+(a1>8));


        //  write the following expression in a java program 
        // V^2 - U^2 / 2 a s

        int V = 10;
        int U = 5;
        int a3 = 3;
        int s = 2;
        int result = (V*V - U*U) / (2 * (a3 * s));
        System.out.println("The result of the expression (V^2 - U^2) / (2as) is: " + result);


        // find the value of the following expression :
        int x1 = 7;
        int a4 = (7*49)/7 + (35/7);
        System.out.println("The value of the expression is: " + a4);
    } 
}
