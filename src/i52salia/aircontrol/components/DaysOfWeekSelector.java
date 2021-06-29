package i52salia.aircontrol.components;

import i52salia.aircontrol.utils.DaysOfWeekSelection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Java Swing Component (JPanel) to select the days of the week of an AC
 * program.
 *
 * (Much of the code was automatically generated by NetBeans).
 *
 * @author Andrés Salinas Lima (i52salia@uco.es)
 */
public final class DaysOfWeekSelector extends javax.swing.JPanel {

    private DaysOfWeekSelection daysOfWeekSelection;

    /**
     * Creates and initializes the JPanel.
     */
    public DaysOfWeekSelector() {
        initComponents();
        
        // Initialize member to avoid null pointer exceptions
        daysOfWeekSelection = new DaysOfWeekSelection();
        
        addActionListener((ActionEvent e) -> {
            updateSelectionMember();
        });
    }

    /**
     * @return the selection represented by the current state of the buttons
     */
    public DaysOfWeekSelection getSelection() {
        return daysOfWeekSelection;
    }

    /**
     * Sets the selection that will be represented by the buttons.
     * 
     * @param daysOfWeekSelection
     */
    public void setSelection(DaysOfWeekSelection daysOfWeekSelection) {
        this.daysOfWeekSelection = daysOfWeekSelection;
        
        monButton.setSelected(daysOfWeekSelection.isOnMondays());
        tueButton.setSelected(daysOfWeekSelection.isOnTuesdays());
        wedButton.setSelected(daysOfWeekSelection.isOnWednesdays());
        thuButton.setSelected(daysOfWeekSelection.isOnThursdays());
        friButton.setSelected(daysOfWeekSelection.isOnFridays());
        satButton.setSelected(daysOfWeekSelection.isOnSaturdays());
        sunButton.setSelected(daysOfWeekSelection.isOnSundays());
    }

    /**
     * Allows to add an ActionListener to all the buttons.
     * 
     * @param l
     */
    public void addActionListener(ActionListener l) {
        monButton.addActionListener(l);
        tueButton.addActionListener(l);
        wedButton.addActionListener(l);
        thuButton.addActionListener(l);
        friButton.addActionListener(l);
        satButton.addActionListener(l);
        sunButton.addActionListener(l);
    }

    /**
     * Allows to enable/disable all the buttons.
     * 
     * @param b 
     */
    @Override
    public void setEnabled(boolean b) {
        monButton.setEnabled(b);
        tueButton.setEnabled(b);
        wedButton.setEnabled(b);
        thuButton.setEnabled(b);
        friButton.setEnabled(b);
        satButton.setEnabled(b);
        sunButton.setEnabled(b);
    }

    private void updateSelectionMember() {
        daysOfWeekSelection.setOnMondays(monButton.isSelected());
        daysOfWeekSelection.setOnTuesdays(tueButton.isSelected());
        daysOfWeekSelection.setOnWednesdays(wedButton.isSelected());
        daysOfWeekSelection.setOnThursdays(thuButton.isSelected());
        daysOfWeekSelection.setOnFridays(friButton.isSelected());
        daysOfWeekSelection.setOnSaturdays(satButton.isSelected());
        daysOfWeekSelection.setOnSundays(sunButton.isSelected());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        weekdaysPanel = new javax.swing.JPanel();
        monButton = new javax.swing.JToggleButton();
        tueButton = new javax.swing.JToggleButton();
        wedButton = new javax.swing.JToggleButton();
        thuButton = new javax.swing.JToggleButton();
        friButton = new javax.swing.JToggleButton();
        weekendPanel = new javax.swing.JPanel();
        satButton = new javax.swing.JToggleButton();
        sunButton = new javax.swing.JToggleButton();

        setLayout(new java.awt.BorderLayout());

        weekdaysPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 4, 2));

        monButton.setText("Mon");
        weekdaysPanel.add(monButton);

        tueButton.setText("Tue");
        weekdaysPanel.add(tueButton);

        wedButton.setText("Wed");
        weekdaysPanel.add(wedButton);

        thuButton.setText("Thu");
        weekdaysPanel.add(thuButton);

        friButton.setText("Fri");
        weekdaysPanel.add(friButton);

        add(weekdaysPanel, java.awt.BorderLayout.NORTH);

        weekendPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 4, 2));

        satButton.setText("Sat");
        weekendPanel.add(satButton);

        sunButton.setText("Sun");
        weekendPanel.add(sunButton);

        add(weekendPanel, java.awt.BorderLayout.SOUTH);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton friButton;
    private javax.swing.JToggleButton monButton;
    private javax.swing.JToggleButton satButton;
    private javax.swing.JToggleButton sunButton;
    private javax.swing.JToggleButton thuButton;
    private javax.swing.JToggleButton tueButton;
    private javax.swing.JToggleButton wedButton;
    private javax.swing.JPanel weekdaysPanel;
    private javax.swing.JPanel weekendPanel;
    // End of variables declaration//GEN-END:variables
}
