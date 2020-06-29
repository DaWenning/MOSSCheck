package de.recklessGreed.MOSSCheck.Screens;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class MOSS_StartUp {

    private JPanel rootPanel;
    private JLabel headerLabel;
    private JLabel imageLabel;

    private JFrame rootFrame;

    public MOSS_StartUp() throws IOException {
        rootFrame = new JFrame();
        rootFrame.setSize(400,400);
        rootFrame.setContentPane(this.rootPanel);
        headerLabel.setText("Hello World");

        rootFrame.setVisible(true);
    }

    private void createUIComponents() {

    }

    public void close() {
        rootFrame.setVisible(false);
    }
}
