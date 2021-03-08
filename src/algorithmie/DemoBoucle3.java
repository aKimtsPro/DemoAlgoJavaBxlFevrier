package algorithmie;

public class DemoBoucle3 {

    public static void main(String[] args) {

        // For
        int nombre = 5;

        for (int i = 0; i < nombre ; i++) { // 0 1 2 3 4
            System.out.println("salut " + i);
        }

        int compteur = 0;
        while( compteur < nombre ){
            System.out.println("salut "+ compteur);

            compteur++;
        }


    }
}
