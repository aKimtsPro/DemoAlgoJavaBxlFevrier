package poo.classes;

import java.time.LocalDate;

public class Personne {

    String nom;
    String prenom;
    LocalDate dateNaiss;

    public Personne(String nom, String prenom, LocalDate dateNaiss) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaiss = dateNaiss;
    }
}
