package Enemy.CritterEnemy;

public enum CritterENUM {
    BAT(0, "Bat"), MILLIPEDE(1, "Millipede"), RAT(2, "Rat"), SQUIRREL(3, "Squirrel");

    private final int num;
    private final String bat;

    CritterENUM(int nume, String namee){
       num = nume;
       bat = namee;

    }

    public int getNum(){
        return num;
    }

    public String getName(){
        return bat;
    }
}


