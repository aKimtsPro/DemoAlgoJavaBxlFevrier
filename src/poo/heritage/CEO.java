package poo.heritage;

import java.time.LocalDate;

public class CEO extends Cadre {

    private String couleurPref;

    public CEO(String nom, String prenom, LocalDate dateNaiss, double salaireMensuel, String couleurPref) {
        super(nom, prenom, dateNaiss, salaireMensuel);
        this.couleurPref = couleurPref;
    }

    public String getCouleurPref() {
        return couleurPref;
    }

    public void setCouleurPref(String couleurPref) {
        this.couleurPref = couleurPref;
    }
}
