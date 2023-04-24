public class InteractiveGame extends Toy {

    public InteractiveGame(String name, int quantity, double weight) {
        super(name, quantity, weight);
    }

    @Override
    public String toString() {
        return "InteractiveGame{" +
                "name='" + getName() + '\'' +
                ", quantity=" + getQuantity() +
                ", weight=" + getWeight() +
                '}';
    }
}
