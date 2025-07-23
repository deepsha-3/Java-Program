// This is a Hierarchical inheritance in Java 


class Vehicle {
    void fuelUp() {
        System.out.println("Refueling...");
    }
}

class Truck extends Vehicle {
    void loadCargo() {
        System.out.println("Cargo loaded.");
    }
}

class Motorcycle extends Vehicle {
    void kickStart() {
        System.out.println("Motorcycle kick-started.");
    }
}

public class HierarchicalIn {
    public static void main(String[] args) {
        Truck t = new Truck();
        t.fuelUp();
        t.loadCargo();

        Motorcycle m = new Motorcycle();
        m.fuelUp();
        m.kickStart();
    }
}


    
