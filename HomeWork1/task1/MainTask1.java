package HomeWork1.task1;

public class MainTask1 {

    public static void main(String[] args) {
        Integer [] inums  = {1,2,3,4,5};
        ChangeArray<Integer> array1= new ChangeArray<Integer>(inums);
        array1.swapElementsOfAnArray(1,3);
        Double [] dnums  = {1.0,2.0,3.0,4.0,5.0};
        ChangeArray<Double> array2= new ChangeArray<Double>(dnums);
        array2.swapElementsOfAnArray(1,3);
        String [] snums  = {"1.0","2.0","3.0","4.0","5.0"};
        ChangeArray<String> array3= new ChangeArray<String>(snums);
        array3.swapElementsOfAnArray(1,3);
    }
}
