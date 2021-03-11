package poo.heritage;

import java.time.LocalDate;

public class Cadre extends Personne {

    private double salaireMensuel;

    public Cadre(String nom, String prenom, LocalDate dateNaiss, double salaireMensuel) {
        this.setNom( nom );
        this.setPrenom( prenom );
        this.setDateNaiss( dateNaiss );
        this.salaireMensuel = salaireMensuel;
    }

    @Override
    void sePresenter() {
        super.sePresenter();
        System.out.println("plus quelques trucs");
    }

    public double getSalaireMensuel() {
        return salaireMensuel;
    }

    public void setSalaireMensuel(double salaireMensuel) {
        this.salaireMensuel = salaireMensuel;
    }
}
