package algorithmie;

import java.util.Scanner;

public class DemoBoucle {

    public static void main(String[] args) {

        // While

        Scanner sc = new Scanner(System.in);
        int nombre = -1;

        System.out.println("debut de boucle");

        // je m'arrete quand nombre >= 0 && nombre <= 5
        // je continue quand nombre < 0 || nombre > 5
        while ( nombre < 0 || nombre > 5 ){
            System.out.println("Veuillez entrer un nombre entre 0 et 5 :");
            nombre = sc.nextInt();
        }

        System.out.println("mon nombre est : " + nombre);



    }
}
