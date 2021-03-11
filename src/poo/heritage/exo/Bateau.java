package poo.heritage.exo;

public class Bateau extends Vehicule {

    private int superficie;

    public Bateau(String marque, String modele, int superficie) {
        super(marque, modele);
        this.setSuperficie( superficie );
    }

    public int getSuperficie() {
        return superficie;
    }

    public void setSuperficie(int superficie) {
        if (superficie >= 0) {
            this.superficie = superficie;
        }
    }
}
