public class Exo23 {

    public static void main(String[] args) {

        int power = 1;
        int[] tab = new int[10]; // index -> [0;9]

        for (int i = 0; i < 10; i++) { // i -> [0;9]
            power *= 2;
            tab[i] = power;
        }

        for(int puissance : tab){
            System.out.println( puissance );
        }
    }

}
