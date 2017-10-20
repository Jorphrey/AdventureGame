package TitleScreen;


import Player.Player;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.util.ArrayList;
import java.util.List;

public class TitleScreen {

    @FXML
    private TextArea eventScreen;
    @FXML
    private Button attackButton;
    @FXML
    private Button magicButton;


    private Player player;
    private int count;
    List<String> eventOutput;


    public TitleScreen() {
        eventOutput = new ArrayList<String>();
        //player = createPlayer();
        count = 0;

    }

    /*
        public Player createPlayer(){
            System.out.println();

        }
    */
    public void outputScreen() {
        StringBuilder temp = new StringBuilder();
        //eventOutput.add(screen);
        for (int i = eventOutput.size() - 1; i > 0; i--) {
            temp.append(eventOutput.get(i) + "\n");
        }
        if (eventOutput.size() >= 50) {
            eventOutput.remove(0);
        }
        eventScreen.setText(temp.toString());
    }


}

