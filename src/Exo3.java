import java.util.Scanner;

public class Exo3 {

    public static void main(String[] args) {

        int secs, mins, hours, days;
        Scanner sc = new Scanner(System.in);

        System.out.print("Veuillez entrer le nombre de secondes à convertir : ");
        secs = sc.nextInt();

        mins = secs / 60; // converti en minute
        secs %= 60; // recupère les secondes restantes

        hours = mins / 60; // converti en heures
        mins %= 60; // récupère les minutes restantes

        days = hours / 24; // converti en jours
        hours %= 24; // récupère les heures restantes

        System.out.println( days+" Jours "+ hours +" Heures "+mins+" Minutes "+secs+" Secondes.");



    }
}
