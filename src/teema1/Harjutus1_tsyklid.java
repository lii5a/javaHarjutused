package teema1;

/**
 * Kasutades tsükleid, lahendada järgmised ülesanded:
 * 1. Trükkida ekraanile numbrid 10 kuni 1
 * 2. Trükkida ekraanile paaritud arvud vahemikus 0 kuni 10
 * 3. Trükkida ekraanile selline tabel:
 *    0 1 2 3 4 5 6 7 8 9
 *    1 2 3 4 5 6 7 8 9 0
 *    2 3 4 5 6 7 8 9 0 1
 *    3 4 5 6 7 8 9 0 1 2
 *    4 5 6 7 8 9 0 1 2 3
 *    5 6 7 8 9 0 1 2 3 4
 *    6 7 8 9 0 1 2 3 4 5
 *    7 8 9 0 1 2 3 4 5 6
 *    8 9 0 1 2 3 4 5 6 7
 *    9 0 1 2 3 4 5 6 7 8
 */
public class Harjutus1_tsyklid {
    public static void main(String[] args) {

        for (int k = 10; k > 0; k--) {
            System.out.print(k+" ");

        }
        System.out.println(" "); // ilmselt veidi opakas viis teha kahe ülesande vahele loetavuse nimel tühje ridu
        System.out.println(" ");

        for (int i = 0; i < 11; i++) {
            if (i % 2 ==0) {
                System.out.print(i + " ");
            }
        }
        System.out.println(" "); // ilmselt veidi opakas viis teha kahe ülesande vahele loetavuse nimel tühje ridu
        System.out.println(" ");

        for (int l = 0; l < 9; l++) {
            for (int j = 0; j < 10 ; j++) { //see teeb rida
                if (j+l<10){
                System.out.printf("%3d", l + j);
                    }
               // else {
                    //System.out.println(l);}
            }
           System.out.println();

        }

    }
}
