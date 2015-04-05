/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PlanIFTicateur.gui;

import PlanIFTicateur.drawing.HoraireDrawer;
import java.awt.Dimension;
import java.awt.Graphics;
import java.io.Serializable;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

/**
 *
 * @author tristandhumieres
 */
public class HorairePanel extends JPanel implements Serializable {

    private Dimension initialDimension;
    private MainWindow mainWindow;

    public HorairePanel() {
    }

    public HorairePanel(MainWindow mainWindow) {
        this.mainWindow = mainWindow;
        int width = (int) (java.awt.Toolkit.getDefaultToolkit().getScreenSize().width);
        int height = (int) (java.awt.Toolkit.getDefaultToolkit().getScreenSize().height);
        setPreferredSize(new Dimension(width * 2 / 3, (int) (height * 0.7)));
        setBorder(new javax.swing.border.BevelBorder(BevelBorder.LOWERED));
        setVisible(true);
        initialDimension = new Dimension(width * 2 / 3, (int) (height * 0.7));
    }

    @Override
    protected void paintComponent(Graphics g) {
        if (mainWindow != null) {
            super.paintComponent(g);
            HoraireDrawer horaireDrawer = new HoraireDrawer(mainWindow.controleur, initialDimension);
            horaireDrawer.draw(g);
        }
    }

}
