public class SoftToy extends Toy {

    public SoftToy(String name, int quantity, double weight) {
        super(name, quantity, weight);
    }

    @Override
    public String toString() {
        return "SoftToy{" +
                "name='" + getName() + '\'' +
                ", quantity=" + getQuantity() +
                ", weight=" + getWeight() +
                '}';
    }
}
