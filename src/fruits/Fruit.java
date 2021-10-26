package fruits;

public abstract class Fruit {

    private float weight;
    private int count;

    public Fruit(float weight, int count) {
        this.weight = weight;
        this.count = count;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
