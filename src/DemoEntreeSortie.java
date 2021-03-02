import java.util.Scanner;

public class DemoEntreeSortie {

    public static void main(String[] args) {

        // Ecrire dans la console - sortie

        System.out.println("Hello world!");

        String nom = "luc";
        int age = 67;

        // je suis | luc | et j'ai | 67 | ans.
        System.out.println("Je suis "+ nom +" et j'ai "+ age +" ans.");

        // Lire ce que l'utilisateur ecrit dans la console - entree
        Scanner scanner = new Scanner(System.in);

        System.out.println("Veuillez entrer votre nom : ");
        nom = scanner.nextLine();

        System.out.println("Veuillez entrer votre age : ");
        age = scanner.nextInt();

        System.out.println("Je suis "+ nom +" et j'ai "+ age +" ans.");
    }
}
