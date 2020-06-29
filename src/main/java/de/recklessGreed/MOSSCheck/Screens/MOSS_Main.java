package de.recklessGreed.MOSSCheck.Screens;

import de.recklessGreed.MOSSCheck.MOSS_Checker;

import javax.swing.*;

public class MOSS_Main {
    private JPanel rootPanel;
    private MOSS_Checker checker;
    public MOSS_Main(MOSS_Checker checker) {
        this.checker = checker;

        JFrame rootFrame = new JFrame(checker.getName() + " " + checker.getVersion());


        rootFrame.setContentPane(rootPanel);
        rootFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        rootFrame.setVisible(true);


    }
}
