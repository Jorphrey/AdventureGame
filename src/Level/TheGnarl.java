package Level;

import Enemy.Enemy;
import Items.LootFactory;
import Player.*;
import Enemy.ENUMYDifficulty;
import Room.GrassRoom;
import Room.NoRoom;
import Room.Room;
import TitleScreen.Game;
import com.sun.media.jfxmedia.events.PlayerStateListener;

public class TheGnarl extends Level {

    public TheGnarl(Player player, Game game) {
        super(player, game);
        this.name = "The Gnarl";
        this.width = 5;
        this.height = 5;
        this.level = new Room[this.width][this.height];



        for (int row = 0; row < this.height; row++) {
            for (int col = 0; col < this.width; col++) {
                this.level[row][col] = new NoRoom();
            }
        }


        this.level[4][2] = new GrassRoom("The Beginning", false, "unlocked",
                ENUMYDifficulty.NONE, new LootFactory().getLoot(), false, false, player, game);
        this.getRoom(4,2).enterRoom();
        this.level[3][2] = new GrassRoom("First Puzzle", true, "key", ENUMYDifficulty.NONE,
                null, true, false, player, game);
        this.level[3][1] = new GrassRoom("Fanny Orkin", false, "unlocked", ENUMYDifficulty.NONE,
                null, true, false, player, game);
    }


}
