package poo.classes.exo.instrument;

public class Instrument {

    private String marque;
    private String modele;
    private Musicien proprietaire;
    private int expRequise;

    public Instrument(String marque, String modele, int expRequise) {
        this.setMarque(marque);
        this.setModele(modele);
        this.setExpRequise(expRequise);
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        if( marque.length() >= 5 && marque.length() <= 10 ){
            this.marque = marque;
        }
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        if( modele.length() >= 5 && modele.length() <= 10 ) {
            this.modele = modele;
        }
    }

    public Musicien getProprietaire() {
        return proprietaire;
    }

    public void setProprietaire(Musicien proprietaire) {
        if ( proprietaire.getExperience() >= expRequise ){
            this.proprietaire = proprietaire;
        }
    }

    public int getExpRequise() {
        return expRequise;
    }

    private void setExpRequise(int expRequise) {
        if( expRequise >= 0 ){
            this.expRequise = expRequise;
        }
    }
}
