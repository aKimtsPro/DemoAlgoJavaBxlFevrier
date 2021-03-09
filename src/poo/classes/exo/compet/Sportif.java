package poo.classes.exo.compet;

import java.time.LocalDate;

public class Sportif {

    String nom;
    String prenom;
    LocalDate dateNaiss;

    public Sportif(String nom, String prenom, LocalDate dateNaiss) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaiss = dateNaiss;
    }

}
