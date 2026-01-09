public class program1 {
    public static void main(String[] args) {
        // Bit Manipulation Examples
        int num = 29; // 11101 in binary
        System.out.println("Original number: " + num);
        // Check if the 3rd bit is set
        int bitPosition = 3;
        boolean isSet = (num & (1 << bitPosition)) != 0;
        System.out.println("Is the 3rd bit set? " + isSet);
        // Set the 2nd bit
        num = num | (1 << 2);
        System.out.println("Number after setting 2nd bit: " + num);
        // Clear the 4th bit
        num = num & ~(1 << 4);
        System.out.println("Number after clearing 4th bit: " + num);
        // Toggle the 0th bit
        num = num ^ (1 << 0);
        System.out.println("Number after toggling 0th bit: " + num);

    }
}
