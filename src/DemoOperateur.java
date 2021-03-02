public class DemoOperateur {

    public static void main(String[] args) {


        // Les opérateurs arithmétiques :

        int a = 5, b = 7;
        float rslt = 0;

        // addition - attention, si on utilise le + et que l'un des
        //          - deux termes est un String -> concaténation
        rslt = a + b;
        System.out.println(rslt); // 12.0

        // soustraction
        rslt = a - b;
        System.out.println(rslt); // -2.0

        // multiplication
        rslt = a * b;
        System.out.println(rslt); // 35.0

        // division entiere - les 2 termes sont des valeurs entières
        rslt = a / b; // a = 0 * b + 5
        System.out.println(rslt); // 0.71428573

        // division classique
        rslt = (float)a / b;
        System.out.println(rslt);

        // modulo - le reste de la division entiere
        rslt = a % b;
        System.out.println(rslt);

        System.out.println( (rslt - a) * b );
        // 0
        // -30



        // Affectations arithmétiques
        a = a + b;
        a += b;

        a = a - b;
        a -= b;

        a = a / b;
        a /= b;

        a = a * b;
        a *= b;

        a = a % b;
        a %= b;

        // incrémentation et décrémentation

        a = a + 1;
        a += 1;
        a++; // post-inc
        ++a; // pre-inc

        a = a - 1;
        a -= 1;
        a--; // post-dec
        --a; // pre-dec

        int variable = 5;

        System.out.println(variable++); // 5
        System.out.println(++variable); // 7
        System.out.println(variable--); // 7
        System.out.println(--variable); // 5

        System.out.println(variable);   // 5



        // Les opérateurs de comparaison.

        System.out.println( a == b ); // false
        System.out.println( a != b ); // true

        System.out.println( a < b ); // true
        System.out.println( a <= b ); // true
        System.out.println( a > b ); // false
        System.out.println( a >= b ); // false


        // Les opérateurs logiques.

        // AND - et - &&
        System.out.println( true && true );   // TRUE
        System.out.println( true && false );  // false
        System.out.println( false && true );  // false
        System.out.println( false && false ); // false

        // OR - ou - ||

        System.out.println( true || true );   // true
        System.out.println( true || false );  // true
        System.out.println( false || true );  // true
        System.out.println( false || false ); // FALSE

        // NOT - non - !

        System.out.println( !true ); // false
        System.out.println( !false ); // true


        // Loi de De Morgan

        boolean estBleu = true;
        boolean estRaye = true;

        System.out.println( !(estBleu && estRaye) );
        System.out.println( !estBleu || !estRaye );

        System.out.println( !(estBleu || estRaye) );
        System.out.println( !estBleu && !estRaye );

    }
}
