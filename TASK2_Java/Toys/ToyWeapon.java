public class ToyWeapon extends Toy {
    private String type;
    
    public ToyWeapon(int id, String name, int quantity, int weight, String type) {
        super(id, name, quantity, weight);
        this.type = type;
    }
    
    public String getType() {
        return type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
}
