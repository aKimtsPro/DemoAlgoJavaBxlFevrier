package poo.classes.exo.compet;

import java.util.ArrayList;

public class Competition {

    boolean isFinished = false;
    ArrayList<Sportif> participants = new ArrayList<>();
    Podium podium = null;

    void inscrire(Sportif sportif){

        if( isFinished ) {
            System.out.println("Impossible d'ajouter des participants à une compétition terminée");
        }
        else if ( participants.contains(sportif) ){
            System.out.println("Le sportif est deja inscrit");
        }
        else {
            participants.add(sportif);
            System.out.println("Le sportif est inscrit");
        }

    }

    void annuler(Sportif sportif){

        if( isFinished ) {
            System.out.println("Impossible d'annuler des participations à une compétition terminée");
        }
        else if ( participants.contains(sportif) ){
            participants.remove(sportif);
            System.out.println("Un sportif a annulé sa participation");
        }
        else {
            System.out.println("Impossible d'annuler une participation inexistante");
        }
    }

    void lancer(){

        if ( isFinished ) {
            System.out.println("Impossible de lancer une compétition déjà terminée");
        }
        else if ( participants.size() < 3 ){
            System.out.println("Impossible de lance la compétition (trop peu de participants)");
        }
        else {
            podium = new Podium(
                    participants.get(0),
                    participants.get(1),
                    participants.get(2)
            );
            System.out.println("La compétition est terminé");
            isFinished = true;
        }

    }


}
