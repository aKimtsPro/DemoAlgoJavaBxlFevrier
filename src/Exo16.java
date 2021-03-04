import java.util.Scanner;

public class Exo16 {

    public static void main(String[] args) {

        // a la base j'ai 1 nombre

        // de facon répétée : ( -> proposition == nombre)
        //      -> demander une proposition
        //      -> lui donner un indice (plus ou moins) si ce n'est pas egal au nombre
        // Lui indiquer qu'il a gagné

        // but: faire decouvrir à l'utilisateur le nombre après qqs essais en lui donnat des indices


        int reponse = 59, proposition;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Votre proposition (entre 0 et 100) : ");
            proposition = sc.nextInt();

            if(reponse > proposition){
                System.out.println("C'est plus");
            }
            else if(reponse < proposition){
                System.out.println("C'est moins");
            }

        } while( proposition != reponse );

        System.out.println("C'est gagné");
    }
}
