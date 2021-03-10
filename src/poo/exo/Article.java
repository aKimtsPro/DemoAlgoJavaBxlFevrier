package poo.exo;

public class Article {

    private String marque;
    private String modele;
    private double prix;

    public Article(String marque, String modele, double prix) {
        this.marque = marque;
        this.modele = modele;
        this.setPrix( prix );
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        if( prix >= 0 ){
            this.prix = prix;
        }
    }
}
