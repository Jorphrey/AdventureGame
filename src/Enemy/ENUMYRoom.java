package Enemy;

public enum ENUMYRoom {
    GRASS("Grass", 0), FOREST("Forest", 1);

    private final String name;
    private final int level;

    ENUMYRoom(String namee, int levele){
        name = namee;
        level = levele;
    }

    public String getName(){
        return name;
    }

    public int getLevel(){
        return level;
    }
}
