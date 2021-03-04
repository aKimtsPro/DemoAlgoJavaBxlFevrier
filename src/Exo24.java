import java.util.Scanner;

public class Exo24 {

    public static void main(String[] args) {

        // 1

        Scanner sc = new Scanner(System.in);
        int nbrJoueur;

        System.out.println("Combien de joueurs?");
        do {
            nbrJoueur = sc.nextInt();
            if(nbrJoueur < 1 || nbrJoueur > 10){
                System.out.println("Réessayez :");
            }
        } while( nbrJoueur < 1 || nbrJoueur > 10 );

        int[] scores = new int[nbrJoueur];

        // 2

        System.out.println("Veuillez donner les scores pour les " +nbrJoueur+ "joueurs : ");
        for (int i = 0; i < nbrJoueur ; i++) { // [0;nbrJoueur-1]
            scores[i] = sc.nextInt();
        }

        // 3

        int somme = 0;
        for(int s : scores) {
            somme += s;
        }

        System.out.println("La moyenne des scores des joueurs est : "+  ( (float)somme / nbrJoueur ));
    }

}
