// This is single inheritance example
package inheritance;
public class Car{   // Car is the parent class
   void start() {   // start method in parent class
      System.out.println("Car is starting");
   }
}
class BMW extends Car {   // BMW is the child class
   void run() {  // run method in child class
      System.out.println("BMW is running");
   }
}
 class Main {
   public static void main(String[] args) {
      BMW myBMW = new BMW();
      myBMW.start(); // Calling method from parent class
      myBMW.run();   // Calling method from child class
   }
}

