package algorithmie;

public class Exo15 {
    public static void main(String[] args) {

        for (int i = 1; i < 10 ; i++) {
            // afficher la table de multiplication de i
            System.out.println("--------------------------------");
            System.out.println("- table de multiplication de "+i+" -");
            System.out.println("--------------------------------");

            for (int j = 1; j < 11; j++) {
                System.out.println(i + " * " + j +" = " + (i*j));
            }
        }

    }
}
