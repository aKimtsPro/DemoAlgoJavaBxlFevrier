import java.util.Scanner;

public class DemoBoucle2 {
    public static void main(String[] args) {

        // Do ... While

        Scanner sc = new Scanner(System.in);
        int nombre;

        System.out.println("debut de boucle");

        do {
            System.out.println("Veuillez entrer un nombre entre 0 et 5 :");
            nombre = sc.nextInt();
        } while ( nombre < 0 || nombre > 5 );

        System.out.println("votre nombre est : " + nombre );
    }
}
