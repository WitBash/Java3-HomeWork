package HomeWork4_1;

public class Main {
    private static final PrintLetter pl = new PrintLetter();

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (pl.printB()) pl.printB();
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (pl.printC()) pl.printC();
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (pl.printA()) pl.printA();
            }
        }).start();
        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
        }
        System.out.println();
        System.out.println("Конец!");
    }
}

