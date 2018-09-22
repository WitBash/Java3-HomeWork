package HomeWork1.task3;

public class MainTask3 {
    public static void main(String[] args) {
        Fruit apple1 = new Apple(0.1f);
        Fruit apple2 = new Apple(0.15f);
        Fruit apple3 = new Apple(0.2f);

        Fruit apple4 = new Apple(0.1f);
        Fruit apple5 = new Apple(0.15f);
        Fruit apple6 = new Apple(0.2f);

        Fruit orange1 = new Orange(0.3f);
        Fruit orange2 = new Orange(0.2f);
        Fruit orange3 = new Orange(0.25f);

        Box boxApple1 = new Box();
        Box boxOrange = new Box();
        Box boxApple2 = new Box();

        boxApple1.setFruitInBox(apple1);
        boxApple1.setFruitInBox(apple2);
        boxApple1.setFruitInBox(apple3);

        boxOrange.setFruitInBox(orange1);
        boxOrange.setFruitInBox(orange2);
        boxOrange.setFruitInBox(orange3);

        boxApple2.setFruitInBox(apple4);
        boxApple2.setFruitInBox(apple5);
        boxApple2.setFruitInBox(apple6);

        System.out.println("Вес коробки 1 с яблоками равен " + boxApple1.getBoxWeight());
        System.out.println("Вес коробки с апельсинами равен " + boxOrange.getBoxWeight());

        System.out.println(boxOrange.compare(boxApple1));

        System.out.println("Вес коробки 2 с яблоками равен " + boxApple2.getBoxWeight());
        boxApple1.pourFruitIntoAnotherBox(boxApple2);
        System.out.println("Вес коробки 2 с яблоками после пересыпки равен " + boxApple2.getBoxWeight());
        System.out.println("Вес коробки 1 с яблоками после пересыпки равен " + boxApple1.getBoxWeight());
    }
}
