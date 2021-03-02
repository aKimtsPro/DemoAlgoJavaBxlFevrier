public class DemoVariable {

    // Public Static Void Main -> PSVM
    /*

     Public
     Static
     Void
     Main

     */
    public static void main(String[] args) {

        // Ecrire dans la console :
        // raccourci: sout
        System.out.println("Hello world!");
        System.out.println("deuxième message");

        // Les types primitifs

        // - les entiers

        // byte  - 1octet  - 256 valeurs possibles
        // short - 2octets - 65536 valeurs possibles
        // int   - 4octets - 4.294.967.296 valeurs possibles
        // long  - 8octets - 18.446.744.073.709.551.616 valeurs possibles

        // - les réels

        // float - 4octets - moins précis
        // double - 8octets - plus précis

        // - les booléens - true/false

        // boolean - 1bit

        // - Les caractères

        // char - 2octets

        // Les type Objects

        // String - ?octet - chaine de caractère -> des phrases, des mots, ...


        // variables

        byte tresPetitEntier = 127; // [-128;127]
        short petitEntier = 32_767; // [-32768; 32767]
        int entier = 2_147_483_647; // [-2.147.483.648; 2.147.483.647]
        long grandEntier = 40_000_000_000L;

        float reelPeuPrecis = 0.000000000056668945532F;
        double reelPrecis = 0.000000000056668945532;

        boolean bool = true;

        char caractere = 'c'; // 00000000 00000000 - 99

        String chaine = "ma chaine de caractère";

        // astuce de déclaration de variable

        int a=3;
        int b;
        int c=10;
        short d;
        short e;

        int _a=3, _b, _c=10;
        short _d, _e;


        // Trans-typage

        int nombre = (int)grandEntier; // trans-typage explicite
        nombre = petitEntier; // trans-typage implicite

        float nombreAVirgule = nombre; // 4 -> 4.0
        nombre = (int)nombreAVirgule; // 81.23 -> 81

        // double -> float

        double nombreAVirgulePrecis = 0.2;
        nombreAVirgule = (float)nombreAVirgulePrecis;

        // Si potentiel de perte d'information -> explicite

        // Les conventions d'écriture:

        // ° lowerCamelCase -> tout collé et Maj pour chaque mot après le 1e
        // ° UpperCamelCase -> tout collé et Maj pour chaque mot
        // ° lower_snake_case -> tout en min et chaque mot séparé d'un _
        // ° UPPER_SNAKE_CASE -> tout en MAJ et chaque mot séparé d'un _

        // variable -> lowerCamelCase ou lower_snake_case
        // methode/fonction -> lowerCamelCase
        // classe, enum, interface -> UpperCamelCase
        // constante -> UPPER_SNAKE_CASE


        // Les constantes

        final double TVA_BE = 0.22;

    }

}
