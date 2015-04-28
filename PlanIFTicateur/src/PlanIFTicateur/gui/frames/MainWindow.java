/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PlanIFTicateur.gui.frames;

import PlanIFTicateur.domaine.horaire.HoraireActiviteControleur;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics2D;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JToggleButton;

/**
 *
 * @author tristandhumieres
 */
public class MainWindow extends javax.swing.JFrame {

    public HoraireActiviteControleur controleur;
    private VerificationMode verificationMode;

    public enum VerificationMode {

        CHECKED, UNCHECKED
    }

    /**
     * Creates new form MainWindow
     */
    public MainWindow() {
        setTitle("PlanIFTicateur");
        this.verificationMode = VerificationMode.UNCHECKED;
        controleur = new HoraireActiviteControleur();
        initComponents();
        addWindowListener(new WindowAdapter() {
            public void windowOpened(WindowEvent e) {
                setExtendedState(MAXIMIZED_BOTH);
            }
        });

        sauvegarderMenuItem.setEnabled(false);
        sauvegarderSousMenuItem.setEnabled(false);
        exportBouton.setEnabled(false);
        exportMenuItem.setEnabled(false);
    }

    public VerificationMode getVerificationMode() {
        return verificationMode;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        list1 = new java.awt.List();
        mainPanel = new javax.swing.JPanel();
        boutonTopPanel = new javax.swing.JPanel(new FlowLayout(FlowLayout.LEFT));
        selecteurSession = new javax.swing.JComboBox();
        verificationAutoBouton = new javax.swing.JToggleButton();
        jButton1 = new javax.swing.JButton();
        statistiquesBouton = new javax.swing.JButton();
        exportBouton = new javax.swing.JButton();
        reinitialiserBouton = new javax.swing.JButton();
        bottomPanel = new PlanIFTicateur.gui.panels.BottomPanel(this);
        mainScrollPane = new javax.swing.JScrollPane();
        centerPanel = new javax.swing.JPanel();
        rightPanel = new PlanIFTicateur.gui.panels.RightPanel(this);
        horaireScrollPane = new javax.swing.JScrollPane();
        horairePanel = new PlanIFTicateur.gui.panels.HorairePanel(this
        );
        menuBar = new javax.swing.JMenuBar();
        menuFichier = new javax.swing.JMenu();
        nouveauMenuItem = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        sauvegarderMenuItem = new javax.swing.JMenuItem();
        sauvegarderSousMenuItem = new javax.swing.JMenuItem();
        exportMenuItem = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        quitterMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                formComponentAdded(evt);
            }
        });

        mainPanel.setLayout(new java.awt.BorderLayout());

        boutonTopPanel.setPreferredSize(new java.awt.Dimension(567, 35));

        selecteurSession.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Session d'hiver", "Session d'été", "Session d'automne" }));
        selecteurSession.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecteurSessionActionPerformed(evt);
            }
        });
        boutonTopPanel.add(selecteurSession);

        verificationAutoBouton.setText("Vérification Automatique");
        verificationAutoBouton.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                verificationAutoBoutonStateChanged(evt);
            }
        });
        verificationAutoBouton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verificationAutoBoutonActionPerformed(evt);
            }
        });
        boutonTopPanel.add(verificationAutoBouton);

        jButton1.setText("Planification Automatique");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        boutonTopPanel.add(jButton1);

        statistiquesBouton.setText("Statistiques");
        statistiquesBouton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statistiquesBoutonActionPerformed(evt);
            }
        });
        boutonTopPanel.add(statistiquesBouton);

        exportBouton.setText("Exporter comme image");
        exportBouton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportBoutonActionPerformed(evt);
            }
        });
        boutonTopPanel.add(exportBouton);

        reinitialiserBouton.setText("Réinitialiser");
        reinitialiserBouton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reinitialiserBoutonActionPerformed(evt);
            }
        });
        boutonTopPanel.add(reinitialiserBouton);

        mainPanel.add(boutonTopPanel, java.awt.BorderLayout.NORTH);

        bottomPanel.setPreferredSize(new java.awt.Dimension(1000, 30));
        mainPanel.add(bottomPanel, java.awt.BorderLayout.SOUTH);

        centerPanel.setLayout(new java.awt.BorderLayout());

        rightPanel.setMinimumSize(new java.awt.Dimension(300, 100));
        rightPanel.setPreferredSize(new Dimension((int) ((int) (java.awt.Toolkit.getDefaultToolkit().getScreenSize().width) * 0.29), 590));
        centerPanel.add(rightPanel, java.awt.BorderLayout.EAST);

        horaireScrollPane.setPreferredSize(new Dimension((int) ((int) (java.awt.Toolkit.getDefaultToolkit().getScreenSize().width) * 0.7), 244));
        horaireScrollPane.getVerticalScrollBar().setUnitIncrement(20);

        horairePanel.setPreferredSize(new Dimension((int) ((int) (java.awt.Toolkit.getDefaultToolkit().getScreenSize().width) * 0.69), 800));

        javax.swing.GroupLayout horairePanelLayout = new javax.swing.GroupLayout(horairePanel);
        horairePanel.setLayout(horairePanelLayout);
        horairePanelLayout.setHorizontalGroup(
            horairePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 765, Short.MAX_VALUE)
        );
        horairePanelLayout.setVerticalGroup(
            horairePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 269, Short.MAX_VALUE)
        );

        horaireScrollPane.setViewportView(horairePanel);

        centerPanel.add(horaireScrollPane, java.awt.BorderLayout.CENTER);

        mainScrollPane.setViewportView(centerPanel);

        mainPanel.add(mainScrollPane, java.awt.BorderLayout.CENTER);

        menuFichier.setText("Fichier");

        nouveauMenuItem.setText("Ouvrir");
        nouveauMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nouveauMenuItemActionPerformed(evt);
            }
        });
        menuFichier.add(nouveauMenuItem);
        menuFichier.add(jSeparator1);

        sauvegarderMenuItem.setText("Sauvegarder");
        sauvegarderMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sauvegarderMenuItemActionPerformed(evt);
            }
        });
        menuFichier.add(sauvegarderMenuItem);

        sauvegarderSousMenuItem.setText("Sauvegarder Sous");
        sauvegarderSousMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sauvegarderSousMenuItemActionPerformed(evt);
            }
        });
        menuFichier.add(sauvegarderSousMenuItem);

        exportMenuItem.setText("Exporter au format image");
        exportMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportMenuItemActionPerformed(evt);
            }
        });
        menuFichier.add(exportMenuItem);
        menuFichier.add(jSeparator2);

        quitterMenuItem.setText("Quitter");
        quitterMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitterMenuItemActionPerformed(evt);
            }
        });
        menuFichier.add(quitterMenuItem);

        menuBar.add(menuFichier);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 779, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_formComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentAdded

    private void nouveauMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nouveauMenuItemActionPerformed
        JFileChooser dialogue = new JFileChooser(new File("/"));
        File fichier;
        if (dialogue.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            fichier = dialogue.getSelectedFile();

            String[] choixSession = {"Automne", "Été", "Hiver"};
            String session = (String) JOptionPane.showInputDialog(null, "Choisir une session", "", JOptionPane.QUESTION_MESSAGE, null, choixSession, choixSession[0]);
                
            if (controleur.getHoraire().getSession() == null || controleur.getHoraire().getSession().equals("")) {
            
               switch (session) {
                    case "Automne":
                        controleur.getHoraire().setSession("A");
                        selecteurSession.setSelectedIndex(2);
                        break;
                    case "Été":
                        controleur.getHoraire().setSession("E");
                        selecteurSession.setSelectedIndex(1);
                        break;
                    case "Hiver":
                        controleur.getHoraire().setSession("H");
                        selecteurSession.setSelectedIndex(0);
                        break;
                }
            }
            controleur.getHoraire().getNotes().clear();
            rightPanel.getNotesPanel().clear();
            controleur.importerFichiers(fichier.getAbsolutePath(), horairePanel.getDimensionsCase());
            sauvegarderMenuItem.setEnabled(true);
            sauvegarderSousMenuItem.setEnabled(true);
            exportBouton.setEnabled(true);
            exportMenuItem.setEnabled(true);
            

        }
    }//GEN-LAST:event_nouveauMenuItemActionPerformed

    private void verificationAutoBoutonStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_verificationAutoBoutonStateChanged

    }//GEN-LAST:event_verificationAutoBoutonStateChanged

    private void verificationAutoBoutonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verificationAutoBoutonActionPerformed
        JToggleButton bouton = (JToggleButton) evt.getSource();
        if (bouton.isSelected()) {
            this.verificationMode = VerificationMode.CHECKED;
        } else {
            this.verificationMode = VerificationMode.UNCHECKED;
        }
    }//GEN-LAST:event_verificationAutoBoutonActionPerformed

    private void statistiquesBoutonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statistiquesBoutonActionPerformed
        StatistiquesWindow statistiquesWindow = new StatistiquesWindow(this);
        controleur.notifyObserversForUpdatedItems();
    }//GEN-LAST:event_statistiquesBoutonActionPerformed

    private void sauvegarderMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sauvegarderMenuItemActionPerformed
        controleur.enregistrerFichier(controleur.getActivites());
        controleur.enregistrerNotes(rightPanel.getNotesPanel().toStringList());
    }//GEN-LAST:event_sauvegarderMenuItemActionPerformed

    private void quitterMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitterMenuItemActionPerformed
        this.dispose();
    }//GEN-LAST:event_quitterMenuItemActionPerformed

    private void exportBoutonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportBoutonActionPerformed
        JFileChooser dialogue = new JFileChooser(new File("/"));
        dialogue.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        if (dialogue.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            int w = horairePanel.getWidth();
            int h = horairePanel.getHeight();
            BufferedImage bi = new BufferedImage(w, h, BufferedImage.TYPE_INT_RGB);
            Graphics2D g = bi.createGraphics();
            horairePanel.paint(g);
            try {
                ImageIO.write(bi, "png", new File(dialogue.getSelectedFile() + "/horaire.png"));
            } catch (IOException ex) {
                Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_exportBoutonActionPerformed

    private void sauvegarderSousMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sauvegarderSousMenuItemActionPerformed

        JFileChooser dialogue = new JFileChooser(new File("/"));
        dialogue.setDialogTitle("Enregistrer Sous");
        dialogue.setApproveButtonText("Enregistrer");

        File fichier; //Nouvelle emplacement
        if (dialogue.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
            fichier = dialogue.getSelectedFile();
            String fileName = fichier.getName();
            int length = fileName.length();
            String extension = fileName.substring(length - 4, length);

            if (fichier.isFile() && extension.toLowerCase().equals(".cou")) {
                controleur.enregistrerFichier(controleur.getActivites(), fichier.getAbsolutePath());
            } else if (!fichier.isFile() && extension.toLowerCase().equals(".cou")) {
                controleur.enregistrerFichier(controleur.getActivites(), fichier.getAbsolutePath());
            } else if (!fichier.isFile()) {
                controleur.enregistrerFichier(controleur.getActivites(), fichier.getAbsolutePath() + ".cou");
            } else {
                controleur.enregistrerFichier(controleur.getActivites(), fichier.getAbsolutePath() + "export.cou");
            }
            
           
            controleur.enregistrerNotes(rightPanel.getNotesPanel().toStringList(), fichier.getAbsolutePath());
            
            
            try {
                controleur.copierCHE(fichier.getAbsolutePath());
            } catch (IOException ex) {
                Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }//GEN-LAST:event_sauvegarderSousMenuItemActionPerformed

    private void exportMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportMenuItemActionPerformed
        JFileChooser dialogue = new JFileChooser(new File("/"));
        dialogue.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        if (dialogue.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            int w = horairePanel.getWidth();
            int h = horairePanel.getHeight();
            BufferedImage bi = new BufferedImage(w, h, BufferedImage.TYPE_INT_RGB);
            Graphics2D g = bi.createGraphics();
            horairePanel.paint(g);
            try {
                ImageIO.write(bi, "png", new File(dialogue.getSelectedFile() + "/horaire.png"));
            } catch (IOException ex) {
                Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_exportMenuItemActionPerformed

    private void selecteurSessionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecteurSessionActionPerformed
        JComboBox combo = (JComboBox) evt.getSource();
        switch (combo.getSelectedIndex()) {
            case 0:
                controleur.getHoraire().setSession("H");
                break;
            case 1:
                controleur.getHoraire().setSession("E");
                break;
            case 2:
                controleur.getHoraire().setSession("A");
                break;
        }

    }//GEN-LAST:event_selecteurSessionActionPerformed

    private void reinitialiserBoutonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reinitialiserBoutonActionPerformed
        controleur.desassignerActivites();
    }//GEN-LAST:event_reinitialiserBoutonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        controleur.planificationAutomatique(this);
      
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public PlanIFTicateur.gui.panels.BottomPanel bottomPanel;
    private javax.swing.JPanel boutonTopPanel;
    private javax.swing.JPanel centerPanel;
    private javax.swing.JButton exportBouton;
    private javax.swing.JMenuItem exportMenuItem;
    public PlanIFTicateur.gui.panels.HorairePanel horairePanel;
    private javax.swing.JScrollPane horaireScrollPane;
    private javax.swing.JButton jButton1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private java.awt.List list1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JScrollPane mainScrollPane;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuFichier;
    private javax.swing.JMenuItem nouveauMenuItem;
    private javax.swing.JMenuItem quitterMenuItem;
    private javax.swing.JButton reinitialiserBouton;
    public PlanIFTicateur.gui.panels.RightPanel rightPanel;
    private javax.swing.JMenuItem sauvegarderMenuItem;
    private javax.swing.JMenuItem sauvegarderSousMenuItem;
    private javax.swing.JComboBox selecteurSession;
    private javax.swing.JButton statistiquesBouton;
    private javax.swing.JToggleButton verificationAutoBouton;
    // End of variables declaration//GEN-END:variables
}
