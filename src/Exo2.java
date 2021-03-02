import java.util.Scanner;

public class Exo2 {

    public static void main(String[] args) {

        // 1. Demande à l'utilisateur 2 nombres
        // 2. Affiche le resultat de leur addition
        // 3. Affiche le resultat de leur division entiere
        // 4. Affiche le resultat de leur division
        // 5. Affiche le resultat de leur modulo

        int a, b;
        Scanner sc = new Scanner(System.in);

        System.out.println("Veuillez entrer 2 nombres : ");
        a = sc.nextInt();
        b = sc.nextInt();

        System.out.println("addition : " + (a+b));
        System.out.println("division entiere : " + a/b);
        System.out.println("division : " + (double)a/b);
        System.out.println("modulo : " + a%b);
    }
}
