import java.util.Scanner;

public class program_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello world ");

        // write a program to sum three numbrs in java
        System.out.println("Enter three numbers to sum:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int sum = num1 + num2 + num3;
        System.out.println("The sum of three numbers is: " + sum);

        // write a program of calculate CGPA using marks of three subjects (out of 100)
        int physics, chemistry, mathematics;
        System.out.println("Enter marks of Physics, Chemistry and Mathematics:");
        physics = sc.nextInt();
        chemistry = sc.nextInt();
        mathematics = sc.nextInt();
        float cgpa = (physics + chemistry + mathematics) / 30.0f;
        System.out.println("Your CGPA is: " + cgpa);

        // write aprogram which asks the user to enter his/her name and greets them with
        // "Hello<name>,have a good day" text.
        System.out.println("Enter your name:");
        String name = sc.next();
        System.out.println("Hello " + name + ", have a good day!");
    
        // write a java program to convert kilolmeters to miles
        System.out.println("Enter distance in kilometers:");
        double kilometers = sc.nextDouble();
        double miles = kilometers * 0.621371;
        System.out.println("Distance in miles: " + miles);


        // write a java program to detect whether a numbers enterexd by the user is integer or not.
        System.out.println("Enter a number to check if it's an integer:");
        if (sc.hasNextInt()) {
            int intValue = sc.nextInt();
            System.out.println(intValue + " is an integer.");
        } else {
            System.out.println("The entered value is not an integer.");
        }
    }
}