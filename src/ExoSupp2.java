import java.util.Scanner;

public class ExoSupp2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int nbr, min=0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Entrez un nombre : ");
            nbr = sc.nextInt();

            if( i == 0 || nbr < min ){
                min = nbr;
            }
            System.out.println("La valeur minimum jusqu'à présent est : " + min);
        }

        System.out.println("La valeur minimum est : " + min);
    }

}
