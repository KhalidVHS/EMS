package me.abdurkhalid.ems;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author KhalidVHS
 */
public class PartTimeEmployeeForm extends javax.swing.JFrame {

    /**
     * Creates new form PartTimeEmployeeForm
     */
    public PartTimeEmployeeForm() {
        this.setTitle("Adding Part Time Employee...");
        initComponents();
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent event) {
              event.getWindow().dispose();
            }
        });
    }
    //  public EmployeeInfo retrieveInfo(){

    // }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        firstnamefield = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        lastnamefield = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        employeenumberfield = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        sexfield = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        worklocationfield = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        hourlywagefield = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        hoursworkedperweekfield = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        weeksworkedperyearfield = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        cancelbutton = new javax.swing.JButton();
        addemployeebuton = new javax.swing.JButton();
        deductionratefield = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jLabel1.setText("Adding Part Time Employee!");

        firstnamefield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstnamefieldActionPerformed(evt);
            }
        });

        jLabel2.setText("First Name ");

        lastnamefield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastnamefieldActionPerformed(evt);
            }
        });

        jLabel3.setText("Last Name ");

        employeenumberfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeenumberfieldActionPerformed(evt);
            }
        });

        jLabel4.setText("EmployeeNumber ");

        sexfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sexfieldActionPerformed(evt);
            }
        });

        jLabel5.setText("Sex");

        worklocationfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                worklocationfieldActionPerformed(evt);
            }
        });

        jLabel6.setText("Work Location ");

        hourlywagefield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hourlywagefieldActionPerformed(evt);
            }
        });

        jLabel7.setText("Hourly Wage");

        hoursworkedperweekfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hoursworkedperweekfieldActionPerformed(evt);
            }
        });

        jLabel8.setText("Hours Worked Per Week");

        weeksworkedperyearfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                weeksworkedperyearfieldActionPerformed(evt);
            }
        });

        jLabel9.setText("Weeks Worked Per Year ");

        cancelbutton.setText("Cancel");
        cancelbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelbuttonActionPerformed(evt);
            }
        });

        addemployeebuton.setText("Add Employee!");
        addemployeebuton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addemployeebutonActionPerformed(evt);
            }
        });

        jLabel10.setText("Deduction Rate");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel1))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(deductionratefield, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(weeksworkedperyearfield, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                    .addComponent(hoursworkedperweekfield, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hourlywagefield, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(worklocationfield, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sexfield, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(employeenumberfield, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lastnamefield, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(firstnamefield, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cancelbutton)
                .addGap(18, 18, 18)
                .addComponent(addemployeebuton))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstnamefield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(lastnamefield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(employeenumberfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sexfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(worklocationfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hourlywagefield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hoursworkedperweekfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(weeksworkedperyearfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deductionratefield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelbutton)
                    .addComponent(addemployeebuton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void firstnamefieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstnamefieldActionPerformed

    }//GEN-LAST:event_firstnamefieldActionPerformed

    private void lastnamefieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastnamefieldActionPerformed

    }//GEN-LAST:event_lastnamefieldActionPerformed

    private void employeenumberfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeenumberfieldActionPerformed

    }//GEN-LAST:event_employeenumberfieldActionPerformed

    private void sexfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sexfieldActionPerformed

    }//GEN-LAST:event_sexfieldActionPerformed

    private void worklocationfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_worklocationfieldActionPerformed

    }//GEN-LAST:event_worklocationfieldActionPerformed

    private void hourlywagefieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hourlywagefieldActionPerformed

    }//GEN-LAST:event_hourlywagefieldActionPerformed

    private void hoursworkedperweekfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hoursworkedperweekfieldActionPerformed

    }//GEN-LAST:event_hoursworkedperweekfieldActionPerformed

    private void weeksworkedperyearfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_weeksworkedperyearfieldActionPerformed

    }//GEN-LAST:event_weeksworkedperyearfieldActionPerformed

    private void addemployeebutonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addemployeebutonActionPerformed
        try{
        String firstNameFromField = firstnamefield.getText();
        String lastNameFromField = lastnamefield.getText();
        String employeeNumberFromField = employeenumberfield.getText();
        int employeeNumber = Integer.parseInt(employeeNumberFromField);
        String sexFromField = sexfield.getText();
        int sexEntered = Integer.parseInt(sexFromField);
        String WorkLocationFromField = worklocationfield.getText();
        int workLocationEntered = Integer.parseInt(WorkLocationFromField);
        String hourlyWageFromField = hourlywagefield.getText();
        double hourlyWageEntered = Double.parseDouble(hourlyWageFromField);
        String hoursWorkedPerWeek = hoursworkedperweekfield.getText();
        double hoursWorkedEntered = Double.parseDouble(hoursWorkedPerWeek);
        String weeksWorkedPerYear = weeksworkedperyearfield.getText();
        double weeksWorkedEntered = Double.parseDouble(weeksWorkedPerYear);
        String deductionRateFromField = deductionratefield.getText();
        double deductionRateEntered = Double.parseDouble(deductionRateFromField);
        if (deductionRateEntered > 1) {
            deductionRateEntered = deductionRateEntered - 100;
        }
        PartTimeEmployee employeeAdding = new PartTimeEmployee(employeeNumber, firstNameFromField, lastNameFromField, sexEntered, workLocationEntered,
                deductionRateEntered, hourlyWageEntered, hoursWorkedEntered, weeksWorkedEntered);
        mainjframe.theHash.addToBucket(employeeAdding);
        }
        catch (Exception m) {
        JOptionPane.showMessageDialog(this,"The employee that you are tryig to add already exists!");
        }
        MyHashTable.employeesToDisplay();
        MyHashTable.displayTableInfo(); 
    }//GEN-LAST:event_addemployeebutonActionPerformed

    private void cancelbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelbuttonActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelbuttonActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosed

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
            java.util.logging.Logger.getLogger(PartTimeEmployeeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PartTimeEmployeeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PartTimeEmployeeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PartTimeEmployeeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PartTimeEmployeeForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addemployeebuton;
    private javax.swing.JButton cancelbutton;
    private javax.swing.JTextField deductionratefield;
    private javax.swing.JTextField employeenumberfield;
    private javax.swing.JTextField firstnamefield;
    private javax.swing.JTextField hourlywagefield;
    private javax.swing.JTextField hoursworkedperweekfield;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField lastnamefield;
    private javax.swing.JTextField sexfield;
    private javax.swing.JTextField weeksworkedperyearfield;
    private javax.swing.JTextField worklocationfield;
    // End of variables declaration//GEN-END:variables
}
