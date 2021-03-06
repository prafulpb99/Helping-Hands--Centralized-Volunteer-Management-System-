/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.FoodSupplierRole;
import Mail.SendMail;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.MessagingException;
import javax.swing.JPanel;
import userinterface.ClothesSupplierRole.ClothesSupplierWorkAreaJPanel;
import userinterface.FoodConsumerWorkRole.FoodRequestJPanel;
import userinterface.FoodSupplierRole.FoodSupplierWorkAreaJPanel;

/**
 *
 * @author Praful
 */
public class MailRequestJPanel extends javax.swing.JPanel {
     private JPanel userProcessContainer;
    private static String emailMsgTxt = "";
private static String emailSubjectTxt = "";
private static String emailFromAddress = "";
// Add List of Email address to who email needs to be sent to
private static String[] emailList = new String[10];


    /**
     * Creates new form MailRequestJPanel
     */
    public MailRequestJPanel(JPanel userProcessContainer) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        mailtoTxt = new javax.swing.JTextField();
        mailBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtarea_message = new javax.swing.JTextField();
        txtsubject = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        mailLbl = new javax.swing.JLabel();
        BackJButton = new javax.swing.JToggleButton();

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        mailtoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mailtoTxtActionPerformed(evt);
            }
        });

        mailBtn.setText("Send mail to Supplier");
        mailBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mailBtnActionPerformed(evt);
            }
        });

        jLabel4.setText("Subject:");

        txtarea_message.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtarea_messageActionPerformed(evt);
            }
        });

        jLabel5.setText("Message:");

        mailLbl.setText("Mail to:");

        BackJButton.setText("Back");
        BackJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(BackJButton)
                        .addGap(141, 141, 141)
                        .addComponent(mailBtn))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jLabel5)
                        .addGap(39, 39, 39)
                        .addComponent(txtarea_message, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(349, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(82, 82, 82)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(mailLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(26, 26, 26)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(mailtoTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 475, Short.MAX_VALUE)
                        .addComponent(txtsubject, javax.swing.GroupLayout.DEFAULT_SIZE, 475, Short.MAX_VALUE))
                    .addContainerGap(347, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtarea_message, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BackJButton)
                    .addComponent(mailBtn))
                .addGap(301, 301, 301))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(68, 68, 68)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(mailtoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(mailLbl))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtsubject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4))
                    .addContainerGap(505, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void mailtoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mailtoTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mailtoTxtActionPerformed

    private void mailBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mailBtnActionPerformed
        /*MailApp app = new MailApp();
        if(evt.getSource()==mailBtn)
        {
            String to = mailTxt.getText();
            String subject = subjectTxt.getText();
            String message = msgTxt.getText();

            String user = "chimerateamaed@gmail.com";
            String pass = "Chimera777";

            SendMail.send(to,subject, message, user, pass);
        }
        */

        emailMsgTxt = txtarea_message.getText();
        emailSubjectTxt = txtsubject.getText();
        emailFromAddress = SendMail.SMTP_AUTH_USER;

        // Add List of Email address to who email needs to be sent to
        StringBuffer sb = new StringBuffer(mailtoTxt.getText());
        StringTokenizer st = new StringTokenizer(mailtoTxt.getText());
        int i = 0;
        while (st.hasMoreTokens()) {
            emailList[i] = st.nextToken(",");
            System.err.println(emailList[i]);
            i++;
        }
        String emailReceipeint[] = new String[i];
        for (int j = 0; j < i; j++) {
            emailReceipeint[j] = emailList[j];
            System.out.println("Actually emails are " + j);
        }

        SendMail smtpMailSender = new SendMail();

        try {
            smtpMailSender.postMail(emailReceipeint, emailSubjectTxt, emailMsgTxt, emailFromAddress);
        } catch (MessagingException ex) {
            Logger.getLogger(FoodRequestJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }

        //System.out.println("Sucessfully Sent mail to All Users");
    }//GEN-LAST:event_mailBtnActionPerformed

    private void txtarea_messageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtarea_messageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtarea_messageActionPerformed

    private void BackJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackJButtonActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 2];
        FoodSupplierWorkAreaJPanel dwjp = (FoodSupplierWorkAreaJPanel) component;
        dwjp.populateTable();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);// TODO add your handling code here:
    }//GEN-LAST:event_BackJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton BackJButton;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton mailBtn;
    private javax.swing.JLabel mailLbl;
    private javax.swing.JTextField mailtoTxt;
    private javax.swing.JTextField txtarea_message;
    private javax.swing.JTextField txtsubject;
    // End of variables declaration//GEN-END:variables
}
