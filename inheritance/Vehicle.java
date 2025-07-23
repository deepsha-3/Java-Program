// This is multilevel inheritance in java 
package inheritance;
public class Vehicle {   //grandparent class
    void start() {   //
        System.out.println("Vehicle is starting");
    }
}

class Car extends Vehicle {  //parent class
    void run() {
        System.out.println("Car is running");
    }
}

class BMW extends Car {  //child class
    void park() {
        System.out.println("BMW is parking");
    }

    public static void main(String[] args) {
        BMW myBMW = new BMW();
        myBMW.start();
        myBMW.run();
        myBMW.park();
    }
}
