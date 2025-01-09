public class Wrapperclass {
    public static void main(String[] args) {
        // Autoboxing (int to Integer)
        int num = 50;
        Integer wrappedNum = num;  // Autoboxing
        System.out.println("Wrapped Integer: " + wrappedNum);
        
        // Unboxing (Integer to int)
        int unboxedNum = wrappedNum;  // Unboxing
        System.out.println("Unboxed int: " + unboxedNum);
    }
}

