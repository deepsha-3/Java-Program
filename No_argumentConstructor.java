// This Java program demonstrates the use of a no-argument constructor and a parameterized constructor.
public class No_argumentConstructor {
    String name;
    int age;

    // No-argument constructor
    public No_argumentConstructor() {
        name = "Unknown";
        age = 0;
    }

    // Parameterized constructor
    public No_argumentConstructor(String n, int a) {
        name = n;
        age = a;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        No_argumentConstructor p1 = new No_argumentConstructor();                  // Uses no-arg constructor
        No_argumentConstructor p2 = new No_argumentConstructor("Deepa", 12);       // Uses parameterized constructor

        p1.display();
        p2.display();
    }
}

