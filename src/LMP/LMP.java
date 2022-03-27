/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package LMP;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 *
 * @author three
 */
public class LMP extends javax.swing.JFrame {

    /**
     * Creates new form LMP
     */
    public LMP() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLoanCalculatorButton1 = new javax.swing.JButton();
        jExitButton2 = new javax.swing.JButton();
        jGenerateReceiptButton3 = new javax.swing.JButton();
        jResetCalculatorButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jInsertAnnualInterestRate = new javax.swing.JTextField();
        jInsertNumberOfYears = new javax.swing.JTextField();
        jInsertLoanAmount = new javax.swing.JTextField();
        jMonthlyPayment = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextReceipt = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Loan Management Program");
        setPreferredSize(new java.awt.Dimension(1300, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel6.setBackground(new java.awt.Color(51, 204, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Loan Management Program");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 789, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(162, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                .addGap(25, 25, 25))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, -1, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLoanCalculatorButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLoanCalculatorButton1.setText("Loan Calculator");
        jLoanCalculatorButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLoanCalculatorButton1ActionPerformed(evt);
            }
        });

        jExitButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jExitButton2.setText("Exit");
        jExitButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jExitButton2ActionPerformed(evt);
            }
        });

        jGenerateReceiptButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jGenerateReceiptButton3.setText("Generate Receipt");
        jGenerateReceiptButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jGenerateReceiptButton3ActionPerformed(evt);
            }
        });

        jResetCalculatorButton4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jResetCalculatorButton4.setText("Reset Calculator");
        jResetCalculatorButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jResetCalculatorButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLoanCalculatorButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(jResetCalculatorButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addComponent(jGenerateReceiptButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82)
                .addComponent(jExitButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLoanCalculatorButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jResetCalculatorButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jGenerateReceiptButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jExitButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 550, 940, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Insert number of years: (ex: 5)");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Insert Loan Amount: (ex: 1000)");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Monthly payment:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Total Payment:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 450, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Insert Annual Interest Rate: (ex: 3.5) ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, -1));

        jInsertAnnualInterestRate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jInsertAnnualInterestRateActionPerformed(evt);
            }
        });
        jInsertAnnualInterestRate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jInsertAnnualInterestRateKeyTyped(evt);
            }
        });
        getContentPane().add(jInsertAnnualInterestRate, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 190, 170, 30));

        jInsertNumberOfYears.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jInsertNumberOfYearsKeyTyped(evt);
            }
        });
        getContentPane().add(jInsertNumberOfYears, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 252, 170, 30));

        jInsertLoanAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jInsertLoanAmountActionPerformed(evt);
            }
        });
        jInsertLoanAmount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jInsertLoanAmountKeyTyped(evt);
            }
        });
        getContentPane().add(jInsertLoanAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 312, 170, 30));

        jMonthlyPayment.setEditable(false);
        jMonthlyPayment.setBackground(new java.awt.Color(0, 204, 255));
        getContentPane().add(jMonthlyPayment, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 372, 170, 30));

        jTextField5.setEditable(false);
        jTextField5.setBackground(new java.awt.Color(0, 204, 255));
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 432, 170, 30));

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jTextReceipt.setEditable(false);
        jTextReceipt.setColumns(20);
        jTextReceipt.setRows(5);
        jScrollPane1.setViewportView(jTextReceipt);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 150, 520, 380));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jInsertAnnualInterestRateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jInsertAnnualInterestRateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jInsertAnnualInterestRateActionPerformed

    private void jInsertLoanAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jInsertLoanAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jInsertLoanAmountActionPerformed

    private void jResetCalculatorButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jResetCalculatorButton4ActionPerformed
        jInsertAnnualInterestRate.setText(null);
        jInsertNumberOfYears.setText(null);
        jInsertLoanAmount.setText(null);
        jMonthlyPayment.setText(null);
        jTextField5.setText(null);
        jTextReceipt.setText(null);
    }//GEN-LAST:event_jResetCalculatorButton4ActionPerformed

    private void jGenerateReceiptButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jGenerateReceiptButton3ActionPerformed

String annualInterestRate = String.format(jInsertAnnualInterestRate.getText());
String numberOfYears = String.format(jInsertNumberOfYears.getText());
String loanAmount = String.format(jInsertLoanAmount.getText());

String monthlyPayment = String.format(jMonthlyPayment.getText());
String totalPayment = String.format(jTextField5.getText());

//-------------------------------------------------------------------

int refs= 1325 + (int) (Math.random()*4238);

//-------------------------------------------------------------------

jTextReceipt.append("\tLoan Management Program\n" + 
"\n===========================================\t " +
"\nInterest rate:\t\t\t " + annualInterestRate +
"\nRepayment Years:\t\t " + numberOfYears +       
"\nAmount of Loan:\t\t " + "€"+ loanAmount +      
"\nMonthly Payment:\t\t " + monthlyPayment + 
"\nTotal Payment:\t\t\t " + totalPayment +
"\n\n\t\t \n" );
    }//GEN-LAST:event_jGenerateReceiptButton3ActionPerformed

    
    
private JFrame frame;
    private void jExitButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jExitButton2ActionPerformed

frame = new JFrame("Exit");
    if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit","Loan Management Program",
    JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION){
    System.exit(0);
    }
    }//GEN-LAST:event_jExitButton2ActionPerformed

    private void jLoanCalculatorButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLoanCalculatorButton1ActionPerformed
//-----------
double annulInterestRate = Double.parseDouble(jInsertAnnualInterestRate.getText());
double monthlyInterestRate = annulInterestRate / 1200;

int numberOfYears = Integer.parseInt(jInsertNumberOfYears.getText());
double loanAmount = Double.parseDouble(jInsertLoanAmount.getText());

//-----------

double monthlyPayment = loanAmount * monthlyInterestRate/(1-1 /Math.pow(1+ monthlyInterestRate,numberOfYears * 12));
String imonthlyPayment;
imonthlyPayment = Double.toString(monthlyPayment);
imonthlyPayment = String.format("€%.2f", monthlyPayment);
jMonthlyPayment.setText(imonthlyPayment);
//-----------
double totalPayment = monthlyPayment * numberOfYears * 12 ;
String itotalPayment;
itotalPayment = String.format("€%.2f", totalPayment);
jTextField5.setText(itotalPayment);

    }//GEN-LAST:event_jLoanCalculatorButton1ActionPerformed

    private void jInsertAnnualInterestRateKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jInsertAnnualInterestRateKeyTyped

    }//GEN-LAST:event_jInsertAnnualInterestRateKeyTyped

    private void jInsertNumberOfYearsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jInsertNumberOfYearsKeyTyped
           char c = evt.getKeyChar();
        if (!Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_jInsertNumberOfYearsKeyTyped

    private void jInsertLoanAmountKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jInsertLoanAmountKeyTyped
           char c = evt.getKeyChar();
        if (!Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_jInsertLoanAmountKeyTyped

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
            java.util.logging.Logger.getLogger(LMP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LMP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LMP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LMP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LMP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jExitButton2;
    private javax.swing.JButton jGenerateReceiptButton3;
    private javax.swing.JTextField jInsertAnnualInterestRate;
    private javax.swing.JTextField jInsertLoanAmount;
    private javax.swing.JTextField jInsertNumberOfYears;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton jLoanCalculatorButton1;
    private javax.swing.JTextField jMonthlyPayment;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton jResetCalculatorButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextArea jTextReceipt;
    // End of variables declaration//GEN-END:variables
}
