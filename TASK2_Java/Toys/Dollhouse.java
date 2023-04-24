public class Dollhouse extends Toy {

    public Dollhouse(String name, int quantity, double weight) {
        super(name, quantity, weight);
    }

    @Override
    public String toString() {
        return "Dollhouse{" +
                "name='" + getName() + '\'' +
                ", quantity=" + getQuantity() +
                ", weight=" + getWeight() +
                '}';
    }
}
