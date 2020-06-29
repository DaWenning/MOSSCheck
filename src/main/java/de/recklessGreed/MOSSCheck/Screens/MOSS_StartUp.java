package de.recklessGreed.MOSSCheck.Screens;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class MOSS_StartUp {

    private JPanel rootPanel;
    private JLabel headerLabel;
    private JLabel imageLabel;

    private JFrame rootFrame;

    public MOSS_StartUp() throws IOException {
        rootFrame = new JFrame("Starting MOSSChecker ... ");
        rootFrame.setSize(400,400);
        rootFrame.setContentPane(this.rootPanel);
        ImageIcon iconLogo = new ImageIcon("images/Logo_256.png");
        imageLabel.setIcon(iconLogo);
        rootFrame.setUndecorated(true);
        rootFrame.setShape(new RoundRectangle2D.Double(10, 10, 280, 280, 50, 50));
        rootFrame.setSize(300, 300);
        rootFrame.setLocationRelativeTo(null);
        rootFrame.setVisible(true);
    }

    private void createUIComponents() {

    }

    public void close() {
        rootFrame.setVisible(false);
    }
}
