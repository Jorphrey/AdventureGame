package Room;

import Enemy.ENUMYDifficulty;
import Items.Item;
import Items.LootFactory;
import Player.Player;
import TitleScreen.Game;

import java.util.Set;

public class NoRoom extends Room{
    public NoRoom() {
        super("nothing", true, "unobtainable",ENUMYDifficulty.NONE, new LootFactory().getLoot(), false, false, null, null);

    }


}
