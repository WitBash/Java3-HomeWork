package HomeWork6_2;

public class MainTask2 {
    private static int[] array = {2, 3, 4, 5, 1, 4, 3, 5, 8};

    public static void main(String[] args) {
        Task2 task2 = new Task2();
        for (int o : task2.cutArray(array)) {
            System.out.print(o + " ");
        }
    }
}
