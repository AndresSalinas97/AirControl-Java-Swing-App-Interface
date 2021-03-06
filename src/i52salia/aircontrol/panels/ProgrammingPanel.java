package i52salia.aircontrol.panels;

/**
 * JPanel for the Programming tab.
 *
 * (Some of the code was automatically generated by NetBeans and should not be
 * modified to avoid conflicts with the IDE).
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
        newProgramStep1MainPanel.setVisible(false);
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
        programListScrollPane = new javax.swing.JScrollPane();
        programListPanel = new javax.swing.JPanel();
        programListButtonsPanel = new javax.swing.JPanel();
        addProgramButton = new javax.swing.JButton();
        programSettingsMainPanel = new javax.swing.JPanel();
        programSettingsScrollPane = new javax.swing.JScrollPane();
        programSettingsComponent = new i52salia.aircontrol.components.ProgramSettingsPanel();
        programSettingsButtonsPanels = new javax.swing.JPanel();
        programSettingsButtonsPanel1 = new javax.swing.JPanel();
        deleteProgramButton = new javax.swing.JButton();
        programSettingsButtonsPanel2 = new javax.swing.JPanel();
        cancelChangesButton = new javax.swing.JButton();
        invisibleSeparator3 = new javax.swing.JSeparator();
        saveChangesButton = new javax.swing.JButton();
        newProgramStep1MainPanel = new javax.swing.JPanel();
        newProgramStep1Panel = new javax.swing.JPanel();
        selectDeviceLabel = new javax.swing.JLabel();
        newProgramStep1ScrollPane = new javax.swing.JScrollPane();
        devicesList = new javax.swing.JList();
        newProgramStep1ButtonsPanel = new javax.swing.JPanel();
        cancelStep1Button = new javax.swing.JButton();
        invisibleSeparator2 = new javax.swing.JSeparator();
        nextStepButton = new javax.swing.JButton();
        newProgramStep2MainPanel = new javax.swing.JPanel();
        newProgramStep2ScrollPane = new javax.swing.JScrollPane();
        newProgramComponent = new i52salia.aircontrol.components.ProgramSettingsPanel();
        newProgramStep2ButtonsPanel = new javax.swing.JPanel();
        backToStep1Button = new javax.swing.JButton();
        invisibleSeparator1 = new javax.swing.JSeparator();
        saveNewProgramButton = new javax.swing.JButton();

        setLayout(new javax.swing.OverlayLayout(this));

        programListMainPanel.setLayout(new java.awt.BorderLayout());

        programListScrollPane.setBorder(null);

        programListPanel.setLayout(new javax.swing.BoxLayout(programListPanel, javax.swing.BoxLayout.Y_AXIS));
        programListScrollPane.setViewportView(programListPanel);

        programListMainPanel.add(programListScrollPane, java.awt.BorderLayout.CENTER);

        programListButtonsPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));

        addProgramButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/i52salia/aircontrol/resources/images/save-program-icon.png"))); // NOI18N
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("i52salia/aircontrol/resources/languagebundles/Bundle"); // NOI18N
        addProgramButton.setText(bundle.getString("ProgrammingPanel.AddProgram")); // NOI18N
        programListButtonsPanel.add(addProgramButton);

        programListMainPanel.add(programListButtonsPanel, java.awt.BorderLayout.SOUTH);

        add(programListMainPanel);

        programSettingsMainPanel.setEnabled(false);
        programSettingsMainPanel.setLayout(new java.awt.BorderLayout());

        programSettingsScrollPane.setBorder(null);
        programSettingsScrollPane.setViewportView(programSettingsComponent);

        programSettingsMainPanel.add(programSettingsScrollPane, java.awt.BorderLayout.CENTER);

        programSettingsButtonsPanels.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        programSettingsButtonsPanels.setLayout(new javax.swing.BoxLayout(programSettingsButtonsPanels, javax.swing.BoxLayout.Y_AXIS));

        deleteProgramButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/i52salia/aircontrol/resources/images/delete-program-icon.png"))); // NOI18N
        deleteProgramButton.setText(bundle.getString("ProgrammingPanel.DeleteProgram")); // NOI18N
        deleteProgramButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        programSettingsButtonsPanel1.add(deleteProgramButton);

        programSettingsButtonsPanels.add(programSettingsButtonsPanel1);

        programSettingsButtonsPanel2.setBorder(null);

        cancelChangesButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/i52salia/aircontrol/resources/images/back-icon.png"))); // NOI18N
        cancelChangesButton.setText(bundle.getString("ProgrammingPanel.Cancel")); // NOI18N
        programSettingsButtonsPanel2.add(cancelChangesButton);

        invisibleSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        invisibleSeparator3.setBorder(null);
        invisibleSeparator3.setPreferredSize(new java.awt.Dimension(25, 0));
        programSettingsButtonsPanel2.add(invisibleSeparator3);

        saveChangesButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/i52salia/aircontrol/resources/images/save-program-icon.png"))); // NOI18N
        saveChangesButton.setText(bundle.getString("ProgrammingPanel.Save")); // NOI18N
        programSettingsButtonsPanel2.add(saveChangesButton);

        programSettingsButtonsPanels.add(programSettingsButtonsPanel2);

        programSettingsMainPanel.add(programSettingsButtonsPanels, java.awt.BorderLayout.SOUTH);

        add(programSettingsMainPanel);

        newProgramStep1MainPanel.setLayout(new java.awt.BorderLayout());

        newProgramStep1Panel.setLayout(new java.awt.BorderLayout(0, 5));

        selectDeviceLabel.setText(bundle.getString("ProgrammingPanel.ChooseADevice")); // NOI18N
        newProgramStep1Panel.add(selectDeviceLabel, java.awt.BorderLayout.NORTH);

        devicesList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        newProgramStep1ScrollPane.setViewportView(devicesList);

        newProgramStep1Panel.add(newProgramStep1ScrollPane, java.awt.BorderLayout.CENTER);

        newProgramStep1MainPanel.add(newProgramStep1Panel, java.awt.BorderLayout.CENTER);

        newProgramStep1ButtonsPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));

        cancelStep1Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/i52salia/aircontrol/resources/images/back-icon.png"))); // NOI18N
        cancelStep1Button.setText(bundle.getString("ProgrammingPanel.Cancel")); // NOI18N
        newProgramStep1ButtonsPanel.add(cancelStep1Button);

        invisibleSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        invisibleSeparator2.setBorder(null);
        invisibleSeparator2.setPreferredSize(new java.awt.Dimension(25, 0));
        newProgramStep1ButtonsPanel.add(invisibleSeparator2);

        nextStepButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/i52salia/aircontrol/resources/images/next-icon.png"))); // NOI18N
        nextStepButton.setText(bundle.getString("ProgrammingPanel.Next")); // NOI18N
        newProgramStep1ButtonsPanel.add(nextStepButton);

        newProgramStep1MainPanel.add(newProgramStep1ButtonsPanel, java.awt.BorderLayout.SOUTH);

        add(newProgramStep1MainPanel);

        newProgramStep2MainPanel.setEnabled(false);
        newProgramStep2MainPanel.setLayout(new java.awt.BorderLayout());

        newProgramStep2ScrollPane.setBorder(null);
        newProgramStep2ScrollPane.setViewportView(newProgramComponent);

        newProgramStep2MainPanel.add(newProgramStep2ScrollPane, java.awt.BorderLayout.CENTER);

        newProgramStep2ButtonsPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));

        backToStep1Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/i52salia/aircontrol/resources/images/back-icon.png"))); // NOI18N
        backToStep1Button.setText(bundle.getString("ProgrammingPanel.GoBack")); // NOI18N
        newProgramStep2ButtonsPanel.add(backToStep1Button);

        invisibleSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        invisibleSeparator1.setBorder(null);
        invisibleSeparator1.setPreferredSize(new java.awt.Dimension(25, 0));
        newProgramStep2ButtonsPanel.add(invisibleSeparator1);

        saveNewProgramButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/i52salia/aircontrol/resources/images/save-program-icon.png"))); // NOI18N
        saveNewProgramButton.setText(bundle.getString("ProgrammingPanel.SaveNewProgram")); // NOI18N
        newProgramStep2ButtonsPanel.add(saveNewProgramButton);

        newProgramStep2MainPanel.add(newProgramStep2ButtonsPanel, java.awt.BorderLayout.SOUTH);

        add(newProgramStep2MainPanel);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton addProgramButton;
    public javax.swing.JButton backToStep1Button;
    public javax.swing.JButton cancelChangesButton;
    public javax.swing.JButton cancelStep1Button;
    public javax.swing.JButton deleteProgramButton;
    public javax.swing.JList devicesList;
    private javax.swing.JSeparator invisibleSeparator1;
    private javax.swing.JSeparator invisibleSeparator2;
    private javax.swing.JSeparator invisibleSeparator3;
    public i52salia.aircontrol.components.ProgramSettingsPanel newProgramComponent;
    private javax.swing.JPanel newProgramStep1ButtonsPanel;
    public javax.swing.JPanel newProgramStep1MainPanel;
    private javax.swing.JPanel newProgramStep1Panel;
    private javax.swing.JScrollPane newProgramStep1ScrollPane;
    private javax.swing.JPanel newProgramStep2ButtonsPanel;
    public javax.swing.JPanel newProgramStep2MainPanel;
    private javax.swing.JScrollPane newProgramStep2ScrollPane;
    public javax.swing.JButton nextStepButton;
    private javax.swing.JPanel programListButtonsPanel;
    public javax.swing.JPanel programListMainPanel;
    public javax.swing.JPanel programListPanel;
    private javax.swing.JScrollPane programListScrollPane;
    private javax.swing.JPanel programSettingsButtonsPanel1;
    private javax.swing.JPanel programSettingsButtonsPanel2;
    private javax.swing.JPanel programSettingsButtonsPanels;
    public i52salia.aircontrol.components.ProgramSettingsPanel programSettingsComponent;
    public javax.swing.JPanel programSettingsMainPanel;
    private javax.swing.JScrollPane programSettingsScrollPane;
    public javax.swing.JButton saveChangesButton;
    public javax.swing.JButton saveNewProgramButton;
    private javax.swing.JLabel selectDeviceLabel;
    // End of variables declaration//GEN-END:variables
}
