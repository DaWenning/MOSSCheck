package de.recklessGreed.MOSSCheck;

import de.recklessGreed.MOSSCheck.Screens.MOSS_StartUp;

import javax.swing.*;
import java.io.IOException;

public class MOSS_Checker {

    public static MOSS_Checker instance;
    MOSS_StartUp folderSelector;

    public MOSS_Checker()
    {
        instance = this;
        //JOptionPane.showMessageDialog(null, "Hello", "Hello", 1);
        //initialize();
        openMainFrame();
    }

    public static MOSS_Checker getInstance() {
        return instance;
    }

    private void initialize() {

    }

    private void openMainFrame() {
        try {
            folderSelector = new MOSS_StartUp();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
