import com.googlecode.lanterna.TerminalSize;
import com.googlecode.lanterna.TextCharacter;
import com.googlecode.lanterna.input.KeyStroke;
import com.googlecode.lanterna.input.KeyType;
import com.googlecode.lanterna.screen.Screen;
import com.googlecode.lanterna.screen.TerminalScreen;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import com.googlecode.lanterna.terminal.Terminal;

import javax.swing.*;
import java.io.IOException;
import java.security.KeyStore;

public class Game {

    private Screen screen;
    Hero hero= new Hero(10,10);

    public Game() {
        try {
            TerminalSize terminalSize = new TerminalSize(40, 20);
            DefaultTerminalFactory terminalFactory = new DefaultTerminalFactory().setInitialTerminalSize(terminalSize);
            Terminal terminal = terminalFactory.createTerminal();
            //Terminal terminal = new DefaultTerminalFactory().createTerminal()
            screen = new TerminalScreen(terminal);
            screen.setCursorPosition(null); // we don't need a cursor
            screen.startScreen(); // screens must be started
            screen.doResizeIfNecessary(); // resize screen if necessary
            //screen char
            //screen.clear();
            //screen.setCharacter(10, 10, TextCharacter.fromCharacter('X')[0]);
            //screen.refresh();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void draw() throws IOException {
        //screen char
        screen.clear();
        hero.heroDraw(screen);
        screen.refresh();
    }

    private boolean processKey(KeyStroke key) throws IOException {
        System.out.println(key);
        switch(key.getKeyType()){
            case ArrowUp:
                hero.moveUp();
                break;
            case ArrowDown:
                hero.moveDown();
                break;
            case ArrowLeft:
                hero.moveLeft();
                break;
            case ArrowRight:
                hero.moveRight();
                break;
            case EOF:
                return false;
        }
        if (key.getKeyType() == KeyType.Character && key.getCharacter() == 'q'){
            screen.close();
        }
        return true;
    }

    public void run() {
        try {
            boolean loop = true;
            do {
                this.draw();
                KeyStroke key = screen.readInput();
                loop = processKey(key);
            } while (loop);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}