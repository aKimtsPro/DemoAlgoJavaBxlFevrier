package poo.classes.exo.compet;

import java.time.LocalDate;

public class ProblemeEncaps {

    public static void main(String[] args) {

        Competition c = new Competition();
        System.out.println( c.isFinished() );

        c.lancer();

        System.out.println( c.isFinished() );



        Sportif s = new Sportif("dubois", "luc", LocalDate.now());
        System.out.println( s.getPrenom() );
        s.setPrenom( "Luc" );
        System.out.println( s.getPrenom() );

    }
}
