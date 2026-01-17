public class QuickQuiz {
    public static void main(String[] args) {
        // how will you write the folowing expression in java ?
        // X-Y/2 ,
        // b^2 - 4 ac/ 2a ,
        // v^2 - u^2 ,
        // a * b - d
        int x = 10;
        int y = 4;
        int a = 2;
        int b = 3;
        int c = 5;
        int d = 6;
        int v = 8;
        int u = 2;
        int result1 = x - y / 2;
        int result2 = (b * b - 4 * a * c) / (2 * a);
        int result3 = v * v - u * u;
        int result4 = a * b - d;
        System.out.println("Result of X - Y/2: " + result1);
        System.out.println("Result of (b^2 - 4ac) / 2a: " + result2);
        System.out.println("Result of v^2 - u^2: " + result3);
        System.out.println("Result of a * b - d: " + result4);



        //  can you make incrrement and decrement operator on a java veriable ?
        int num = 5;
        System.out.println("Original number: " + num);
        num++; // increment
        System.out.println("After increment: " + num);
        num--; // decrement
        System.out.println("After decrement: " + num);
        ++num; // pre-increment
        System.out.println("After pre-increment: " + num);
        --num; // pre-decrement
        System.out.println("After pre-decrement: " + num);


        // what will be the value if tge folloeing expressions (X).
        int y1 = 7;
        int x1 = ++y1 * 8;
        System.out.println("The value of x is: " + x1);

        // charecter to used they make increment and decrement operator ?
        char ch = 'A';
        System.out.println("Original character: " + ch);
        ch++; // increment
        System.out.println("After increment: " + ch);
        ch--; // decrement
        System.out.println("After decrement: " + ch);
        
    }
}
