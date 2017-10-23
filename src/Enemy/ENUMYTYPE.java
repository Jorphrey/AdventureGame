package Enemy;

public enum ENUMYTYPE {
    GRASS("Grass"), FOREST("Forest");

    private final String name;

    ENUMYTYPE(String namee){
        name = namee;
    }

    public String getName(){
        return name;
    }
}
