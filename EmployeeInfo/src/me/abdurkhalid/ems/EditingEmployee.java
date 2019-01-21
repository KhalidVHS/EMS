/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.abdurkhalid.ems;

import javax.swing.JOptionPane;

/**
 *
 * @author 568789
 */
public class EditingEmployee extends javax.swing.JFrame {

    static EmployeeInfo theEmployee;

    /**
     * Creates new form EditingEmployee
     */
    public EditingEmployee(EmployeeInfo employee) {
        this.theEmployee = employee;
        initComponents();
        if (employee instanceof FullTimeEmployee) {
            HourlyWage.setVisible(false);
            HoursPerWeek.setVisible(false);
            WeeksPerYear.setVisible(false);
            HW.setVisible(false);
            HPW.setVisible(false);
            WPY.setVisible(false);
            setFields(false);
        } else {
            setFields(true);
        }
    }

    private void setFields(boolean isPartTime) {
        if (isPartTime) {
            PartTimeEmployee pte = (PartTimeEmployee) theEmployee;
            HW.setText("" + pte.getHourlyWage());
            HPW.setText("" + pte.getHoursPerWeek());
            WPY.setText("" + pte.getWeeksPerYear());
        } else {
            FullTimeEmployee fte = (FullTimeEmployee) theEmployee;
            SAL.setText("" + fte.calcDeductions(fte.getDeductionRate()));

        }
        FN.setText(theEmployee.getEmployeeFirstName());
        LN.setText(theEmployee.getEmployeeLastName());
        SX.setText("" + theEmployee.getEmployeeSex());
        EN.setText("" + theEmployee.getEmployeeNumber());
        WL.setText("" + theEmployee.getEmployeeWorkLocation());
        DR.setText("" + theEmployee.getDeductionRate());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        HourlyWage = new javax.swing.JLabel();
        HoursPerWeek = new javax.swing.JLabel();
        WeeksPerYear = new javax.swing.JLabel();
        EN = new javax.swing.JTextField();
        FN = new javax.swing.JTextField();
        LN = new javax.swing.JTextField();
        SX = new javax.swing.JTextField();
        WL = new javax.swing.JTextField();
        DR = new javax.swing.JTextField();
        SAL = new javax.swing.JTextField();
        HW = new javax.swing.JTextField();
        HPW = new javax.swing.JTextField();
        WPY = new javax.swing.JTextField();
        saveChangesButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Employee Edit");

        jLabel3.setText("Employee Number");

        jLabel4.setText("First Name ");

        jLabel5.setText("Last Name ");

        jLabel6.setText("Sex");

        jLabel7.setText("Work Location");

        jLabel8.setText("Deduction Rate");

        jLabel9.setText("Salary");

        HourlyWage.setText("Hourly Wage ");

        HoursPerWeek.setText("Hours Per Week");

        WeeksPerYear.setText("Weeks Per Year");

        EN.setText("EN");

        FN.setText("FN");

        LN.setText("LN");

        SX.setText("SX");

        WL.setText("WL");

        DR.setText("DR");

        SAL.setText("SAL");

        HW.setText("HW");

        HPW.setText("HPW");

        WPY.setText("WPY");

        saveChangesButton.setText("Save Changes");
        saveChangesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveChangesButtonActionPerformed(evt);
            }
        });

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(HourlyWage)
                            .addComponent(HoursPerWeek)
                            .addComponent(WeeksPerYear))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(WPY, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(HPW, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(HW, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SAL, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DR, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(WL, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SX, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LN, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FN, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EN, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(saveChangesButton)
                    .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(EN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saveChangesButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(FN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(LN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(SX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(WL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(DR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(SAL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HourlyWage)
                    .addComponent(HW, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HoursPerWeek)
                    .addComponent(HPW, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(WeeksPerYear)
                    .addComponent(WPY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void saveChangesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveChangesButtonActionPerformed
        try {
            String employeeNumberField = EN.getText();
            int employeeNumberFound = Integer.parseInt(employeeNumberField);
            String employeeFirstNameField = FN.getText();
            String employeeLastNameField = LN.getText();
            String employeeSexField = SX.getText();
            int employeeSex = Integer.parseInt(employeeSexField);
            String employeeworkLocationField = WL.getText();
            int employeeWorkLocation = Integer.parseInt(employeeworkLocationField);
            String employeeDRField = DR.getText();
            Double employeeDR = Double.parseDouble(employeeDRField);
            String salaryField = SAL.getText();
            Double employeeSalary = Double.parseDouble(salaryField);
            if (theEmployee instanceof PartTimeEmployee) {
                String hoursWorkedField = HW.getText();
                Double employeeHourlyWage = Double.parseDouble(hoursWorkedField);
                String hoursWorkedPerWeekField = HPW.getText();
                Double employeeHoursPerWeek = Double.parseDouble(hoursWorkedPerWeekField);
                String employeeWeeksPerYearField = WPY.getText();
                Double employeeWPY = Double.parseDouble(employeeWeeksPerYearField);
                mainjframe.theHash.removeFromTable(theEmployee.getEmployeeNumber());
                PartTimeEmployee employeeAdding = new PartTimeEmployee(employeeNumberFound, employeeFirstNameField, employeeLastNameField, employeeSex, employeeWorkLocation,
                        employeeDR, employeeHourlyWage, employeeHoursPerWeek, employeeWPY);
                mainjframe.theHash.addToBucket(employeeAdding);
                MyHashTable.employeesToDisplay();
                MyHashTable.resetArrayList(MyHashTable.addingtojtable);
                MyHashTable.displayTableInfo();
                JOptionPane.showMessageDialog(null ,"The Employee Has Been Added!");
            }
            else if (theEmployee instanceof FullTimeEmployee){
                mainjframe.theHash.removeFromTable(theEmployee.getEmployeeNumber());
                FullTimeEmployee employeeAdding = new FullTimeEmployee(employeeNumberFound,employeeFirstNameField,employeeLastNameField, employeeSex, 
                        employeeWorkLocation, employeeDR,employeeSalary);
                mainjframe.theHash.addToBucket(employeeAdding);
                MyHashTable.employeesToDisplay();
                MyHashTable.resetArrayList(MyHashTable.addingtojtable);
                MyHashTable.displayTableInfo();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"The Employee Could Not Be Edited!");
        }

    }//GEN-LAST:event_saveChangesButtonActionPerformed

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
            java.util.logging.Logger.getLogger(EditingEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditingEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditingEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditingEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditingEmployee(theEmployee).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DR;
    private javax.swing.JTextField EN;
    private javax.swing.JTextField FN;
    private javax.swing.JTextField HPW;
    private javax.swing.JTextField HW;
    private javax.swing.JLabel HourlyWage;
    private javax.swing.JLabel HoursPerWeek;
    private javax.swing.JTextField LN;
    private javax.swing.JTextField SAL;
    private javax.swing.JTextField SX;
    private javax.swing.JTextField WL;
    private javax.swing.JTextField WPY;
    private javax.swing.JLabel WeeksPerYear;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton saveChangesButton;
    // End of variables declaration//GEN-END:variables
}
