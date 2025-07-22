// This code defines a class named `ParameterConstructor` with a parameterized constructor.
public class ParameterConstructor {
    String studentName;
    int studentAge;

    // Parameterized constructor
    public ParameterConstructor(String name, int age) {
        studentName = name;
        studentAge = age;
    }

    public static void main(String[] args) {
        ParameterConstructor s1 = new ParameterConstructor("Dipisha", 12);
        System.out.println("Student Name: " + s1.studentName);
        System.out.println("Student Age: " + s1.studentAge);
    }
}

