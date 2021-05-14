/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package i52salia.si.trabajofinal.aircontrol;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author andres
 */
public class View extends javax.swing.JFrame {
    public ProgrammingPanel programmingPanel;

    /**
     * Creates new form MainView
     */
    public View() {
        initComponents();
        initSubcomponents();
        initCustomizedTabs();
    }

    private void initSubcomponents() {
        programmingPanel = new ProgrammingPanel();
        programmingTabPanel.add(programmingPanel);
    }
    
    private void initCustomizedTabs() {
        JPanel tab0ContainerPanel = new JPanel();
        JPanel tab1ContainerPanel = new JPanel();
        JPanel tab2ContainerPanel = new JPanel();
                
        Dimension containerPanelsSize = new Dimension(100, 55);
        tab0ContainerPanel.setPreferredSize(containerPanelsSize);
        tab1ContainerPanel.setPreferredSize(containerPanelsSize);
        tab2ContainerPanel.setPreferredSize(containerPanelsSize);
        
        GridBagLayout containerPanelsLayout = new GridBagLayout();
        tab0ContainerPanel.setLayout(containerPanelsLayout);
        tab1ContainerPanel.setLayout(containerPanelsLayout);
        tab2ContainerPanel.setLayout(containerPanelsLayout);
        
        tab0ContainerPanel.setOpaque(false);
        tab1ContainerPanel.setOpaque(false);
        tab2ContainerPanel.setOpaque(false);

        JPanel tab0Panel = new JPanel();
        JPanel tab1Panel = new JPanel();
        JPanel tab2Panel = new JPanel();
        
        tab0Panel.setOpaque(false);        
        tab1Panel.setOpaque(false);
        tab2Panel.setOpaque(false);

        GridLayout tabPanelsLayout = new GridLayout(2, 1);
        tab0Panel.setLayout(tabPanelsLayout);
        tab1Panel.setLayout(tabPanelsLayout);
        tab2Panel.setLayout(tabPanelsLayout);

        ImageIcon tab0Icon = new ImageIcon(getClass().getResource("/i52salia/si/trabajofinal/aircontrol/resources/images/programming-icon.png"));
        ImageIcon tab1Icon = new ImageIcon(getClass().getResource("/i52salia/si/trabajofinal/aircontrol/resources/images/home-icon.png"));
        ImageIcon tab2Icon = new ImageIcon(getClass().getResource("/i52salia/si/trabajofinal/aircontrol/resources/images/settings-icon.png"));

        JLabel tab0IconLabel = new JLabel(tab0Icon);
        JLabel tab1IconLabel = new JLabel(tab1Icon);
        JLabel tab2IconLabel = new JLabel(tab2Icon);

        JLabel tab0Label = new JLabel("Programming");
        JLabel tab1Label = new JLabel("Home");
        JLabel tab2Label = new JLabel("Settings");

        Font tabLabelsFont = new Font(javax.swing.UIManager.getDefaults().getFont("Label.font").toString(), Font.PLAIN, 10);
        tab0Label.setFont(tabLabelsFont);
        tab1Label.setFont(tabLabelsFont);
        tab2Label.setFont(tabLabelsFont);

        tab0ContainerPanel.add(tab0Panel);
        tab1ContainerPanel.add(tab1Panel);
        tab2ContainerPanel.add(tab2Panel);
                
        tab0Panel.add(tab0IconLabel);
        tab0Panel.add(tab0Label);
        tab1Panel.add(tab1IconLabel);
        tab1Panel.add(tab1Label);
        tab2Panel.add(tab2IconLabel);
        tab2Panel.add(tab2Label);

        jTabbedPane1.setTabComponentAt(0, tab0ContainerPanel);
        jTabbedPane1.setTabComponentAt(1, tab1ContainerPanel);
        jTabbedPane1.setTabComponentAt(2, tab2ContainerPanel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titlePanel = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        programmingTabPanel = new javax.swing.JPanel();
        homeTabPanel = new javax.swing.JPanel();
        settingsTabPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titlePanel.setBackground(new java.awt.Color(0, 195, 255));

        titleLabel.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        titleLabel.setText("jLabel1");
        titleLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));

        javax.swing.GroupLayout titlePanelLayout = new javax.swing.GroupLayout(titlePanel);
        titlePanel.setLayout(titlePanelLayout);
        titlePanelLayout.setHorizontalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        titlePanelLayout.setVerticalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titleLabel)
        );

        getContentPane().add(titlePanel, java.awt.BorderLayout.NORTH);

        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.BOTTOM);

        programmingTabPanel.setLayout(new javax.swing.BoxLayout(programmingTabPanel, javax.swing.BoxLayout.LINE_AXIS));
        jTabbedPane1.addTab("Programming", new javax.swing.ImageIcon(getClass().getResource("/i52salia/si/trabajofinal/aircontrol/resources/images/programming-icon.png")), programmingTabPanel); // NOI18N

        homeTabPanel.setLayout(new javax.swing.BoxLayout(homeTabPanel, javax.swing.BoxLayout.LINE_AXIS));
        jTabbedPane1.addTab("Home", new javax.swing.ImageIcon(getClass().getResource("/i52salia/si/trabajofinal/aircontrol/resources/images/home-icon.png")), homeTabPanel); // NOI18N

        settingsTabPanel.setLayout(new javax.swing.BoxLayout(settingsTabPanel, javax.swing.BoxLayout.LINE_AXIS));
        jTabbedPane1.addTab("Settings", new javax.swing.ImageIcon(getClass().getResource("/i52salia/si/trabajofinal/aircontrol/resources/images/settings-icon.png")), settingsTabPanel); // NOI18N

        jTabbedPane1.setSelectedIndex(1);

        getContentPane().add(jTabbedPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel homeTabPanel;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel programmingTabPanel;
    private javax.swing.JPanel settingsTabPanel;
    public javax.swing.JLabel titleLabel;
    private javax.swing.JPanel titlePanel;
    // End of variables declaration//GEN-END:variables
}
