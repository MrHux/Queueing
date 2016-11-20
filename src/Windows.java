
import Queueing.OperationFileAttente;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.script.*;
import javax.swing.JComboBox;
import javax.swing.JTextField;

/*
 * Copyright (C) 2016 hux
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
/**
 *
 * @author hux
 */
public class Windows extends javax.swing.JFrame {

    /**
     * Creates new form Windows
     */
    public Windows() {
        initComponents();
        //le premier type de liste est MM1 par défaut
        //donc on masque les champs non nécéssaire
        jLabelNbClient.setVisible(false);
        jLabelNbServeur.setVisible(false);
        varNbClient.setVisible(false);
        varNbServer.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTypeFile = new javax.swing.JLabel();
        varTypeFile = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        content = new javax.swing.JTextPane();
        jLabelResult = new javax.swing.JLabel();
        jLabelLambda = new javax.swing.JLabel();
        jLabelMu = new javax.swing.JLabel();
        jLabelNbClient = new javax.swing.JLabel();
        jLabelNbServeur = new javax.swing.JLabel();
        varNbServer = new javax.swing.JTextField();
        varNbClient = new javax.swing.JTextField();
        varMu = new javax.swing.JTextField();
        varLambda = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        varEtat = new javax.swing.JTextField();
        jLabelEtat = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        varTemps = new javax.swing.JTextField();
        jLabelInstant = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hux : Calculateur de probabilités sur les files d'attentes : v1.0");
        setMinimumSize(new java.awt.Dimension(708, 450));

        jLabelTypeFile.setText("Choix du type de file d'attente :");

        varTypeFile.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MM1", "MM1K", "MMS" }));
        varTypeFile.setToolTipText("");
        varTypeFile.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                varTypeFileItemStateChanged(evt);
            }
        });
        varTypeFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                select(evt);
            }
        });

        content.setEditable(false);
        jScrollPane1.setViewportView(content);

        jLabelResult.setText("Résultat :");

        jLabelLambda.setText("Lambda :");

        jLabelMu.setText("Mu :");

        jLabelNbClient.setText("Nombre de client max :");

        jLabelNbServeur.setText("Nombre de serveur max :");

        varNbServer.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                varNbServerInputMethodTextChanged(evt);
            }
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        varNbServer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                varNbServerActionPerformed(evt);
            }
        });

        varNbClient.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                varNbClientInputMethodTextChanged(evt);
            }
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
        });

        varMu.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                varMuInputMethodTextChanged(evt);
            }
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        varMu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                varMuActionPerformed(evt);
            }
        });

        varLambda.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                varLambdaInputMethodTextChanged(evt);
            }
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
        });

        jButton1.setText("Soumettre");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        varEtat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                varEtatActionPerformed(evt);
            }
        });

        jLabelEtat.setText("<html>Etat pour le calcule de probabilité <br> en régime stationnaire :<html>");
        jLabelEtat.setToolTipText("");

        jButton2.setText("Réinitialiser");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabelInstant.setText("Instant t, pour le calcul de proba P(T>t)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelTypeFile)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(varTypeFile, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 367, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabelNbClient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabelNbServeur, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(varNbServer, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(varNbClient, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabelLambda)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(varLambda))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabelMu)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(varMu, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabelEtat, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabelResult))
                                .addComponent(varEtat)
                                .addComponent(varTemps))
                            .addComponent(jLabelInstant))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTypeFile, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(varTypeFile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabelResult)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(varLambda, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelLambda))
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelMu)
                            .addComponent(varMu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelNbClient)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(varNbClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelNbServeur)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(varNbServer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelEtat, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(varEtat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelInstant)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(varTemps, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void varNbServerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_varNbServerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_varNbServerActionPerformed

    private void varMuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_varMuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_varMuActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String sAffichage = "";
        sTypeFile = (String) varTypeFile.getSelectedItem();
        try {
            dLambda = Double.parseDouble(varLambda.getText());
        } catch (NumberFormatException e) {
            try {
                ScriptEngineManager mgr = new ScriptEngineManager();
                ScriptEngine engine = mgr.getEngineByName("JavaScript");
                System.out.println(engine.eval(varLambda.getText()));
                dLambda = (double) engine.eval(varLambda.getText());
            } catch (ScriptException ex) {
                Logger.getLogger(Windows.class.getName()).log(Level.SEVERE, "Erreur script", ex);
                content.setText("Attention le paramètre Lambda est incorecte !");
            }
        }
        try {
            dMu = Double.parseDouble(varMu.getText());
        } catch (NumberFormatException e) {
            content.setText("Attention le paramètre Mu est incorecte !");
        }
        try {
            iNbServer = Integer.parseInt(varNbServer.getText());
        } catch (NumberFormatException e) {
            if (!"MM1".equals(sTypeFile) && !"MM1K".equals(sTypeFile)) {
                content.setText("Attention le paramètre nombre de serveur est incorecte !");
            }
        }
        try {
            if (!"MM1".equals(sTypeFile)) {
                iNbClient = Integer.parseInt(varNbClient.getText());
            }
        } catch (NumberFormatException e) {
            content.setText("Attention le paramètre nombre de client est incorecte !");
        }
        try {
            iEtat = Integer.parseInt(varEtat.getText());
        } catch (NumberFormatException e) {
            content.setText("Attention le paramètre Etat est incorecte !");
        }
        try {
            dT = Double.parseDouble(varTemps.getText());
        } catch (NumberFormatException e) {
            try {
                ScriptEngineManager mgr = new ScriptEngineManager();
                ScriptEngine engine = mgr.getEngineByName("JavaScript");
                System.out.println(engine.eval(varTemps.getText()));
                dT = (double) engine.eval(varTemps.getText());
            } catch (ScriptException ex) {
                Logger.getLogger(Windows.class.getName()).log(Level.SEVERE, "Erreur script", ex);
                content.setText("Attention le paramètre Instant \'t\' est incorecte !");
            }
        }

        if (sTypeFile != null && !"".equals(sTypeFile) && dLambda != 0.0 && dMu != 0.0 && ((iNbServer != 0 && iNbClient != 0 && "MMS".equals(sTypeFile)) || (iNbClient != 0 && "MM1K".equals(sTypeFile)) || "MM1".equals(sTypeFile))) {
            sAffichage = content.getText();
            sAffichage += "\n" + OperationFileAttente.calcul(iNbServer, iNbClient, dMu, dLambda, sTypeFile, iEtat, dT);

            content.setText(sAffichage);
        } else {
            content.setText("Attention tout les paramètres ne sont pas renseigné !");
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void varTypeFileItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_varTypeFileItemStateChanged
        JComboBox cb = (JComboBox) evt.getSource();
        sTypeFile = (String) cb.getSelectedItem();
    }//GEN-LAST:event_varTypeFileItemStateChanged

    private void varLambdaInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_varLambdaInputMethodTextChanged
        JTextField jt = (JTextField) evt.getSource();
        try {
            dLambda = Double.parseDouble(jt.getText());
        } catch (NumberFormatException e) {

        }
    }//GEN-LAST:event_varLambdaInputMethodTextChanged

    private void varMuInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_varMuInputMethodTextChanged
        JTextField jt = (JTextField) evt.getSource();
        try {
            dMu = Double.parseDouble(jt.getText());

        } catch (NumberFormatException e) {

        }
    }//GEN-LAST:event_varMuInputMethodTextChanged

    private void varNbClientInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_varNbClientInputMethodTextChanged
        JTextField jt = (JTextField) evt.getSource();
        try {
            iNbClient = Integer.parseInt(jt.getText());
        } catch (NumberFormatException e) {

        }
    }//GEN-LAST:event_varNbClientInputMethodTextChanged

    private void varNbServerInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_varNbServerInputMethodTextChanged
        JTextField jt = (JTextField) evt.getSource();
        try {
            iNbServer = Integer.parseInt(jt.getText());
        } catch (NumberFormatException e) {

        }
    }//GEN-LAST:event_varNbServerInputMethodTextChanged

    private void varEtatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_varEtatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_varEtatActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        varEtat.setText("");
        varLambda.setText("");
        varMu.setText("");
        varNbClient.setText("");
        varNbServer.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void select(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_select
        if (((String) varTypeFile.getSelectedItem()).equals("MM1")) {
            jLabelNbClient.setVisible(false);
            jLabelNbServeur.setVisible(false);
            varNbClient.setVisible(false);
            varNbServer.setVisible(false);
        } else if (((String) varTypeFile.getSelectedItem()).equals("MM1K")) {
            jLabelNbClient.setVisible(true);
            jLabelNbServeur.setVisible(false);
            varNbClient.setVisible(true);
            varNbServer.setVisible(false);
        } else if (((String) varTypeFile.getSelectedItem()).equals("MMS")) {
            jLabelNbClient.setVisible(true);
            jLabelNbServeur.setVisible(true);
            varNbClient.setVisible(true);
            varNbServer.setVisible(true);
        }

    }//GEN-LAST:event_select

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
            java.util.logging.Logger.getLogger(Windows.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Windows.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Windows.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Windows.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Windows().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextPane content;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabelEtat;
    private javax.swing.JLabel jLabelInstant;
    private javax.swing.JLabel jLabelLambda;
    private javax.swing.JLabel jLabelMu;
    private javax.swing.JLabel jLabelNbClient;
    private javax.swing.JLabel jLabelNbServeur;
    private javax.swing.JLabel jLabelResult;
    private javax.swing.JLabel jLabelTypeFile;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField varEtat;
    private javax.swing.JTextField varLambda;
    private javax.swing.JTextField varMu;
    private javax.swing.JTextField varNbClient;
    private javax.swing.JTextField varNbServer;
    private javax.swing.JTextField varTemps;
    private javax.swing.JComboBox<String> varTypeFile;
    // End of variables declaration//GEN-END:variables
    double dMu = 0.0;
    double dLambda = 0.0;
    int iNbServer = 0;
    int iNbClient = 0;
    int iEtat = 0;
    double dT = 0.0;
    String sTypeFile = "";
}
