package Level;


import Room.Room;
import TitleScreen.Game;
import Player.*;

import java.util.Arrays;

public abstract class Level {
    protected String name;
    protected int width;
    protected int height;
    protected Room[][] level;
    protected Player player;
    protected Game game;

    public Level(Player player, Game game) {
        this.player = player;
        this.game = game;
    }

    public Room getRoom(int x, int y) {
        return this.level[x][y];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Room[][] getLevel() {
        return level;
    }

    public void setLevel(Room[][] level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Level{" +
                "name='" + name + '\'' +
                ", width=" + width +
                ", height=" + height +
                ", level=" + Arrays.toString(level) +
                '}';
    }
}
