package poo.polymorphism;

import java.util.ArrayList;

public class Personne {

    private String nom;
    private String prenom;

    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    // METHODS

    // 1 - la classe qui defini la methode
    // 2 - le nom de la methode
    // 3 - le type et l'ordre des paramètres

    // Personne - sePresenter - ()
    // Personne - sePresenter - (String)
    // Personne - sePresenter - (String, int)
    // Personne - sePresenter - (int, String)


    public void sePresenter(){
        System.out.println( this.prenom +" "+ this.nom );
    }

    public void sePresenter( String prefix ){
        System.out.println( prefix +" "+ this.prenom +" "+ this.nom );
    }

    public void sePresenter( String prefix, int nbrExclamation ){
        System.out.print( prefix +" "+ this.prenom +" "+ this.nom );
        for (int i = 0; i < nbrExclamation; i++) {
            System.out.print("!");
        }
        System.out.println();
    }

    public void sePresenter( int repeat, String prefix ){
        for (int i = 0; i < repeat; i++) {
            sePresenter(prefix);
        }
    }

    // GET/SET

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
}
