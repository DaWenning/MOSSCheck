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

    public MOSS_StartUp() throws IOException {
        JFrame frame = new JFrame();
        frame.setSize(400,400);
        frame.setContentPane(this.rootPanel);
        headerLabel.setText("Hello World");

        frame.setVisible(true);
    }

    private void createUIComponents() {

    }
}
