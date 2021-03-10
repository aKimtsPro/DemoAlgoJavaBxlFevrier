package poo.exo;

public class Main {

    public static void main(String[] args) {

        Client c1 = new Client("pol", "dubois", "pol@dubois");
        Article a = new Article("bim", "boom", 0);

        c1.recharger(-50);

        c1.acheter(a, 100);

    }

}
