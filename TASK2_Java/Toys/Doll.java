public class Doll extends Toy {

    public Doll(String name, int quantity, double weight) {
        super(name, quantity, weight);
    }

    @Override
    public String toString() {
        return "Doll{" +
                "name='" + getName() + '\'' +
                ", quantity=" + getQuantity() +
                ", weight=" + getWeight() +
                '}';
    }
}
