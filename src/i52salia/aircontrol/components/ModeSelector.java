package i52salia.aircontrol.components;

import i52salia.aircontrol.utils.AirConditioner;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.event.ChangeListener;

/**
 * Java Swing Component (JPanel) to select the mode of an air conditioning
 * device.
 *
 * (Most of the code was automatically generated by NetBeans).
 *
 * @author Andrés Salinas Lima {@literal <i52salia@uco.es>}
 */
public class ModeSelector extends javax.swing.JPanel {

    /**
     * Creates new form ModeButtons
     */
    public ModeSelector() {
        initComponents();

        // Add buttons to the buttonGroup so they are all mutually exclusive
        buttonGroup.add(coolButton);
        buttonGroup.add(fanButton);
        buttonGroup.add(dryButton);
        buttonGroup.add(heatButton);
        buttonGroup.add(autoButton);

        // Add mouse listeners so that clicking on the panel also works
        coolPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                coolButton.setSelected(true);
            }
        });
        fanPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                fanButton.setSelected(true);
            }
        });
        dryPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                dryButton.setSelected(true);
            }
        });
        heatPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                heatButton.setSelected(true);
            }
        });
        autoPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                autoButton.setSelected(true);
            }
        });
    }

    /**
     * Selects the button that corresponds to the introduced mode.
     *
     * @param mode the mode to be selected
     */
    public void setSelectedMode(AirConditioner.Mode mode) {
        switch (mode) {
            case COOL:
                coolButton.setSelected(true);
                break;
            case FAN:
                fanButton.setSelected(true);
                break;
            case DRY:
                dryButton.setSelected(true);
                break;
            case HEAT:
                heatButton.setSelected(true);
                break;
            case AUTO:
                autoButton.setSelected(true);
                break;
        }
    }

    /**
     * @return the selected mode
     */
    public AirConditioner.Mode getSelectedMode() {
        if (coolButton.isSelected()) {
            return AirConditioner.Mode.COOL;
        } else if (fanButton.isSelected()) {
            return AirConditioner.Mode.FAN;
        } else if (dryButton.isSelected()) {
            return AirConditioner.Mode.DRY;
        } else if (heatButton.isSelected()) {
            return AirConditioner.Mode.HEAT;
        } else {
            return AirConditioner.Mode.AUTO;
        }
    }

    /**
     * Add a ChangeListener to all the buttons so the listener is notified when
     * any of them changes.
     *
     * @param l the ChangeListener
     */
    public void addChangeListener(ChangeListener l) {
        coolButton.addChangeListener(l);
        fanButton.addChangeListener(l);
        dryButton.addChangeListener(l);
        heatButton.addChangeListener(l);
        autoButton.addChangeListener(l);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup = new javax.swing.ButtonGroup();
        coolPanel = new javax.swing.JPanel();
        coolLabel = new javax.swing.JLabel();
        coolButton = new javax.swing.JRadioButton();
        fanPanel = new javax.swing.JPanel();
        fanLabel = new javax.swing.JLabel();
        fanButton = new javax.swing.JRadioButton();
        dryPanel = new javax.swing.JPanel();
        dryLabel = new javax.swing.JLabel();
        dryButton = new javax.swing.JRadioButton();
        heatPanel = new javax.swing.JPanel();
        heatLabel = new javax.swing.JLabel();
        heatButton = new javax.swing.JRadioButton();
        autoPanel = new javax.swing.JPanel();
        autoLabel = new javax.swing.JLabel();
        autoButton = new javax.swing.JRadioButton();

        setBorder(null);
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));

        coolPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        coolPanel.setLayout(new java.awt.GridLayout(2, 1));

        coolLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        coolLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/i52salia/aircontrol/resources/images/cool-icon.png"))); // NOI18N
        coolPanel.add(coolLabel);

        coolButton.setText("Cool");
        coolButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        coolPanel.add(coolButton);

        add(coolPanel);

        fanPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        fanPanel.setLayout(new java.awt.GridLayout(2, 1));

        fanLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fanLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/i52salia/aircontrol/resources/images/fan-icon.png"))); // NOI18N
        fanPanel.add(fanLabel);

        fanButton.setText("Fan");
        fanButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fanPanel.add(fanButton);

        add(fanPanel);

        dryPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        dryPanel.setLayout(new java.awt.GridLayout(2, 1));

        dryLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dryLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/i52salia/aircontrol/resources/images/dry-icon.png"))); // NOI18N
        dryPanel.add(dryLabel);

        dryButton.setText("Dry");
        dryButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dryPanel.add(dryButton);

        add(dryPanel);

        heatPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        heatPanel.setLayout(new java.awt.GridLayout(2, 1));

        heatLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        heatLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/i52salia/aircontrol/resources/images/heat-icon.png"))); // NOI18N
        heatPanel.add(heatLabel);

        heatButton.setText("Heat");
        heatButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        heatButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                heatButtonActionPerformed(evt);
            }
        });
        heatPanel.add(heatButton);

        add(heatPanel);

        autoPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        autoPanel.setLayout(new java.awt.GridLayout(2, 1));

        autoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        autoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/i52salia/aircontrol/resources/images/auto-icon.png"))); // NOI18N
        autoPanel.add(autoLabel);

        autoButton.setText("AUTO");
        autoButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        autoPanel.add(autoButton);

        add(autoPanel);
    }// </editor-fold>//GEN-END:initComponents

    private void heatButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_heatButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_heatButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton autoButton;
    private javax.swing.JLabel autoLabel;
    private javax.swing.JPanel autoPanel;
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JRadioButton coolButton;
    private javax.swing.JLabel coolLabel;
    private javax.swing.JPanel coolPanel;
    private javax.swing.JRadioButton dryButton;
    private javax.swing.JLabel dryLabel;
    private javax.swing.JPanel dryPanel;
    private javax.swing.JRadioButton fanButton;
    private javax.swing.JLabel fanLabel;
    private javax.swing.JPanel fanPanel;
    private javax.swing.JRadioButton heatButton;
    private javax.swing.JLabel heatLabel;
    private javax.swing.JPanel heatPanel;
    // End of variables declaration//GEN-END:variables
}
