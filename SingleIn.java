// This is a single inheritance example in Java


// Parent class
class Car {
    void start() {
        System.out.println("Car is starting");
    }
}

// Child class that inherits from Car
class BMW extends Car {
    void run() {
        System.out.println("BMW is running");
    }
}

// Main class with the entry point
public class SingleIn {
    public static void main(String[] args) {
        BMW myBMW = new BMW();
        myBMW.start(); // Inherited from Car
        myBMW.run();   // Defined in BMW
    }
}
