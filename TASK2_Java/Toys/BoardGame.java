public class BoardGame extends Toy {
    private int players;
    
    public BoardGame(int id, String name, int quantity, int weight, int players) {
        super(id, name, quantity, weight);
        this.players = players;
    }
    
    public int getPlayers() {
        return players;
    }
    
    public void setPlayers(int players) {
        this.players = players;
    }
}
