/* 
 *  Copyright 2012 Samuel Taylor
 * 
 *  This file is part of darkFunction Editor
 *
 *  darkFunction Editor is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  darkFunction Editor is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.

 *  You should have received a copy of the GNU General Public License
 *  along with darkFunction Editor.  If not, see <http://www.gnu.org/licenses/>.
 */



/*
 * FeedbackDialog.java
 *
 * Created on Mar 27, 2012, 8:09:25 AM
 */
package dfEditor;

import com.DeskMetrics.DeskMetrics;

/**
 *
 * @author samtaylor
 */
public class FeedbackDialog extends javax.swing.JDialog {

    /** Creates new form FeedbackDialog */
    public FeedbackDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        feedbackField = new javax.swing.JTextPane();
        emailField = new javax.swing.JTextField();
        sendButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(dfEditor.dfEditorApp.class).getContext().getResourceMap(FeedbackDialog.class);
        setTitle(resourceMap.getString("Form.title")); // NOI18N
        setMinimumSize(new java.awt.Dimension(460, 280));
        setModalityType(java.awt.Dialog.ModalityType.APPLICATION_MODAL);
        setName("Form"); // NOI18N
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        feedbackField.setText(resourceMap.getString("feedbackField.text")); // NOI18N
        feedbackField.setName("feedbackField"); // NOI18N
        jScrollPane1.setViewportView(feedbackField);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 440, 200));

        emailField.setText(resourceMap.getString("emailField.text")); // NOI18N
        emailField.setName("emailField"); // NOI18N
        getContentPane().add(emailField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 340, 20));

        sendButton.setText(resourceMap.getString("sendButton.text")); // NOI18N
        sendButton.setName("sendButton"); // NOI18N
        sendButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendButtonActionPerformed(evt);
            }
        });
        getContentPane().add(sendButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, 90, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void sendButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendButtonActionPerformed
   
    DeskMetrics.getInstance().trackLog(emailField.getText() + " says: "+feedbackField.getText());
    
    this.dispose();
}//GEN-LAST:event_sendButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField emailField;
    private javax.swing.JTextPane feedbackField;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton sendButton;
    // End of variables declaration//GEN-END:variables
}
