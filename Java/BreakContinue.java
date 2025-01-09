public class BreakContinue {
    public static void main(String[] args) {
        
        System.out.println("Break Example:");
        for (int i = 1; i <= 20; i++) {
            if (i > 10 && i % 2 == 0) {
                System.out.println("First even number greater than 10: " + i);
                break;  
            }
        }

        
        System.out.println("\nContinue Example:");
        for (int i = 1; i <= 10; i++) {
            if (i % 3 == 0) {
                continue;  
            }
            System.out.println(i);
        }
    }
}
