package poo.polymorphism;

public class Cheval {

    private String nom;

    public Cheval(String nom) {
        this.nom = nom;
    }

    // METHODS

    public void sePresenter(){
        System.out.println( this.nom );
    }

    // GET/SET

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
