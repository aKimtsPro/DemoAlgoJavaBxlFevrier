package poo.classes.exo.playlist;

public class Exo1 {

    public static void main(String[] args) {

        Groupe group1 = new Groupe("death grips", "alternative");
        Groupe group2 = new Groupe("cabadzi", "chanson francaise");
        Groupe group3 = new Groupe("idles", "rock");

        Musique song1 = new Musique("beware", "exmilitary", 349, group1);
        Musique song2 = new Musique("no love", "no love deep web", 340, group1);
        Musique song3 = new Musique("100 fois", "Des angles et des épines", 230, group2);
        Musique song4 = new Musique("polaroid","cabadzi x blier",  233, group2);
        Musique song5 = new Musique("colossus", "joy as an act of resistance", 344, group3);
        Musique song6 = new Musique("samaritans", "joy as an act of resistance", 216, group3);

//        song1.ecouter();
//        song2.ecouter();
//        song3.ecouter();
//        song4.ecouter();
//        song5.ecouter();
//        song6.ecouter();

        // ajout song1
        Playlist playlist = new Playlist(5);

        playlist.ajouter(song1);
        playlist.ajouter(song2);
        playlist.ajouter(song3);

        playlist.play();


    }
}
