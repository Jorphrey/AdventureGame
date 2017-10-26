package Enemy;

public enum ENUMYDifficulty {
    NONE(0,0,"none"), EASY(1, 2, "easy"), MODERATE(2, 4, "moderate"), HARD(3, 5, "hard"), BOSS(1, 1, "boss");

    private final int min;
    private final int max;
    private final String desc;

    ENUMYDifficulty(int mine, int maxe, String desce){
        min = mine;
        max = maxe;
        desc = desce;

    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

    public String getDesc() {
        return desc;
    }
}


