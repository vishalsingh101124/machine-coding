public class Player {
    private final String name;
    private  int position;


    public Player(String name, int position) {
        this.name = name;
        this.position = position;
    }
    public void setPosition(int position){
        this.position= position;
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }
}
