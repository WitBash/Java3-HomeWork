package HomeWork1.task1;

public class ChangeArray <T> {
    private T [] array;

    public ChangeArray(T[] array) {
        this.array = array;
    }

    public void swapElementsOfAnArray(int index1,int index2){
        T arr1 = array[index1];
        T arr2 = array[index2];
        array[index1] = arr2;
        array[index2] = arr1;
        for (int i = 0; i < array.length ; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
}
