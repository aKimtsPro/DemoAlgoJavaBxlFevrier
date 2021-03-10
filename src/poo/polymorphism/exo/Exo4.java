package poo.polymorphism.exo;

public class Exo4 {

    public static void main(String[] args) {

        Personne pol = new Personne("pol");
        Personne jeanine = new Personne("Jeanine");

        System.out.println("----------------");
        pol.saluer();
        System.out.println("----------------");
        pol.saluer(jeanine);
        System.out.println("----------------");
        pol.saluer(3);
        System.out.println("----------------");
        pol.saluer(3, jeanine);
        System.out.println("----------------");
        pol.saluer(jeanine, 3);
    }
}
