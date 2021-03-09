package poo.classes.exo.compet;

import java.time.LocalDate;

public class Sportif {

    private String nom;
    private String prenom;
    private LocalDate dateNaiss;

    public Sportif(String nom, String prenom, LocalDate dateNaiss) {
        this.setNom( nom );
        this.setPrenom( prenom );
        this.setDateNaiss( dateNaiss );
    }

    public String getPrenom(){
        return this.prenom;
    }

    public void setPrenom( String prenom ){
        if ( prenom.length() >= 5 ){
            this.prenom = prenom;
        }
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public LocalDate getDateNaiss() {
        return dateNaiss;
    }

    public void setDateNaiss(LocalDate dateNaiss) {
        this.dateNaiss = dateNaiss;
    }
}
