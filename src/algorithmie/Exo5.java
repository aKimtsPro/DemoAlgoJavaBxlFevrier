package algorithmie;

import java.util.Scanner;

public class Exo5 {

    public static void main(String[] args) {

        int note;
        Scanner sc = new Scanner(System.in);

        System.out.println("Veuillez entrer la note à évaluer : ");
        note = sc.nextInt();

        // hors intervalle -> valeur invalide
        // 0 - 10 -> Insuffisant
        // 11 - 12 -> Satisfaisant
        // 13 - 15 -> Bien
        // 16 - 18 -> Très bien
        // 19 - 20 -> Excellent

        if( note < 0 || note > 20){
            // hors [0;20]
            System.out.println("Valeur invalide");
        }
        else if(note <= 10) {// [0;20]
            // [0;10]
            System.out.println("Insuffisant");
        }
        else if(note <= 12) { //[0; 20] && note > 10 => [11;20]
            // [11;12]
            System.out.println("Satisfaisant");
        }
        else if(note <= 15) { // [0;20] && note > 10 && note > 12  => [13;20]
            // [13;15]
            System.out.println("Bien");
        }
        else if(note <= 18) { // [0;20] && note > 10 && note > 12 && note > 15 => [16;20]
            // [16;18]
            System.out.println("Très Bien");
        }
        else { // [0;20] && note > 10 && note > 12 && note > 15 && note > 18 => [19;20]
            // [19;20]
            System.out.println("Excellent");
        }
    }
}
