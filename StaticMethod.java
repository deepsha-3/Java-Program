// This Java program demonstrates the use of static and non-static methods.

// It shows how static methods can access static variables but not instance variables.

public class StaticMethod {
    static int a = 40;     // Static variable (shared across all instances)
    int b = 50;            // Instance variable (unique to each object)

    void simpleDisplay() {
        System.out.println("a (static): " + a);
        System.out.println("b (non-static): " + b);
    }

    static void staticDisplay() {
        System.out.println("a (static): " + a);
        // System.out.println(b);            //  Cannot access non-static member 'b' here
    }

    public static void main(String[] args) {
        StaticMethod obj = new StaticMethod(); // Create an instance
        obj.simpleDisplay();                   // Calls non-static method
    }
}
