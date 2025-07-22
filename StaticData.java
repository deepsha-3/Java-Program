  // This Java program demonstrates the use of static variables and methods.
public class StaticData {
  
    static int count = 0;

    public void increment() {
        count++;
    }
    public static void main(String[] args) {
        StaticData obj1 = new StaticData();
        obj1.increment();
        System.out.println("Count: " + StaticData.count);
    }
}


