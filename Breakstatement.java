// This Java program demonstrates the use of a break statement in a for loop.

public class Breakstatement {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {           //  exit the loop when the variable i equals 5.
                System.out.println("Loop interrupted at i = " + i);
                break;
            }
            System.out.println("i: " + i);
        }
        System.out.println("Break statement executed");
    }
}



