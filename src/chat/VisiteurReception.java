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
 * La classe qui génère le Thread qui s'occupe de la reception des flux entrants des visiteurs.
 * <li>Reçoie la séquence du serveur et l'analyse</li>
 * <li>Si séquence pour déconnexion, éxecute la déco</li>
 * <li>Sinon la séquence est déstinée à l'utilisateur, et va être affichée sur la TextArea de reception de message sur son interface graphique</li>
 * @author anamwa
 */
public class VisiteurReception extends Thread {
    
    Socket socketUtilisateurReception = null ;
    BufferedReader donneeIn = null;
    InputStreamReader streamMessage = null;
    String connecter = null;
    
    /**
     * Constructeur du Thread.
     * @param socketReception Même socket de l'utilisateur va être utilisé
     */
    public VisiteurReception(Socket socketReception){        
        socketUtilisateurReception = socketReception;
    }
    
    /**
     * Méthode "run" qui éxecute le code de reception pour chaque Thread d'utilisateur visiteur
     */
    @Override
    public void run (){
        Salon objet = new Salon();
        
        while(true){
            try {   //Reception de la séquence
                streamMessage = new InputStreamReader(socketUtilisateurReception.getInputStream());
                donneeIn = new BufferedReader(streamMessage);
                connecter = donneeIn.readLine();
                String str[] = connecter.split(" : ");
                
                if (connecter.compareTo("##deconnexion##")==0) { //Si le flux implique une déconnexion, on arrête le Thread de réception
                    UtilisateurReception.currentThread().stop();
                    
                }else{    //Si le flux est destiné pour un utilisateur
                    
                    if (!str[0].equals(VisitorInterface.pseudoVisitor)){
                        objet.salonEnvoiReception.append(connecter + "\n"); 
                    }
                }
            } catch (Exception e) {
                System.out.println("Erreur Thread reception" + e.getMessage());
            }
        }
    }
}
