package poo.heritage.exo;

public class VehiculeARoue extends Vehicule {

    private int nbrKmParcouru;

    public VehiculeARoue(String marque, String modele, int nbrKmParcouru) {
        super(marque, modele);
        this.nbrKmParcouru = nbrKmParcouru;
    }

    public void seDeplacer(int kmParcouru){
        System.out.println("Le vehicule ("+ getMarque() +"/"+ getModele() +") se déplace de "+ kmParcouru +"km.");
    }

    public int getNbrKmParcouru() {
        return nbrKmParcouru;
    }

    public void setNbrKmParcouru(int nbrKmParcouru) {
        if (nbrKmParcouru >= 0) {
            this.nbrKmParcouru = nbrKmParcouru;
        }
    }
}
