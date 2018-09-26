package HomeWork1.task3;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {
    private List<T> boxArrayList;
    public Box() {
        this.boxArrayList = new ArrayList<>();
    }

    public float getBoxWeight() {
        float sum = 0.0f;
        for (T o : this.boxArrayList) {
            sum += o.getWeight();
        }
        return sum;
    }

    public void setFruitInBox(T fruit) {
        this.boxArrayList.add(fruit);
    }

    public boolean compare(Box box) {
        if (this.getBoxWeight() == box.getBoxWeight()) return true;
        else return false;
    }

    public void pourFruitIntoAnotherBox(Box <T> box) {
        for (int i = 0; i < this.boxArrayList.size(); i++) {
            box.setFruitInBox(this.boxArrayList.get(i));
        }
        this.boxArrayList.clear();
    }
}
