package poo.classes.exo.compet;

public class Compte {

    String nomProprietaire;
    private double solde = 0;

    public Compte(String nomProprietaire) {
        this.nomProprietaire = nomProprietaire;
    }

    public void retrait( double montant ){

        if( montant > 0 && montant <= solde ){
            solde -= montant;
        }

    }

    public void depot( double montant ){

        if( montant > 0 ){
            solde += montant;
        }
    
    }

    public double getSolde() {
        return solde;
    }

    private void setSolde(double solde) {
        this.solde = solde;
    }
}
