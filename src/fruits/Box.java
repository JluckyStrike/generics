package fruits;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {
    List<T> fruitList = new ArrayList();

    public void addFruit(T fruit) {
        fruitList.add(fruit);
    }


    public float getWeight() {
        float s = 0;

        if (!fruitList.isEmpty()) {
            for (Fruit fruit : fruitList) {
                s += fruit.getWeight() * fruit.getCount();
            }

            return s;
        }

        return 0;
    }

    public void replaceFruitsToAnotherBox(Box<T> anotherBox) {
        anotherBox.fruitList.addAll(this.fruitList);
        this.fruitList.clear();
    }

    public boolean compare(Box box) {
        return this.getWeight() == box.getWeight();
    }
}
