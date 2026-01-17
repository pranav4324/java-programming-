import java.util.Scanner;
public class Quctionproblem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Write a program to calcuate percentage of a given student in CBCE bord exam.
        // His marks from 5 subjects must be taken as inpute form the keybord (marks are
        // out of 100).
        System.out.println("Enter marks of subject 1:");
        int subjects1 = sc.nextInt();
        System.out.println("Enter marks of subject 2:");
        int subjects2 = sc.nextInt();
        System.out.println("Enter marks of subject 3:");
        int subjects3 = sc.nextInt();
        System.out.println("Enter marks of subject 4:");
        int subjects4 = sc.nextInt();
        System.out.println("Enter marks of subject 5:");
        int subjects5 = sc.nextInt();

        int totalmarks = subjects1 + subjects2 + subjects3 + subjects4 + subjects5;
        float percentage = (totalmarks / 500f) * 100;
        System.out.println("The percentage of the student is: " + percentage + "%");
    }
}