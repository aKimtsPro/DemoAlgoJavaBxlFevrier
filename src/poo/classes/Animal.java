package poo.classes;

import java.time.LocalDate;
import java.time.Period;

public class Animal {

    String nom;
    String espece;
    LocalDate dateNaiss;
    Personne maitre;

    public Animal(String nom, String espece, LocalDate dateNaiss, Personne maitre) {
        this.nom = nom;
        this.espece = espece;
        this.dateNaiss = dateNaiss;
        this.maitre = maitre;
    }

    void manger(){
        System.out.println(this.maitre.nom + " donne a manger à "+ this.nom);
    }

    void seDeplacer(){
        System.out.println( this.nom + " se deplace" );
    }

}
