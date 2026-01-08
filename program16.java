public class program {
    public static void main(String[] args) {
        // operator
        int a = 10;
        int b = 20;

        // Arithmetic Operators
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (b - a));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (b / a));
        System.out.println("Modulus: " + (b % a));

        // Relational Operators
        System.out.println("Is a equal to b? " + (a == b));
        System.out.println("Is a not equal to b? " + (a != b));
        System.out.println("Is a greater than b? " + (a > b));
        System.out.println("Is a less than b? " + (a < b));
        System.out.println("Is a greater than or equal to b? " + (a >= b));
        System.out.println("Is a less than or equal to b? " + (a <= b));

        // Logical Operators
        boolean x = true;
        boolean y = false;
        System.out.println("Logical AND: " + (x && y));
        System.out.println("Logical OR: " + (x || y));
        System.out.println("Logical NOT: " + (!x));

        // Bitwise Operators
        int p = 5; // 0101 in binary
        int q = 3; // 0011 in binary
        System.out.println("Bitwise AND: " + (p & q)); // 0001
        System.out.println("Bitwise OR: " + (p | q)); // 0111
        System.out.println("Bitwise XOR: " + (p ^ q)); // 0110
        System.out.println("Bitwise NOT: " + (~p)); // 1010
        System.out.println("Left Shift: " + (p << 1)); // 1010
        System.out.println("Right Shift: " + (p >> 1)); // 0010

        // Assignment Operators
        int c = 15;
        c += 5; // c = c + 5
        System.out.println("c after += 5: " + c);
        c -= 3; // c = c - 3
        System.out.println("c after -= 3: " + c);
        c *= 2; // c = c * 2
        System.out.println("c after *= 2: " + c);
        c /= 4; // c = c / 4
        System.out.println("c after /= 4: " + c);
        c %= 3; // c = c % 3
        System.out.println("c after %= 3: " + c);

        // Ternary Operator
        int max = (a > b) ? a : b;
        System.out.println("Maximum of a and b: " + max);
        int min = (a < b) ? a : b;
        System.out.println("Minimum of a and b: " + min);
        int absA = (a >= 0) ? a : -a;
        System.out.println("Absolute value of a: " + absA);
        int absB = (b >= 0) ? b : -b;
        System.out.println("Absolute value of b: " + absB);
        int signA = (a > 0) ? 1 : (a < 0) ? -1 : 0;
        System.out.println("Sign of a: " + signA);
        int signB = (b > 0) ? 1 : (b < 0) ? -1 : 0;
        System.out.println("Sign of b: " + signB);


        // Unary Operators
        int d = 5;
        System.out.println("Original d: " + d);
        System.out.println("Post-increment d: " + (d++)); // 5
        System.out.println("After Post-increment d: " + d); // 6
        System.out.println("Pre-increment d: " + (++d)); // 7
        System.out.println("Post-decrement d: " + (d--)); // 7
        System.out.println("After Post-decrement d: " + d); // 6
        System.out.println("Pre-decrement d: " + (--d)); // 5



        // System.out.println("Unary plus of d: " + (+d)); // 5
        System.out.println("Unary minus of d: " + (-d)); // -5


        // System.out.println("Logical NOT of true: " + (!true)); // false
        System.out.println("Logical NOT of true: " + (!true)); // false

        // Typeof Operator (using instanceof)
        Object obj = "Hello, World!";
        if (obj instanceof String) {
            System.out.println("obj is a String");
        } else {
            System.out.println("obj is not a String");
        }

        // sizeof Operator (using length for arrays)
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Size of arr: " + arr.length);

        // Address-of Operator (using hashCode)
        System.out.println("Address of obj (hashCode): " + System.identityHashCode(obj));

        // Pointer-to Operator (not applicable in Java)
        // In Java, pointers are not directly supported, but references can be used.
        // No direct equivalent exists in Java for C/C++ pointer operators.
        
    }
}