package algorithmie;

public class DemoFonction {

    public static void main(String[] args) {

        int[] tableau = { 1, 2, 3 };

        incTableau(tableau);

        for (int i : tableau) {
            System.out.println(i);
        }

    }

    public static void increment(int aIncrementer){
        aIncrementer++;
        System.out.println(aIncrementer);
    }

    public static void incTableau( int[] aIncrementer ){
        for (int i = 0; i < aIncrementer.length ; i++) {
            aIncrementer[i]++;
        }
    }
}
