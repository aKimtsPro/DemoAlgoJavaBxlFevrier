package poo.polymorphism.exo;

public class Personne {

    private String nom;

    public Personne(String nom) {
        this.nom = nom;
    }

    // METHODS

    public void saluer(){
        System.out.println("Salut !");
    }

    public void saluer(Personne aSaluer){
        System.out.println("Salut " + aSaluer.getNom() + "!");
    }

    public void saluer(int repetition){
        for (int i = 0; i < repetition; i++) {
            saluer();
        }
    }

    public void saluer(int repetition, Personne aSaluer){
        for (int i = 0; i < repetition; i++) {
            saluer(aSaluer);
        }
    }

    public void saluer(Personne aSaluer, int repetition){
        saluer(repetition-1);
        saluer(aSaluer);
    }

    // GET/SET

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
