package poo.heritage;

import java.time.LocalDate;

public class CFO extends Cadre{

    private String email;

    public CFO(String nom, String prenom, LocalDate dateNaiss, double salaireMensuel, String email) {
        super(nom, prenom, dateNaiss, salaireMensuel);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
