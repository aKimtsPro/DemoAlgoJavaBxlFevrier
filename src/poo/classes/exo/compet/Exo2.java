package poo.classes.exo.compet;

import java.time.LocalDate;

public class Exo2 {

    public static void main(String[] args) {

        Sportif s1 = new Sportif("dubois", "luc", LocalDate.of(2010, 10, 10));
        Sportif s2 = new Sportif("dubois", "marie", LocalDate.of(2010, 10, 10));
        Sportif s3 = new Sportif("dubois", "dominique", LocalDate.of(2010, 10, 10));
        Sportif s4 = new Sportif("dubois", "popol", LocalDate.of(2010, 10, 10));

        Competition c = new Competition();

        c.inscrire(s1);
        c.inscrire(s2);
        c.inscrire(s3);

        c.lancer();

        c.inscrire(s4);
        c.annuler(s4);

        c.lancer();

        System.out.println("or : " + c.podium.or.prenom);
        System.out.println("argent : " + c.podium.argent.prenom);
        System.out.println("bronze : " + c.podium.bronze.prenom);
    }

}
