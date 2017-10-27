/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chat;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * La classe qui génère le Thread qui s'occupe de la reception des flux entrants pour les utilisateurs authentifiés.
 * <li>Reçoie la séquence du serveur et l'analyse</li>
 * <li>Si la séquence est pour actualiser, éxecute l'actualisation</li>
 * <li>Si séquence pour déconnexion, éxecute la déco</li>
 * <li>Sinon la séquence est déstinée à l'utilisateur, et va être affichée sur la TextArea de reception de message sur son interface graphique</li>
 * @author anamwa
 */
public class UtilisateurReception extends Thread {
    
    Socket socketUtilisateurReception = null ;
    BufferedReader donneeIn = null;
    InputStreamReader streamMessage = null;
    String connecter = null;
    
    /**
     * Constructeur du Thread.
     * @param socketReception Le même socket de l'utilisateur authentifié va être utilisé 
     */
    public UtilisateurReception(Socket socketReception){        
        socketUtilisateurReception = socketReception;
    }    
    
    /**
     * Méthode "run" qui éxecute le code de reception pour chaque Thread d'utilisateur authentifié
     */
    @Override
    public void run (){
        InterfaceClient objt = new InterfaceClient();
        
        while(true){
            try {   //Reçoie la séquence
                streamMessage = new InputStreamReader(socketUtilisateurReception.getInputStream());
                donneeIn = new BufferedReader(streamMessage);
                connecter = donneeIn.readLine();
                String tabla[] = connecter.split("##actualiser##");
                if (tabla[0].compareTo("") == 0) {  //Si le flux entrant est destiné pour l'actualisation
                    String aenvoyer = tabla[1].replace(",", "\n");
                    objt.listeConnectes.setText("");
                    objt.listeConnectes.append(aenvoyer + "\n");
                    
                } else if (connecter.compareTo("##deconnexion##")==0) { //Si le flux implique une déconnexion, on arrête le Thread de réception
                    UtilisateurReception.currentThread().stop();
                    
                }else{    //Si le flux est destiné pour un utilisateur
                    objt.messageEnvoiReception.append(connecter + "\n");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
