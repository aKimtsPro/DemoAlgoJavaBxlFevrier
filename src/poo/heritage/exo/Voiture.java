package poo.heritage.exo;

public class Voiture extends VehiculeARoue {

    private int nbrPorte;

    public Voiture(String marque, String modele, int nbrKmParcouru, int nbrPorte) {
        super(marque, modele, nbrKmParcouru);
        this.nbrPorte = nbrPorte;
    }

    public Voiture(String modele, int nbrKmParcouru, int nbrPorte){
        super("VrimVroom", modele, nbrKmParcouru);
        this.nbrPorte = nbrPorte;
    }

    public int getNbrPorte() {
        return nbrPorte;
    }

    public void setNbrPorte(int nbrPorte) {
        if( nbrPorte >= 0 ) {
            this.nbrPorte = nbrPorte;
        }
    }
}
