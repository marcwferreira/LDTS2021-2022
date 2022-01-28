import com.googlecode.lanterna.TextCharacter;
import com.googlecode.lanterna.screen.Screen;

public class Hero {
    private Position position;
    final private char hero_char = 'x';

    public Hero(int x, int y) {
        position.setPosX(x);
        position.setPosY(y);
    }

    //getter
    //public int getHeroX(){return position.getPosX();}
    //public int getHeroY(){return position.getPosY();}
    public char getHeroChar() {return hero_char;}

    //setter
    //public void setHeroX(int x){position.setPosX(x);}
    //public void setHeroY(int y){position.setPosY(y);}

    //movement functions
    public Position moveUp(){
        return new Position(position.getPosX(), position.getPosY() - 1);
        //position.setPosY(position.getPosY()-1);
    }
    public Position moveDown(){
        return new Position(position.getPosX(), position.getPosY() + 1);
        //position.setPosY(position.getPosY()+1);
    }
    public Position moveLeft(){
        return new Position(position.getPosX() - 1, position.getPosY());
        //position.setPosX(position.getPosX()-1);
    }
    public Position moveRight(){
        return new Position(position.getPosX() + 1, position.getPosY());
        //position.setPosX(position.getPosX()+1);
    }

    //hero drawing
    public void heroDraw(Screen screen) {
        screen.setCharacter(this.position.getPosX(), this.position.getPosY(), TextCharacter.fromCharacter(this.getHeroChar())[0]);
    }

}
