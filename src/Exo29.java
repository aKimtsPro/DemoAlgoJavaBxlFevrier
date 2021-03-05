import java.util.Scanner;

public class Exo29 {

    public static void main(String[] args) {

        char[] plateau = { '*', '_', '_', '_', '_', '_', '_', '_', '_', '_' };
        int indexPion = 0;
        String choix;

        do {

            // afficher le tableau
            afficherTableau( plateau );

            // récupérer le choix de l'utilisateur
            choix = recupChoix();

            switch ( choix ){
                case "g":

                    if( indexPion == 0 ) {
                        // deplacer tout droite
                        deplacerPion(plateau, 0, plateau.length-1);
                        indexPion = plateau.length-1;
                    }
                    else {
                        // deplacer d'un index vers gauche
                        deplacerPion(plateau, indexPion, indexPion-1);
                        indexPion--;
                    }

                    break;
                case "d":

                    if( indexPion == plateau.length-1){
                        // deplace tout à gauche
                        deplacerPion(plateau, indexPion, 0);
                        indexPion = 0;
                    }
                    else {
                        // deplace d'un index vers la droite
                        deplacerPion(plateau, indexPion, indexPion+1);
                        indexPion++;
                    }

                    break;
                case "q":
                    System.out.println("Au revoir");
                    break;
                default:
                    System.out.println("Commande invalide");
            }

        } while (!choix.equals("q"));

    }

    public static void afficherTableau( char[] toDisplay ){
        System.out.print("[ ");
        for (char i : toDisplay) {
            System.out.print(i + " ");
        }
        System.out.println("]");
    }

    public static String recupChoix(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Quel est votre choix ?");
        return sc.nextLine();
    }

    public static void deplacerPion( char[] tab, int indexInit, int indexFinal ){
        char temp = tab[indexInit];
        tab[indexInit] = tab[indexFinal];
        tab[indexFinal] = temp;
    }
}
