package HomeWork1.task2;

public class MainTask2 {
    public static void main(String[] args) {
        Integer [] inums  = {1,2,3,4,5};
        ArrayConversion<Integer> array1= new ArrayConversion<Integer>(inums);
        array1.arrayToArrayList();

        Double [] dnums  = {1.0,2.0,3.0,4.0,5.0};
        ArrayConversion<Double> array2= new ArrayConversion<Double>(dnums);
        array2.arrayToArrayList();

        String [] snums  = {"1.0","2.0","3.0","4.0","5.0"};
        ArrayConversion<String> array3= new ArrayConversion<String>(snums);
        array3.arrayToArrayList();
    }
}
