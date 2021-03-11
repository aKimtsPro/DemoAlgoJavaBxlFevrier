package poo.heritage.exo;

public class Moto extends VehiculeARoue {

    private String couleur;

    public Moto(String marque, String modele, int nbrKmParcouru, String couleur) {
        super(marque, modele, nbrKmParcouru);
        this.couleur = couleur;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }
}
