package game.ui.Controller;

import javax.swing.*;

import game.GameState;
import game.Save;
import game.ui.Vue.Pause;

public class PauseController extends Controller{

    public PauseController(Pause view){
        this.view = view;
    }

    public void mouseClicked(int value) {
        if (value == 1) { // replendre
            changeView(GameState.PLAYING);
            model.pauseWave();
            model.setWaveOnBreak(false);
        }
        if (value == 2) { // retour menu principal
            changeView(GameState.MENU);
            model.pauseWave();
            model.setWaveOnBreak(false);
        }
        if (value == 3) { // sauvagarder
            model.save();
        }
        if (value == 4) { // quitter
            System.exit(0);
        }
    }


}
