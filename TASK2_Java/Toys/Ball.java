public class Ball extends Toy {
    private String material;
    
    public Ball(int id, String name, int quantity, int weight, String material) {
        super(id, name, quantity, weight);
        this.material = material;
    }
    
    public String getMaterial() {
        return material;
    }
    
    public void setMaterial(String material) {
        this.material = material;
    }
}
