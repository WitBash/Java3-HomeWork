package HomeWork6_3;

public class MainTask3 {
    private static int[] array = {1, 4, 1, 4, 1, 4, 1, 4, 1};
    private static int[] array1 = {2, 5, 7, 6, 2, 8, 9, 3, 5};

    public static void main(String[] args) {
        Task3 task3 = new Task3();
        System.out.println(task3.checkArray(array));
        System.out.println(task3.checkArray(array1));
    }
}
