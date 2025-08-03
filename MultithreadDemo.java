class NumberPrinter extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("[Numbers] " + i);
            try {
                Thread.sleep(1000); // simulate delay
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e.getMessage());
            }
        }
    }
}

class LetterPrinter extends Thread {
    public void run() {
        for (char ch = 'A'; ch <= 'E'; ch++) {
            System.out.println("[Letters] " + ch);
            try {
                Thread.sleep(1000); // simulate delay
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e.getMessage());
            }
        }
    }
}

public class MultithreadDemo {
    public static void main(String[] args) {
        NumberPrinter numThread = new NumberPrinter();
        LetterPrinter letterThread = new LetterPrinter();

        numThread.start();
        letterThread.start();
    }
}
