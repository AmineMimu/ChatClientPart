/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chat;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import javax.swing.JOptionPane;

/**
 * La classe de communication des utilisateurs authentifiés :
 * <li>L'utilisateur qui a accès est authentifié</li>
 * <li>L'utilisateur envoie et reçoit ses messages ici avec d'autres membres authentifiés</li>
 * <li>L'utilisateur peut rafraichir la liste des connectés</li>
 * @author anamwa
 */
public class InterfaceClient extends javax.swing.JFrame {
    
    static Socket socketClient;
    InputStreamReader streamMessage;
    BufferedReader donneeIn;
    
    /**
     * Constructeur de cette interface graphique.
     */
    public InterfaceClient() {
      initComponents();
      setLocationRelativeTo(null);
      setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        envoyer = new javax.swing.JButton();
        seDeconnecter = new javax.swing.JButton();
        envoiMessage = new javax.swing.JTextField();
        labelMessage = new javax.swing.JLabel();
        labelListeConnectes = new javax.swing.JLabel();
        actualiserConnectes = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        messageEnvoiReception = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listeConnectes = new javax.swing.JTextArea();
        menuPrincipale = new javax.swing.JMenuBar();
        fichier = new javax.swing.JMenu();
        edition = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        envoyer.setText("Envoyer");
        envoyer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                envoyerActionPerformed(evt);
            }
        });

        seDeconnecter.setText("Deconnecter");
        seDeconnecter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seDeconnecterActionPerformed(evt);
            }
        });

        envoiMessage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                envoiMessageActionPerformed(evt);
            }
        });

        labelMessage.setText("Message :");

        labelListeConnectes.setText("Liste des connectés :");

        actualiserConnectes.setText("Actualiser la liste des connectés");
        actualiserConnectes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualiserConnectesActionPerformed(evt);
            }
        });

        messageEnvoiReception.setEditable(false);
        messageEnvoiReception.setColumns(20);
        messageEnvoiReception.setRows(5);
        jScrollPane1.setViewportView(messageEnvoiReception);

        jLabel1.setText("Veuillez introduire le pseudo de votre destinataire");

        jLabel2.setText("succédé par \" : \" puis votre message, dans le champs Message");

        listeConnectes.setEditable(false);
        listeConnectes.setColumns(20);
        listeConnectes.setRows(5);
        jScrollPane2.setViewportView(listeConnectes);

        fichier.setText("Fichier");
        menuPrincipale.add(fichier);

        edition.setText("Edition");
        menuPrincipale.add(edition);

        setJMenuBar(menuPrincipale);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addComponent(labelListeConnectes))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(actualiserConnectes)))
                        .addGap(144, 144, 144))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(labelMessage)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(127, 127, 127)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2))
                    .addComponent(envoiMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(envoyer)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(seDeconnecter)
                .addGap(68, 68, 68))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelListeConnectes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(actualiserConnectes)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(envoiMessage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelMessage))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(envoyer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addComponent(seDeconnecter, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    //Bouton de déconnexion
    private void seDeconnecterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seDeconnecterActionPerformed
        // TODO add your handling code here:
        try {
            PrintWriter donneeOut = new PrintWriter(socketClient.getOutputStream());
            donneeOut.println("##deconnexion##");
            donneeOut.flush();  //l'envoi de la séquence de déco au serveur.
            JOptionPane.showMessageDialog(null, "Vous vous êtes bien déconnectés,\nHate de vous revoir une prochaine fois", "Déconnexion", JOptionPane.PLAIN_MESSAGE);
            setVisible(false);
            new Bienvenue();
        }catch(Exception e){
            System.out.println("Erreur déconnexion" + e.getMessage());
        }
    }//GEN-LAST:event_seDeconnecterActionPerformed
    
    //Bouton d'envoi des messages.
    private void envoyerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_envoyerActionPerformed
        // TODO add your handling code here:
        try {
            PrintWriter donneeOut = new PrintWriter(socketClient.getOutputStream());
            donneeOut.println(envoiMessage.getText());
            donneeOut.flush();
            String tabl[] = envoiMessage.getText().split(" : ");
            String msgg = "Vous : " + tabl[1];  //Pour afficher "Vous : " avant le message envoyé dans la TextArea.
            messageEnvoiReception.append(msgg + "\n");
            envoiMessage.setText("");
        } catch (Exception e) {
            System.out.println("Erreur d'envoi" + e.getMessage());
        }
    }//GEN-LAST:event_envoyerActionPerformed
    
    //Bouton d'actualisation des utilisateurs connectés
    private void actualiserConnectesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualiserConnectesActionPerformed
        // TODO add your handling code here:
        try {
            PrintWriter donneeOut = new PrintWriter(socketClient.getOutputStream());
            donneeOut.println("##actualiser##");
            donneeOut.flush();
        } catch (Exception e) {
            System.out.println("Erreur de rafraichissement" + e.getMessage());
        }
    }//GEN-LAST:event_actualiserConnectesActionPerformed

    private void envoiMessageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_envoiMessageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_envoiMessageActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualiserConnectes;
    private javax.swing.JMenu edition;
    private javax.swing.JTextField envoiMessage;
    private javax.swing.JButton envoyer;
    private javax.swing.JMenu fichier;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelListeConnectes;
    private javax.swing.JLabel labelMessage;
    public javax.swing.JTextArea listeConnectes;
    private javax.swing.JMenuBar menuPrincipale;
    public javax.swing.JTextArea messageEnvoiReception;
    private javax.swing.JButton seDeconnecter;
    // End of variables declaration//GEN-END:variables
}