package poo.heritage.exo;

import java.util.ArrayList;

public class ExoHeritage {

    public static void main(String[] args) {

        ArrayList<Vehicule> list = new ArrayList<>();

        Vehicule toAdd = new Vehicule("boing", "qui vole");
        list.add( toAdd );

        toAdd = new Bateau("Flot", "Bloop", 100);
        list.add( toAdd );

        toAdd = new VehiculeARoue("Roule", "MaPool", 0);
        list.add( toAdd );

        toAdd = new Voiture("Bis", 0, 3);
        list.add( toAdd );

        toAdd = new Moto("BiRoue", "a2-roue", 0, "rouge");
        list.add( toAdd );

        for (Vehicule vehicule : list) {
            vehicule.seDeplacer();
        }



    }

}
