// constructor in java example:
public class A {
    int a;
    int b;

    // Default constructor
    public A() {
        this(2, 3); // Call parameterized constructor
    }

    // Parameterized constructor
    public A(int a, int b) {
        this.a = a;
        this.b = b;
    }

    // Main method
    public static void main(String[] args) {
        A obj = new A();
        System.out.println("a = " + obj.a + ", b = " + obj.b);
    }
}
