package Level;


import Room.Room;

public abstract class Level {
    private String name;
    private int width;
    private int height;
    private Room[][] level;

    public Level() {

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
}
