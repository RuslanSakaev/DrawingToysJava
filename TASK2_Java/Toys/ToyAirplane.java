public class ToyAirplane extends Toy {
    private int wingspan;
    
    public ToyAirplane(int id, String name, int quantity, int weight, int wingspan) {
        super(id, name, quantity, weight);
        this.wingspan = wingspan;
    }
    
    public int getWingspan() {
        return wingspan;
    }
    
    public void setWingspan(int wingspan) {
        this.wingspan = wingspan;
    }
}
