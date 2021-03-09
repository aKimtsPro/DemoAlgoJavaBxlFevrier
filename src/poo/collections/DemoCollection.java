package poo.collections;

import poo.classes.exo.playlist.Groupe;
import poo.classes.exo.playlist.Musique;
import java.util.ArrayList;

public class DemoCollection {

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



        ArrayList<Musique> playlist = new ArrayList<>();


        playlist.add(song1);//
        playlist.add(1, song2);
        playlist.add(song3);
        playlist.add(song4);
        playlist.add(song5);
        playlist.add(song6);

        System.out.println( playlist.size() );

        playlist.get(3).ecouter();

        playlist.remove(1);
        playlist.remove(song1);

        // 0 | 1 | 3 | 4 |

        playlist.isEmpty();
        playlist.indexOf(song5);
        playlist.contains(song6);


        for (Musique musique : playlist) {
            musique.ecouter();
        }

    }
}
