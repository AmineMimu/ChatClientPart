/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chat;

/**
 * <ul>Classe main du côté client. Propose :
 * <ul>l'accès à 3 interface :
 * <li>L'interface graphique pour l'inscription</li>
 * <li>L'interface graphique pour accès visiteur</li>
 * <li>L'interface graphinque pour l'accès authentifié</li>
 * </ul></ul>
 * @author anamwa
 */
public class Bienvenue extends javax.swing.JFrame {

    /**
     * Crée le formulaire d'accueil.
     */
    public Bienvenue() {
        initComponents();
        setLocationRelativeTo(null);
        setVisible(true);        
    }
    
    /**
     * Le main du côté client pour instancier l'interface Bienvenue.
     * @param args 
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
            java.util.logging.Logger.getLogger(InterfaceClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>        
        new Bienvenue();
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        visitorAccess = new javax.swing.JButton();
        seConnecter = new javax.swing.JButton();
        subscribe = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuFile = new javax.swing.JMenu();
        menuEdition = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        visitorAccess.setText("Accès visiteur");
        visitorAccess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visitorAccessActionPerformed(evt);
            }
        });

        seConnecter.setText("Se Connecter");
        seConnecter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seConnecterActionPerformed(evt);
            }
        });

        subscribe.setText("S'inscrire");
        subscribe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subscribeActionPerformed(evt);
            }
        });

        jLabel1.setText("Bienvenue sur l'application de Chat");

        menuFile.setText("Fichier");
        jMenuBar1.add(menuFile);

        menuEdition.setText("Edition");
        jMenuBar1.add(menuEdition);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addComponent(visitorAccess)
                .addGap(131, 131, 131)
                .addComponent(seConnecter)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 131, Short.MAX_VALUE)
                .addComponent(subscribe)
                .addGap(161, 161, 161))
            .addGroup(layout.createSequentialGroup()
                .addGap(305, 305, 305)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 217, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(visitorAccess)
                    .addComponent(seConnecter)
                    .addComponent(subscribe))
                .addGap(211, 211, 211))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //Bouton pour accès visiteur.
    private void visitorAccessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visitorAccessActionPerformed
        // TODO add your handling code here:
        new VisitorInterface();
        setVisible(false);
    }//GEN-LAST:event_visitorAccessActionPerformed
    
    //Bouton pour accès authentifié.
    private void seConnecterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seConnecterActionPerformed
        // TODO add your handling code here:
        new Connexion();
        setVisible(false);
    }//GEN-LAST:event_seConnecterActionPerformed
    
    //Bouton pour le formulaire d'inscription.
    private void subscribeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subscribeActionPerformed
        // TODO add your handling code here:
        new Subscribe();
        setVisible(false);
    }//GEN-LAST:event_subscribeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu menuEdition;
    private javax.swing.JMenu menuFile;
    private javax.swing.JButton seConnecter;
    private javax.swing.JButton subscribe;
    private javax.swing.JButton visitorAccess;
    // End of variables declaration//GEN-END:variables
}
