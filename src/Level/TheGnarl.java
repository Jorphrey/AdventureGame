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


        level[2][4] = new GrassRoom("The Beginning", false, "unlocked",
                ENUMYDifficulty.NONE, new LootFactory().getLoot(), false, false, player, game);
        level[2][4].setRoomDescription("You awake in a dark room.  You cannot see a thing. ");
        getRoom(2, 4).enterRoom();
        level[2][3] = new GrassRoom("First Puzzle", false, "key", ENUMYDifficulty.NONE,
                null, true, false, player, game);
        level[2][3].setRoomDescription("A rolling hill with large boulders strewn about. ");
        level[1][3] = new GrassRoom("Fanny Orkin", false, "unlocked", ENUMYDifficulty.NONE,
                null, true, false, player, game);
        level[1][3].setRoomDescription("Another rolling hill.  There appears to be a creature here.  Perhaps it has something" +
                "to say. ");
    }


}
