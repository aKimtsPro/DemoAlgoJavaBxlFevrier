package poo.heritage;

import java.util.ArrayList;
import java.util.Scanner;

public class DemoHeritage {

    public static void main(String[] args) {

        // specific -> general
        CEO ceo = new CEO("", "", null, 0, "");
        CFO cfo = new CFO("", "", null, 0, "");
        Cadre cadre = ceo;
        Personne pers = ceo;
        Employe employe = new Employe("", "", null, 0, 0);

        // avantage de l'heritage
        ArrayList<Personne> list = new ArrayList<>();
        list.add(pers);
        list.add(cadre);
        list.add(ceo);
        list.add(cfo);
        list.add(employe);

        // general -> specific
        if( pers instanceof CEO ){
            ceo = (CEO) pers;
        }
        else {
            System.out.println("transtypage impossible");
        }

        // Les Objects

        Object o = new Object();



    }

}
