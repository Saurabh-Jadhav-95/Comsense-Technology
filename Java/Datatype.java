public class Datatype {
    public static void main(String[] args) {
        
        byte smallNumber = 127;         
        short mediumNumber = 32000;     
        int number = 100000;            
        long largeNumber = 1000000000L; 
        
        float pi = 3.14f;               
        double precisePi = 3.14159265359; 
        
        char grade = 'A';               
        boolean isJavaFun = true;       

        
        String name = "John Doe";       
        Integer wrappedNumber = 500;    
        Double wrappedDouble = 3.14159; 
        Boolean wrappedBoolean = false; 
        
        
        System.out.println("Primitive Data Types:");
        System.out.println("byte: " + smallNumber);
        System.out.println("short: " + mediumNumber);
        System.out.println("int: " + number);
        System.out.println("long: " + largeNumber);
        System.out.println("float: " + pi);
        System.out.println("double: " + precisePi);
        System.out.println("char: " + grade);
        System.out.println("boolean: " + isJavaFun);

        System.out.println("\nReference Data Types:");
        System.out.println("String: " + name);
        System.out.println("Integer: " + wrappedNumber);
        System.out.println("Double: " + wrappedDouble);
        System.out.println("Boolean: " + wrappedBoolean);
    }
}
