import java.util.Scanner;

public class Exo14 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean estPret;
        String choix;
        int stockBalle;

        System.out.println("Combien y a-t-il de balle dans le lanceur?");
        stockBalle = sc.nextInt();
        sc.nextLine(); // pour recommencer à une nouvelle ligne

        System.out.println("Etes-vous prêt?");
        choix = sc.nextLine();
        estPret = choix.trim().equals("oui"); // trim pour virer les espaces
        // equals pour verifier l'egalite des valeurs et non des adresses

        while( stockBalle > 0 && estPret ) {
            System.out.println("Une balle est lancée. ( balles restantes : " + --stockBalle + ")");

            if( stockBalle > 0){
                System.out.println("Continuer?");
                estPret = sc.nextBoolean();
            }
        }


    }
}
