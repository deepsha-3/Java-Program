public class methodOverloading {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }
    public static void main(String[] args) {
        methodOverloading obj = new methodOverloading();
        System.out.println("Sum of integers: " + obj.add(5, 10)); 
        System.out.println("Sum of doubles: " + obj.add(5.5, 10.5)); 
    }

}

