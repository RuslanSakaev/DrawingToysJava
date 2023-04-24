public class ConstructionSet extends Toy {

    public ConstructionSet(String name, int quantity, double weight) {
        super(name, quantity, weight);
    }

    @Override
    public String toString() {
        return "ConstructionSet{" +
                "name='" + getName() + '\'' +
                ", quantity=" + getQuantity() +
                ", weight=" + getWeight() +
                '}';
    }
}
