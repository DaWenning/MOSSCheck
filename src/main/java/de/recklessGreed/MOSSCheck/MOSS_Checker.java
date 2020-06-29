package de.recklessGreed.MOSSCheck;

import de.recklessGreed.MOSSCheck.Screens.MOSS_StartUp;

import javax.swing.*;
import java.io.IOException;

public class MOSS_Checker {

    public static MOSS_Checker instance;
    MOSS_StartUp startScreen;

    public MOSS_Checker()
    {
        instance = this;
        //JOptionPane.showMessageDialog(null, "Hello", "Hello", 1);        
        openMainFrame();
        //initialize();
        startScreen.close();
    }

    public static MOSS_Checker getInstance() {
        return instance;
    }

    private void initialize() {

    }

    private void openMainFrame() {
        try {
            startScreen = new MOSS_StartUp();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
