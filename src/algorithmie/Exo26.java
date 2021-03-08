package algorithmie;

public class Exo26 {

    public static void main(String[] args) {

        int[] toSort = {5, 1, 7, 89, -2, 6};


        for (int i = 0; i <= toSort.length-2  ; i++) { // progresser dans le tri (case par case)

            int index_min = i;
            for(int j = i+1; j < toSort.length ; j++) { // trouver l'index de la valeur min
                                                      // entre l'index de la case qui nous
                                                      // interesse et la fin du tableau
                if( toSort[j] < toSort[index_min] ){
                    index_min = j;
                }
            }

            if( i != index_min){ // si la case n'est pas le min on echange le min et la case
                int temp;
                temp = toSort[i];
                toSort[i] = toSort[index_min];
                toSort[index_min] = temp;
            }
        }

        for (int i : toSort) {
            System.out.print(i+" |");
        }
        System.out.println();

    }
}
