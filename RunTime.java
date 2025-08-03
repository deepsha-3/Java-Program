// Parent.java
 class Parent {
    public void display() {
        System.out.println("It is parent.");
    }
}

// Child.java
 class Child extends Parent {
    @Override
    public void display() {
        System.out.println("It is child.");
    }
}

// Runtime.java
public class RunTime {
    public static void main(String[] args) {
        Parent obj = new Child();  // Runtime polymorphism
        obj.display();             // Calls Child's display() method
    }
}



