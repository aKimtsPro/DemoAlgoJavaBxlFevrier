package algorithmie;

public class Exo1 {

    public static void main(String[] args) {

        int a=5, b=7, temp;

        System.out.println("Valeur de a: "+ a + "\nValeur de b: "+ b);

        temp = b;
        b = a;
        a = temp;

        System.out.println("Valeur de a: "+ a + "\nValeur de b: "+ b);
    }
}
