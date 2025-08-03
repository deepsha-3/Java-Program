// ArithmeticExample is an example of handling arithmetic exceptions in Java.

public class ArithmeticExample {
    public static void main(String[] args) {
        try {
            int a = 5;
            int b = 0;
            int result = a / b;  // This will cause ArithmeticException
            System.out.println("Print Result: " + result);
        } catch (ArithmeticException e) { // Catch must include exception variable
            System.out.println("Exception: " + e.getMessage());
        } finally {
            System.out.println("This is finally finished");
        }
    }
}
