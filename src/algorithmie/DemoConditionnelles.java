package algorithmie;

import java.util.Scanner;

public class DemoConditionnelles {

    public static void main(String[] args) {


        boolean aTicket;
        int age = 0;
        int choix;
        Scanner sc = new Scanner(System.in);

        System.out.println("Je prend le train");

        System.out.println("Le contrôlleur s'approche et me demande mon ticket.");
        System.out.println("1 - Je l'ai");
        System.out.println("2 - Je ne l'ai pas");

        choix = sc.nextInt();
        if( choix == 1 ){
            aTicket = true;
        }
        else {
            int maVariable = 5;

            aTicket = false;
            System.out.println("Le contrôlleur me demande mon age : ");
            age = sc.nextInt();
        }



        if ( aTicket ) {  // aTicket = true
            System.out.println("Voici votre ticket pointé.");
            System.out.println("Bon voyage!");
        }
        else if( age <= 18 ) { // aTicket = false && age <= 18
            System.out.println("Le transport est gratuit");
        }
        else if( age < 40 ) { // aTicket = false && age > 18 && age < 40
            System.out.println("Vous n'avez pas de ticket, voila votre amende de 15 euros");
            System.out.println(":)");
        }
        else { // aTicket = false && age >= 40
            System.out.println("Vous n'avez pas de ticket, voila votre amende de 500 euros");
            System.out.println(":)");
        }

        System.out.println("J'atteins ma destination");
    }
}
