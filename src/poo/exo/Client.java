package poo.exo;

import java.util.Random;

public class Client {

    private String prenom;
    private String nom;
    private String email;
    private String numero;
    private double solde;

    public Client(String prenom, String nom, String email) {
        this.prenom = prenom;
        this.nom = nom;
        this.email = email;

        String temp = "";
        for (int i = 0; i < 8 ; i++) {
            // trouver le nombre
            Random rdm = new Random();
            int random = 65 + rdm.nextInt(26);
            // le transformer en char
            char toAdd = (char)random;
            // l'ajouter à la chaine
            temp += toAdd;
        }
        numero = temp;
    }

    // METHODS

    public void recharger ( double montant ){

        if ( montant >= 0 ){
            setSolde( getSolde() + montant );
            System.out.println("Le solde a été augmenté ("+ getSolde()+")");
        }
        else {
            System.out.println("Montant invalide");
        }

    }

    public void acheter( Article toBuy ){

        if( solde >= toBuy.getPrix() ){
            System.out.println(prenom + " a bien acheté le produit ["+
                    toBuy.getMarque() + "-" + toBuy.getModele()+"] pour " + toBuy.getPrix()+"euros.");
            solde -= toBuy.getPrix();
        }
        else {
            System.out.println("solde insuffisant ("+solde+"euros)");
        }

    }

    void acheter( Article toBuy, int qtt ){

        int nbrAchete;
        for (nbrAchete = 0; nbrAchete < qtt && solde > toBuy.getPrix() ; nbrAchete++) {
            solde -= toBuy.getPrix();
        }

        if ( nbrAchete == qtt ) {
            System.out.println(prenom + " a acheté " + qtt +" produit(s) [" +
                    toBuy.getMarque() + "-" + toBuy.getModele()+"] pour " + (toBuy.getPrix()*qtt) +"euros.");
        }
        else if( nbrAchete != 0 ) {
            System.out.println(prenom +" n'a pas assez pour acheter "+ qtt +" produit(s).");
            System.out.println(prenom + " n'a acheté que " + nbrAchete +" produit(s) [" +
                    toBuy.getMarque() + "-" + toBuy.getModele()+"] pour " + (toBuy.getPrix()*nbrAchete) +"euros.");
        }
        else {
            System.out.println(prenom +" n'a pu acheter aucun article.");
        }

    }


    // GET/SET

    public String getPrenom() {
        return prenom;
    }

    private void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    private void setNom(String nom) {
        this.nom = nom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if ( email.length() >= 5 && email.length() <= 20 ) {
            this.email = email;
        }
    }

    public String getNumero() {
        return numero;
    }

    private void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSolde() {
        return solde;
    }

    private void setSolde(double solde) {
        this.solde = solde;
    }
}
