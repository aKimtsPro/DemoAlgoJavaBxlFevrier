package algorithmie;

public class DemoTableau {

    public static void main(String[] args) {

        int nbrEtudiant = 5;

        int[] noteEtudiant = new int[nbrEtudiant]; // [0,4]
        noteEtudiant[0] = 22;
        noteEtudiant[1] = 20;
        noteEtudiant[2] = 10;
        noteEtudiant[3] = 20;
        noteEtudiant[4] = 10;

        int[] tailleEtudiant = { 165, 192, 174, 180, 158 };

        System.out.println(tailleEtudiant == noteEtudiant); //

        String[][] tab2Dim = new String[2][];
        tab2Dim[0] = new String[2];
        tab2Dim[1] = new String[3];

        tab2Dim[1][2] = "salut";
    }

}
