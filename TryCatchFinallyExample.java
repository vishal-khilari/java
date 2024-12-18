public class 
 {
    public static void main(String[] args) {
    try {
    int result = 10 / 0; // This will throw ArithmeticException
    System.out.println(result);
    } catch (ArithmeticException e) {
    System.out.println("Exception caught: " + e.getMessage());
    } finally {
    System.out.println("Finally block executed.");
    }
    }
    }