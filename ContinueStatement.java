// This Java program demonstrates the use of the continue statement in a for loop.

public class ContinueStatement {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {  //  print odd numbers and skip even numbers
                continue;
            }
            System.out.println(i);
        }
    }
}
 

