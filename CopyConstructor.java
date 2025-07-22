// This Java program demonstrates the use of a copy constructor.
public class CopyConstructor {
    String name;
    int age;

    // Parameterized constructor
    public CopyConstructor(String n, int a) {
        name = n;
        age = a;
    }

    // Copy constructor
    public CopyConstructor(CopyConstructor other) {
        name = other.name;
        age = other.age;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        CopyConstructor original = new CopyConstructor("Deepa", 12);
        CopyConstructor copy = new CopyConstructor(original);
        original.display();
        copy.display();
    }
}

