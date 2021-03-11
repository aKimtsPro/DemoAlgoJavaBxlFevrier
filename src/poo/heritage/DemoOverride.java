package poo.heritage;

import java.time.LocalDate;

public class DemoOverride {

    public static void main(String[] args) {

        Personne p = new Personne("dubois", "luc", LocalDate.now() );
        p.sePresenter();

        Employe e = new Employe("generic", "marie", LocalDate.of(2010,2,10), 25, 38);
        e.sePresenter();

        p = e;
        p.sePresenter();


    }
}
