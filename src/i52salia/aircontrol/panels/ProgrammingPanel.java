package i52salia.aircontrol.panels;

/**
 * JPanel for the Programming tab.
 *
 * (Much of the code was automatically generated by NetBeans).
 *
 * @author Andrés Salinas Lima (i52salia@uco.es)
 */
public final class ProgrammingPanel extends javax.swing.JPanel {

    /**
     * Creates and initializes the JPanel.
     */
    public ProgrammingPanel() {
        initComponents();

        // Hide subpanels
        programListMainPanel.setVisible(true);
        programSettingsMainPanel.setVisible(false);
        newProgramStep2MainPanel.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        programListMainPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        programListPanel = new javax.swing.JPanel();
        programListButtonsPanel = new javax.swing.JPanel();
        addProgramButton = new javax.swing.JButton();
        programSettingsMainPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        programSettingsComponent = new i52salia.aircontrol.components.ProgramSettingsComponent();
        programSettingsButtonsPanel = new javax.swing.JPanel();
        programSettingsButtonsPanel2 = new javax.swing.JPanel();
        deleteProgramButton = new javax.swing.JButton();
        programSettingsButtonsPanel3 = new javax.swing.JPanel();
        cancelButton = new javax.swing.JButton();
        invisibleSeparator = new javax.swing.JSeparator();
        saveChangesButton = new javax.swing.JButton();
        newProgramStep1MainPanel = new javax.swing.JPanel();
        newProgramStep1ButtonsPanel = new javax.swing.JPanel();
        programSettingsButtonsPanel6 = new javax.swing.JPanel();
        cancelButton2 = new javax.swing.JButton();
        invisibleSeparator2 = new javax.swing.JSeparator();
        saveNewProgramButton1 = new javax.swing.JButton();
        newProgramStep2MainPanel = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        newProgramComponent = new i52salia.aircontrol.components.ProgramSettingsComponent();
        newProgramStep2ButtonsPanel = new javax.swing.JPanel();
        programSettingsButtonsPanel5 = new javax.swing.JPanel();
        backButton = new javax.swing.JButton();
        invisibleSeparator1 = new javax.swing.JSeparator();
        saveNewProgramButton = new javax.swing.JButton();

        setLayout(new javax.swing.OverlayLayout(this));

        programListMainPanel.setLayout(new java.awt.BorderLayout());

        jScrollPane1.setBorder(null);

        programListPanel.setLayout(new javax.swing.BoxLayout(programListPanel, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane1.setViewportView(programListPanel);

        programListMainPanel.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        programListButtonsPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));

        addProgramButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/i52salia/aircontrol/resources/images/save-program-icon.png"))); // NOI18N
        addProgramButton.setText("Add New Program");
        addProgramButton.setEnabled(false);
        programListButtonsPanel.add(addProgramButton);

        programListMainPanel.add(programListButtonsPanel, java.awt.BorderLayout.SOUTH);

        add(programListMainPanel);

        programSettingsMainPanel.setEnabled(false);
        programSettingsMainPanel.setLayout(new java.awt.BorderLayout());

        jScrollPane2.setBorder(null);
        jScrollPane2.setViewportView(programSettingsComponent);

        programSettingsMainPanel.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        programSettingsButtonsPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        programSettingsButtonsPanel.setLayout(new javax.swing.BoxLayout(programSettingsButtonsPanel, javax.swing.BoxLayout.Y_AXIS));

        deleteProgramButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/i52salia/aircontrol/resources/images/delete-program-icon.png"))); // NOI18N
        deleteProgramButton.setText("Delete Program");
        deleteProgramButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        programSettingsButtonsPanel2.add(deleteProgramButton);

        programSettingsButtonsPanel.add(programSettingsButtonsPanel2);

        programSettingsButtonsPanel3.setBorder(null);

        cancelButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/i52salia/aircontrol/resources/images/back-icon.png"))); // NOI18N
        cancelButton.setText("Cancel");
        programSettingsButtonsPanel3.add(cancelButton);

        invisibleSeparator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        invisibleSeparator.setBorder(null);
        invisibleSeparator.setPreferredSize(new java.awt.Dimension(25, 0));
        programSettingsButtonsPanel3.add(invisibleSeparator);

        saveChangesButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/i52salia/aircontrol/resources/images/save-program-icon.png"))); // NOI18N
        saveChangesButton.setText("Save");
        programSettingsButtonsPanel3.add(saveChangesButton);

        programSettingsButtonsPanel.add(programSettingsButtonsPanel3);

        programSettingsMainPanel.add(programSettingsButtonsPanel, java.awt.BorderLayout.SOUTH);

        add(programSettingsMainPanel);

        newProgramStep1ButtonsPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        newProgramStep1ButtonsPanel.setLayout(new javax.swing.BoxLayout(newProgramStep1ButtonsPanel, javax.swing.BoxLayout.Y_AXIS));

        programSettingsButtonsPanel6.setBorder(null);

        cancelButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/i52salia/aircontrol/resources/images/back-icon.png"))); // NOI18N
        cancelButton2.setText("Cancel");
        programSettingsButtonsPanel6.add(cancelButton2);

        invisibleSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        invisibleSeparator2.setBorder(null);
        invisibleSeparator2.setPreferredSize(new java.awt.Dimension(25, 0));
        programSettingsButtonsPanel6.add(invisibleSeparator2);

        saveNewProgramButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/i52salia/aircontrol/resources/images/save-program-icon.png"))); // NOI18N
        saveNewProgramButton1.setText("Save");
        saveNewProgramButton1.setEnabled(false);
        programSettingsButtonsPanel6.add(saveNewProgramButton1);

        newProgramStep1ButtonsPanel.add(programSettingsButtonsPanel6);

        newProgramStep1MainPanel.add(newProgramStep1ButtonsPanel);

        add(newProgramStep1MainPanel);

        newProgramStep2MainPanel.setEnabled(false);
        newProgramStep2MainPanel.setLayout(new java.awt.BorderLayout());

        jScrollPane3.setBorder(null);
        jScrollPane3.setViewportView(newProgramComponent);

        newProgramStep2MainPanel.add(jScrollPane3, java.awt.BorderLayout.CENTER);

        newProgramStep2ButtonsPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        newProgramStep2ButtonsPanel.setLayout(new javax.swing.BoxLayout(newProgramStep2ButtonsPanel, javax.swing.BoxLayout.Y_AXIS));

        programSettingsButtonsPanel5.setBorder(null);

        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/i52salia/aircontrol/resources/images/back-icon.png"))); // NOI18N
        backButton.setText("Go Back");
        programSettingsButtonsPanel5.add(backButton);

        invisibleSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        invisibleSeparator1.setBorder(null);
        invisibleSeparator1.setPreferredSize(new java.awt.Dimension(25, 0));
        programSettingsButtonsPanel5.add(invisibleSeparator1);

        saveNewProgramButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/i52salia/aircontrol/resources/images/save-program-icon.png"))); // NOI18N
        saveNewProgramButton.setText("Save");
        saveNewProgramButton.setEnabled(false);
        programSettingsButtonsPanel5.add(saveNewProgramButton);

        newProgramStep2ButtonsPanel.add(programSettingsButtonsPanel5);

        newProgramStep2MainPanel.add(newProgramStep2ButtonsPanel, java.awt.BorderLayout.SOUTH);

        add(newProgramStep2MainPanel);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton addProgramButton;
    public javax.swing.JButton backButton;
    public javax.swing.JButton cancelButton;
    public javax.swing.JButton cancelButton2;
    public javax.swing.JButton deleteProgramButton;
    private javax.swing.JSeparator invisibleSeparator;
    private javax.swing.JSeparator invisibleSeparator1;
    private javax.swing.JSeparator invisibleSeparator2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    public i52salia.aircontrol.components.ProgramSettingsComponent newProgramComponent;
    private javax.swing.JPanel newProgramStep1ButtonsPanel;
    private javax.swing.JPanel newProgramStep1MainPanel;
    private javax.swing.JPanel newProgramStep2ButtonsPanel;
    public javax.swing.JPanel newProgramStep2MainPanel;
    private javax.swing.JPanel programListButtonsPanel;
    public javax.swing.JPanel programListMainPanel;
    public javax.swing.JPanel programListPanel;
    private javax.swing.JPanel programSettingsButtonsPanel;
    private javax.swing.JPanel programSettingsButtonsPanel2;
    private javax.swing.JPanel programSettingsButtonsPanel3;
    private javax.swing.JPanel programSettingsButtonsPanel5;
    private javax.swing.JPanel programSettingsButtonsPanel6;
    public i52salia.aircontrol.components.ProgramSettingsComponent programSettingsComponent;
    public javax.swing.JPanel programSettingsMainPanel;
    public javax.swing.JButton saveChangesButton;
    private javax.swing.JButton saveNewProgramButton;
    private javax.swing.JButton saveNewProgramButton1;
    // End of variables declaration//GEN-END:variables
}
