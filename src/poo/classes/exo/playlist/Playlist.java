package poo.classes.exo.playlist;

public class Playlist {

    int taille;
    Musique[] musiques;

    public Playlist(int taille) {
        this.taille = taille;
        musiques = new Musique[taille];
    }

    void ajouter(Musique musique){
        boolean inserted = false;
        // Je m'arrete quand soit j'ai inseré ma musique, soit je sors du tableau
        for (int i = 0; i < taille && !inserted ; i++) {
            if( musiques[i] == null ){
                musiques[i] = musique;
                inserted = true;
            }
        }


        // Sinon
        //  -> virer la première musique
        //  -> decaler les musique du tableau
        //  -> mettre la nouvelle musique dans la dernière case

        if( !inserted ){

            musiques[0] = null;
            // [null][1][2][3][4]
            for (int i = 1; i < taille; i++) {
                musiques[i-1] = musiques[i];
            }
            // [1][2][3][4][4]
            musiques[musiques.length-1] = musique;
            // [1][2][3][4][new musique]

        }
    }

    void play(){
        // faire des trucs
        for (int i = 0; i < taille && musiques[i] != null ; i++) {
            musiques[i].ecouter();
        }
    }
}
