package poo.classes.exo.instrument;

public class Musicien {

    private String prenom;
    private int experience;

    public Musicien(String prenom, int experience) {
        this.setPrenom(prenom);
        this.setExperience(experience);
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        if ( prenom.charAt(0) >= 'A' && prenom.charAt(0) <= 'Z' ){
            this.prenom = prenom;
        }
    }

    public int getExperience() {
        return experience;
    }

    private void setExperience(int experience) {
        if ( experience >= 0 ){
            this.experience = experience;
        }
    }

    public void jouer(Instrument instru){

        // simuler le jeu
        System.out.println(this.prenom + " commence à jouer d'un instrument ("+ instru.getMarque()+" / "+ instru.getModele()+")");

        // si ce musicien est propriétaire de l'instrument => incrementer l'exp
        if ( this == instru.getProprietaire() ){
            System.out.println("experience incrémentée");
            experience++;
        }
    }
}
