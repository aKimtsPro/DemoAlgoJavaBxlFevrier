package poo.classes.exo.playlist;

public class Musique {

    String titre;
    String album;
    int duree;
    Groupe auteur;

    public Musique(String titre, String album, int duree, Groupe auteur) {
        this.titre = titre;
        this.album = album;
        this.duree = duree;
        this.auteur = auteur;
    }

    public void ecouter(){
        System.out.println( titre +" - "+ album +" - "+ auteur.nom +
                " ( " + (duree/60) + ":" + (duree%60) +" ) a commencé à être jouée.");
    }
}
