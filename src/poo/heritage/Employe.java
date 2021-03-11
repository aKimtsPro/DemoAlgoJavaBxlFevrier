package poo.heritage;

import java.time.LocalDate;

public class Employe extends Personne {

    private double salaireALHeure;
    private int heureParSemaine;

    public Employe(String nom, String prenom, LocalDate dateNaiss, double salaireALHeure, int heureParSemaine) {
        this.setNom( nom );
        this.setPrenom( prenom );
        this.setDateNaiss( dateNaiss );
        this.salaireALHeure = salaireALHeure;
        this.heureParSemaine = heureParSemaine;
    }



    public double getSalaireALHeure() {
        return salaireALHeure;
    }

    public void setSalaireALHeure(double salaireALHeure) {
        this.salaireALHeure = salaireALHeure;
    }

    public int getHeureParSemaine() {
        return heureParSemaine;
    }

    public void setHeureParSemaine(int heureParSemaine) {
        this.heureParSemaine = heureParSemaine;
    }
}
