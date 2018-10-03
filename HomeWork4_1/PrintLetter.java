package HomeWork4_1;

public class PrintLetter {
    private String str = "C";
    private int countA = 0;
    private int countB = 0;
    private int countC = 0;

    public synchronized boolean printA() {
        if (countA == 5) return false;
        while (!str.equals("C")) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        if (str.equals("C") && countA != 5) {
            System.out.print("A");
            str = "A";
            countA++;
            notifyAll();
        }
        return true;
    }

    public synchronized boolean printB() {
        if (countB == 5) return false;
        while (!str.equals("A")) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        if (str.equals("A")) {
            System.out.print("B");
            str = "B";
            countB++;
            notifyAll();
        }
        return true;
    }

    public synchronized boolean printC() {
        if (countC == 5) return false;
        while (!str.equals("B")) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        if (str == "B") {
            System.out.print("C");
            str = "C";
            countC++;
            notifyAll();
        }
        return true;
    }
}


