package algorithmie;

import java.util.Scanner;

public class Exo4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a, b, operateur;
        int rslt = 0;

        System.out.print("Veuillez entrer un premier nombre : ");
        a = sc.nextInt();

        System.out.println("Veuillez entrer l'opérateur à utiliser : ");
        System.out.println("1 - addition");
        System.out.println("2 - soustraction");
        System.out.println("3 - multiplication");
        System.out.println("4 - division");
        System.out.println("5 - modulo");
        operateur = sc.nextInt();

        System.out.print("Veuillez entrer un second nombre : ");
        b = sc.nextInt();

        switch ( operateur ){
            case 1:
                rslt = a + b;
                System.out.println(rslt);
                break;
            case 2:
                rslt = a - b;
                System.out.println(rslt);
                break;
            case 3:
                rslt = a * b;
                System.out.println(rslt);
                break;
            case 4:

                if(b == 0){
                    System.out.println("Division par 0 impossible");
                }
                else{
                    rslt = a / b;
                    System.out.println(rslt);
                }

                break;
            case 5:
                if(b == 0){
                    System.out.println("Modulo par 0 impossible");
                }
                else {
                    rslt = a % b;
                    System.out.println(rslt);
                }
                break;
            default:
                System.out.println("choix de l'opérateur invalide");
        }
    }
}
