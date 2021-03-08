package algorithmie;

import java.util.Scanner;

public class DemoConditionnelles2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Quel est votre age?");
        int age = scanner.nextInt();

        switch ( age ) {
            case 0:
                System.out.println("Tu viens de naitre");
                break;
            case 11:
                System.out.println("Tu es précoce");
            case 13:
            case 12:
                System.out.println("Tu viens d'entrer dans l'adolescence");
                break;
            case 18:
                System.out.println("Tu es désormais un adulte");
                break;
            default: // optionel
                System.out.println("Rien de particulier");
        }


    }

}
