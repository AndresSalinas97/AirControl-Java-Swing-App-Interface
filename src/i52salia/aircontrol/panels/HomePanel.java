package i52salia.aircontrol.panels;

/**
 * JPanel for the Home tab.
 *
 * (Most of the code was automatically generated by NetBeans).
 *
 * @author Andrés Salinas Lima (i52salia@uco.es)
 */
public final class HomePanel extends javax.swing.JPanel {

    /**
     * Creates and initializes the JPanel.
     */
    public HomePanel() {
        initComponents();

        // Hide subpanels
        deviceListMainPanel.setVisible(true);
        deviceSettingsMainPanel.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        deviceListMainPanel = new javax.swing.JPanel();
        deviceListScrollPane = new javax.swing.JScrollPane();
        deviceListPanel = new javax.swing.JPanel();
        deviceListButtonsPanel = new javax.swing.JPanel();
        addDeviceButton = new javax.swing.JButton();
        deviceSettingsMainPanel = new javax.swing.JPanel();
        deviceSettingsScrollPane = new javax.swing.JScrollPane();
        deviceSettingsListPanel = new javax.swing.JPanel();
        powerPanel = new javax.swing.JPanel();
        onOffButton = new i52salia.aircontrol.components.OnOffButton();
        currentTempPanel = new javax.swing.JPanel();
        currentTempLabel = new javax.swing.JLabel();
        setPointTempPanel = new javax.swing.JPanel();
        setpointTempSpinner = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        modePanel = new javax.swing.JPanel();
        modeButtons = new i52salia.aircontrol.components.ModeSelector();
        fanSpeedPanel = new javax.swing.JPanel();
        fanSpeedSelector = new i52salia.aircontrol.components.FanSpeedSelector();
        deviceSettingsButtonsPanel = new javax.swing.JPanel();
        backButton = new javax.swing.JButton();
        invisibleSeparator = new javax.swing.JSeparator();
        moreSettingsButton = new javax.swing.JButton();

        setLayout(new javax.swing.OverlayLayout(this));

        deviceListMainPanel.setLayout(new java.awt.BorderLayout());

        deviceListScrollPane.setBorder(null);

        deviceListPanel.setLayout(new javax.swing.BoxLayout(deviceListPanel, javax.swing.BoxLayout.Y_AXIS));
        deviceListScrollPane.setViewportView(deviceListPanel);

        deviceListMainPanel.add(deviceListScrollPane, java.awt.BorderLayout.CENTER);

        deviceListButtonsPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));

        addDeviceButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/i52salia/aircontrol/resources/images/add-icon.png"))); // NOI18N
        addDeviceButton.setText("Add New Device");
        addDeviceButton.setEnabled(false);
        deviceListButtonsPanel.add(addDeviceButton);

        deviceListMainPanel.add(deviceListButtonsPanel, java.awt.BorderLayout.SOUTH);

        add(deviceListMainPanel);

        deviceSettingsMainPanel.setEnabled(false);
        deviceSettingsMainPanel.setLayout(new java.awt.BorderLayout());

        deviceSettingsScrollPane.setBorder(null);

        deviceSettingsListPanel.setLayout(new javax.swing.BoxLayout(deviceSettingsListPanel, javax.swing.BoxLayout.Y_AXIS));

        powerPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Power"));
        powerPanel.setMaximumSize(new java.awt.Dimension(500, 100));
        powerPanel.add(onOffButton);

        deviceSettingsListPanel.add(powerPanel);

        currentTempPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Current Temperature"));
        currentTempPanel.setMaximumSize(new java.awt.Dimension(500, 100));

        currentTempLabel.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        currentTempLabel.setText("jLabel2");
        currentTempPanel.add(currentTempLabel);

        deviceSettingsListPanel.add(currentTempPanel);

        setPointTempPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Setpoint Temperature"));
        setPointTempPanel.setMaximumSize(new java.awt.Dimension(500, 100));

        setpointTempSpinner.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        setpointTempSpinner.setModel(new javax.swing.SpinnerNumberModel(Float.valueOf(10.0f), Float.valueOf(10.0f), Float.valueOf(30.0f), Float.valueOf(0.5f)));
        setpointTempSpinner.setPreferredSize(new java.awt.Dimension(70, 28));
        setPointTempPanel.add(setpointTempSpinner);

        jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel1.setText("ºC");
        setPointTempPanel.add(jLabel1);

        deviceSettingsListPanel.add(setPointTempPanel);

        modePanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Mode"));
        modePanel.setMaximumSize(new java.awt.Dimension(500, 100));
        modePanel.add(modeButtons);

        deviceSettingsListPanel.add(modePanel);

        fanSpeedPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Fan Speed"));
        fanSpeedPanel.setMaximumSize(new java.awt.Dimension(500, 100));
        fanSpeedPanel.add(fanSpeedSelector);

        deviceSettingsListPanel.add(fanSpeedPanel);

        deviceSettingsScrollPane.setViewportView(deviceSettingsListPanel);

        deviceSettingsMainPanel.add(deviceSettingsScrollPane, java.awt.BorderLayout.CENTER);

        deviceSettingsButtonsPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));

        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/i52salia/aircontrol/resources/images/back-icon.png"))); // NOI18N
        backButton.setText("Go Back");
        deviceSettingsButtonsPanel.add(backButton);

        invisibleSeparator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        invisibleSeparator.setBorder(null);
        invisibleSeparator.setPreferredSize(new java.awt.Dimension(25, 0));
        deviceSettingsButtonsPanel.add(invisibleSeparator);

        moreSettingsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/i52salia/aircontrol/resources/images/settings-small-icon.png"))); // NOI18N
        moreSettingsButton.setText("More Settings");
        moreSettingsButton.setEnabled(false);
        deviceSettingsButtonsPanel.add(moreSettingsButton);

        deviceSettingsMainPanel.add(deviceSettingsButtonsPanel, java.awt.BorderLayout.SOUTH);

        add(deviceSettingsMainPanel);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addDeviceButton;
    public javax.swing.JButton backButton;
    public javax.swing.JLabel currentTempLabel;
    private javax.swing.JPanel currentTempPanel;
    private javax.swing.JPanel deviceListButtonsPanel;
    public javax.swing.JPanel deviceListMainPanel;
    public javax.swing.JPanel deviceListPanel;
    private javax.swing.JScrollPane deviceListScrollPane;
    private javax.swing.JPanel deviceSettingsButtonsPanel;
    public javax.swing.JPanel deviceSettingsListPanel;
    public javax.swing.JPanel deviceSettingsMainPanel;
    private javax.swing.JScrollPane deviceSettingsScrollPane;
    private javax.swing.JPanel fanSpeedPanel;
    public i52salia.aircontrol.components.FanSpeedSelector fanSpeedSelector;
    private javax.swing.JSeparator invisibleSeparator;
    private javax.swing.JLabel jLabel1;
    public i52salia.aircontrol.components.ModeSelector modeButtons;
    private javax.swing.JPanel modePanel;
    private javax.swing.JButton moreSettingsButton;
    public i52salia.aircontrol.components.OnOffButton onOffButton;
    private javax.swing.JPanel powerPanel;
    private javax.swing.JPanel setPointTempPanel;
    public javax.swing.JSpinner setpointTempSpinner;
    // End of variables declaration//GEN-END:variables
}
