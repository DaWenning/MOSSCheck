package de.recklessGreed.MOSSCheck;

import de.recklessGreed.MOSSCheck.Screens.MOSS_StartUp;

import javax.swing.*;
import java.io.IOException;

public class MOSS_Checker {

    public static MOSS_Checker instance;
    MOSS_StartUp startScreen;

    private static final String NAME    = "MOSSChecker";
    private static final String VERSION = "v0.1";

    public MOSS_Checker()
    {
        instance = this;
        try {
            startScreen = new MOSS_StartUp();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //initialize();
        openMainFrame();
        //startScreen.close();
    }

    public static MOSS_Checker getInstance() {
        return instance;
    }

    private void initialize() {

    }

    private void openMainFrame() {

    }

    public String getName() {
        return NAME;
    }

    public String getVersion() {
        return VERSION;
    }
}
