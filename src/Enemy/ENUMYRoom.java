package Enemy;

public enum ENUMYTYPE {
    GRASS("Grass", 0), FOREST("Forest", 1);

    private final String name;
    private final int level;

    ENUMYTYPE(String namee, int levele){
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
