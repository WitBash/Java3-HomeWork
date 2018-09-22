package HomeWork1.task2;

import java.util.ArrayList;

public class ArrayConversion <T> {
    private T[] array;
    private ArrayList<T> arrayList;
    public ArrayConversion(T[] array) {
        this.array = array;
    }

    public void arrayToArrayList(){
        arrayList = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            arrayList.add(array[i]);
        }
        for (T o: arrayList) {
            System.out.print(o+" ");
        }
        System.out.println();
    }
}
