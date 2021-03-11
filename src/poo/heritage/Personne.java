package poo.heritage;

import java.time.LocalDate;

public class Personne {

    private String nom;
    private String prenom;
    private LocalDate dateNaiss;

    public Personne() {}

    public Personne(String nom, String prenom, LocalDate dateNaiss) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaiss = dateNaiss;
    }

    void sePresenter(){

        System.out.println("Personne :");
        System.out.println(" - nom : " + nom);
        System.out.println(" - prenom : " + prenom);
        System.out.println(" - date de naissance : " + dateNaiss);

    }

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

    public LocalDate getDateNaiss() {
        return dateNaiss;
    }

    public void setDateNaiss(LocalDate dateNaiss) {
        this.dateNaiss = dateNaiss;
    }
}
