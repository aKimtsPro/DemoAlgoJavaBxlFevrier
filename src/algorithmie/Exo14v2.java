package algorithmie;

import java.util.Scanner;

public class Exo14v2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int stock;
        boolean pret;

        do {
            System.out.println("stock?");
            stock = sc.nextInt();
            System.out.println("Pret?");
            pret = sc.nextBoolean();
        } while( stock <= 0 || !pret );

        while( stock > 0 ){
            System.out.println("Lancer (reste : "+ --stock +")");
        }

        System.out.println("plus de balles");
    }

}
