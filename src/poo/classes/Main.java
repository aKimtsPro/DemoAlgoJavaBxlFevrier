package poo.classes;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Personne popol = new Personne("dubois", "popol", LocalDate.now());
        Personne bernadette = new Personne("dubois", "bernadette", LocalDate.now());

        Animal animal = new Animal("rex", "chien", LocalDate.now(), popol );
        Animal animal2 = new Animal("ratanplan", "chien", LocalDate.now(), bernadette);

        System.out.println( animal.nom );
        System.out.println( animal.espece );
        System.out.println( animal.dateNaiss );
        System.out.println( animal.maitre.nom );

        System.out.println( animal2.nom );
        System.out.println( animal2.espece );
        System.out.println( animal2.dateNaiss );
        System.out.println( animal2.maitre.nom );

        animal.seDeplacer();
        animal2.manger();


    }
}
