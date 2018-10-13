package HomeWork6_3;

public class Task3 {
    public boolean checkArray(int[] a) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 1 && a[i] != 4) count++;
        }
        if (count == a.length) return false;
        else return true;
    }
}
