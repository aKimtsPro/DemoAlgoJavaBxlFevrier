package poo.classes.exo.instrument;

public class Exo3 {

    public static void main(String[] args) {

        Instrument instrument = new Instrument("yamaha", "trucbidule", 2);
        Musicien musicien = new Musicien("John", 3);

        musicien.jouer(instrument);

        instrument.setProprietaire( musicien );

        musicien.jouer(instrument);

        System.out.println( instrument );
        System.out.println(instrument.getMarque());
        System.out.println(instrument.getModele());
        System.out.println(instrument.getExpRequise());
        System.out.println(instrument.getProprietaire());
        System.out.println("---------------------------");
        System.out.println( musicien );
        System.out.println(musicien.getPrenom());
        System.out.println(musicien.getExperience());

    }

}
