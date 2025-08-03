
// Parent.java
class Parent {
    public void write() {
        System.out.println("Parent write()");
    }
}

// Child.java
class Child extends Parent {
    @Override
    public void write() {
        System.out.println("Child write.");
    }
}

// Main.java
public class MethodOverriding {
    public static void main(String[] args) {
        Parent obj = new Child();  // Upcasting
        obj.write();               // Calls Child's overridden method
    }
}
