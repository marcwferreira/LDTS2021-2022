public class Position {

    //vars
    private int pos_x;
    private int pos_y;

    //constructor
    public Position(int x, int y) {
        pos_x = x;
        pos_y = y;
    }

    //getters
    public int getPosX() {return pos_x;}
    public int getPosY() {return pos_y;}

    //setters
    public void setPosX(int x) {pos_x = x;}
    public void setPosY(int y) {pos_y = y;}
}
