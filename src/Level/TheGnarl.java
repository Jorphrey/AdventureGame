package Level;

import Room.Room;

public class TheGnarl extends Level {
    private String name;
    private int width;
    private int height;
    private Room[][] level;

    public TheGnarl() {
        this.name = "The Gnarl";
        this.width = 5;
        this.height = 5;
        this.level = new Room[this.width][this.height];

    }

    @Override
    public Room getRoom(int x, int y) {
        return super.getRoom(x, y);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public int getWidth() {
        return super.getWidth();
    }

    @Override
    public void setWidth(int width) {
        super.setWidth(width);
    }

    @Override
    public int getHeight() {
        return super.getHeight();
    }

    @Override
    public void setHeight(int height) {
        super.setHeight(height);
    }

    @Override
    public Room[][] getLevel() {
        return super.getLevel();
    }

    @Override
    public void setLevel(Room[][] level) {
        super.setLevel(level);
    }
}
