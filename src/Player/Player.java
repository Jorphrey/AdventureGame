

package Player;



public class Player {
    private String name;
    private String playerClass;
    private int hp;
    private int mp;
    private int intellect;
    private int Strength;

    public Player (String name, String playerClass){
        this.name = name;
        this.playerClass = playerClass;
        switch (playerClass){
            case "wizard":
                this.intellect = 25;
                this.Strength = 10;
                this.mp = 100;
                this.hp = 100;
            case "warrior":
                this.intellect = 10;
                this.Strength = 25;
                this.mp = 100;
                this.hp = 100;

        }

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlayerClass() {
        return playerClass;
    }

    public void setPlayerClass(String playerClass) {
        this.playerClass = playerClass;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public int getIntellect() {
        return intellect;
    }

    public void setIntellect(int intellect) {
        this.intellect = intellect;
    }

    public int getStrength() {
        return Strength;
    }

    public void setStrength(int strength) {
        Strength = strength;
    }
}
