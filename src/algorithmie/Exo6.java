package algorithmie;

import java.util.Scanner;

public class Exo6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean estPret;
        int stockBalle;

        System.out.println("Combien y a-t-il de balle dans le lanceur?");
        stockBalle = sc.nextInt();

        System.out.println("Etes-vous prêt?");
        estPret = sc.nextBoolean();

        if(estPret && stockBalle > 0){ // 1
            System.out.println("Une balle est lancée");
            stockBalle--;
        }
        else if(stockBalle <= 0){ // 2
            System.out.println("Il n'y pas assez de balle");
        }
        else { // 3
            System.out.println("non pret");
        }

        // estPret | stockBalle > 0 -> 1
        // estPret | stockBalle <= 0 -> 2
        // !estPret | stockBalle > 0 -> 3
        // !estPret | stockBalle <= 0 -> 2
    }
}
