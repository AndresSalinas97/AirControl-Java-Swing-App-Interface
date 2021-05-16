package i52salia.aircontrol.components;

/**
 * JPanel used to show each device in the Home tab devices list.
 * 
 * (Most of the code was automatically generated by NetBeans).
 * 
 * @author Andrés Salinas Lima {@literal <i52salia@uco.es>}
 */
public class DeviceListComponent extends javax.swing.JPanel {

    /**
     * Constructor for the DeviceListComponent class.
     */
    public DeviceListComponent() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nameLabel = new javax.swing.JLabel();
        stuffPanel = new javax.swing.JPanel();
        onPanel = new javax.swing.JPanel();
        modeLabel = new javax.swing.JLabel();
        setpointTempLabel = new javax.swing.JLabel();
        fanSpeedLabel = new javax.swing.JLabel();
        currentTempOnLabel = new javax.swing.JLabel();
        offPanel = new javax.swing.JPanel();
        offLabel = new javax.swing.JLabel();
        currentTempOffLabel = new javax.swing.JLabel();
        buttonPanel = new javax.swing.JPanel();
        onOffButton = new i52salia.aircontrol.components.onoffbutton.OnOffButton();

        setBorder(javax.swing.BorderFactory.createEtchedBorder());
        setMaximumSize(new java.awt.Dimension(500, 100));
        setLayout(new java.awt.BorderLayout());

        nameLabel.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        nameLabel.setText("jLabel2");
        nameLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        add(nameLabel, java.awt.BorderLayout.NORTH);

        stuffPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 20, 0, 20));
        stuffPanel.setLayout(new javax.swing.OverlayLayout(stuffPanel));

        onPanel.setLayout(new java.awt.GridLayout(2, 2));

        modeLabel.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        modeLabel.setText("jLabel1");
        modeLabel.setBorder(null);
        onPanel.add(modeLabel);

        setpointTempLabel.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        setpointTempLabel.setText("jLabel1");
        setpointTempLabel.setBorder(null);
        onPanel.add(setpointTempLabel);

        fanSpeedLabel.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        fanSpeedLabel.setText("jLabel1");
        fanSpeedLabel.setBorder(null);
        onPanel.add(fanSpeedLabel);

        currentTempOnLabel.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        currentTempOnLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/i52salia/aircontrol/resources/images/thermometer-icon.png"))); // NOI18N
        currentTempOnLabel.setText("jLabel1");
        currentTempOnLabel.setBorder(null);
        onPanel.add(currentTempOnLabel);

        stuffPanel.add(onPanel);

        offPanel.setLayout(new java.awt.GridLayout(2, 1));

        offLabel.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        offLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        offLabel.setText("OFF");
        offPanel.add(offLabel);

        currentTempOffLabel.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        currentTempOffLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        currentTempOffLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/i52salia/aircontrol/resources/images/thermometer-icon.png"))); // NOI18N
        currentTempOffLabel.setText("jLabel1");
        currentTempOffLabel.setBorder(null);
        offPanel.add(currentTempOffLabel);

        stuffPanel.add(offPanel);

        add(stuffPanel, java.awt.BorderLayout.CENTER);

        buttonPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 10));
        buttonPanel.setLayout(new java.awt.GridBagLayout());
        buttonPanel.add(onOffButton, new java.awt.GridBagConstraints());

        add(buttonPanel, java.awt.BorderLayout.EAST);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel buttonPanel;
    public javax.swing.JLabel currentTempOffLabel;
    public javax.swing.JLabel currentTempOnLabel;
    public javax.swing.JLabel fanSpeedLabel;
    public javax.swing.JLabel modeLabel;
    public javax.swing.JLabel nameLabel;
    private javax.swing.JLabel offLabel;
    public javax.swing.JPanel offPanel;
    public i52salia.aircontrol.components.onoffbutton.OnOffButton onOffButton;
    public javax.swing.JPanel onPanel;
    public javax.swing.JLabel setpointTempLabel;
    private javax.swing.JPanel stuffPanel;
    // End of variables declaration//GEN-END:variables
}
