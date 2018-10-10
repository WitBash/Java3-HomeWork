package HomeWork6_2;

public class Task2 {

    public int[] cutArray(int[] a) {
        int count = 0;
        int[] cutArray;
        int indexFour = 0;

        for (int i = a.length - 1; i >= 0; i--) {
            if (a[i] != 4) count++;
        }
        if (count == a.length) {
            try {
                throw new RuntimeException();
            } catch (RuntimeException exc) {
                exc.getStackTrace();
                System.out.println("В массиве отсутствует цифра 4");
                return null;
            }
        } else {
            for (int i = 0; i < a.length; i++) {
                if (a[i] == 4) indexFour = i;
            }
            cutArray = new int[a.length - indexFour - 1];
            for (int i = indexFour + 1; i < a.length; i++) {
                cutArray[i - (indexFour + 1)] = a[i];
            }
            return cutArray;
        }
    }
}
