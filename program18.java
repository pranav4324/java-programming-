
import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int pos = 3;
        int bitMask = 1 << pos;

        if ((bitMask & n) != 0) {
            System.out.println("Bit is set at position " + pos);
        } else {
            System.out.println("Bit is not set at position " + pos);
        }

        int newNumber = bitMask | n;
        System.out.println("New number after setting bit at position " + pos + " is: " + newNumber);

        int notBitMask = ~(1 << pos);
        System.out.println("Number after clearing bit at position " + pos + " is: " + (notBitMask & n));

        int oper =1 ; // update bit to 1 else update bit to 0
        // set opreration
        int bitMask2 = oper << pos;
        if(oper == 1){
            // set
            int newNumber2 = bitMask2 | n;
            System.out.println("New number after updating bit to 1 at position " + pos + " is: " + newNumber2);
        } else {
            // clear
            int notBitMask2 = ~(1 << pos);
            System.out.println("New number after updating bit to 0 at position " + pos + " is: " + (notBitMask2 & n));
        }
    }
} 