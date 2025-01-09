public class Operator {
    public static void main(String[] args) {
        // Arithmetic Operators
        int a = 10, b = 5;
        int sum = a + b;          // Addition
        int difference = a - b;   // Subtraction
        int product = a * b;      // Multiplication
        int quotient = a / b;     // Division
        int remainder = a % b;    // Modulus (Remainder)

        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + sum);
        System.out.println("a - b = " + difference);
        System.out.println("a * b = " + product);
        System.out.println("a / b = " + quotient);
        System.out.println("a % b = " + remainder);

        // Relational Operators
        boolean isEqual = a == b;    // Equal to
        boolean isNotEqual = a != b; // Not equal to
        boolean isGreaterThan = a > b; // Greater than
        boolean isLessThan = a < b;   // Less than
        boolean isGreaterThanOrEqual = a >= b; // Greater than or equal to
        boolean isLessThanOrEqual = a <= b;    // Less than or equal to

        System.out.println("\nRelational Operators:");
        System.out.println("a == b: " + isEqual);
        System.out.println("a != b: " + isNotEqual);
        System.out.println("a > b: " + isGreaterThan);
        System.out.println("a < b: " + isLessThan);
        System.out.println("a >= b: " + isGreaterThanOrEqual);
        System.out.println("a <= b: " + isLessThanOrEqual);

        // Logical Operators
        boolean x = true, y = false;
        boolean andOperation = x && y;  // Logical AND
        boolean orOperation = x || y;   // Logical OR
        boolean notOperation = !x;      // Logical NOT

        System.out.println("\nLogical Operators:");
        System.out.println("x && y: " + andOperation);
        System.out.println("x || y: " + orOperation);
        System.out.println("!x: " + notOperation);

        // Assignment Operators
        int z = 10;
        z += 5;  // z = z + 5
        z -= 3;  // z = z - 3
        z *= 2;  // z = z * 2
        z /= 4;  // z = z / 4
        z %= 3;  // z = z % 3

        System.out.println("\nAssignment Operators:");
        System.out.println("z = " + z); // z after multiple assignments

        // Bitwise Operators
        int num1 = 5;  // Binary: 0101
        int num2 = 3;  // Binary: 0011
        int andResult = num1 & num2;  // Bitwise AND
        int orResult = num1 | num2;   // Bitwise OR
        int xorResult = num1 ^ num2;  // Bitwise XOR
        int notResult = ~num1;        // Bitwise NOT

        System.out.println("\nBitwise Operators:");
        System.out.println("num1 & num2: " + andResult);  // 0101 & 0011 = 0001 (1)
        System.out.println("num1 | num2: " + orResult);   // 0101 | 0011 = 0111 (7)
        System.out.println("num1 ^ num2: " + xorResult);  // 0101 ^ 0011 = 0110 (6)
        System.out.println("~num1: " + notResult);        // ~0101 = 1010 (-6, in two's complement)
    }
}
