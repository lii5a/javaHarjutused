package KT2;

import com.sun.tools.javac.util.ArrayUtils;
import java.util.ArrayList;

/**
 *    Sportlase punktisumma arvutatakse üksikkatsetest saadud punktide summana, millest
 *    on maha võetud kahe halvima katse tulemused (üksikkatseid on rohkem kui kaks).
 Kirjutada Java meetod, mis arvutab punktisumma üksikkatsete tulemuste massiivi põhjal.
 Parameetriks olevat massiivi muuta ei tohi.

 Sportsmans score is calculated as sum of points from different attempts and two worst attempts are not counted (there are more than two attempts).
 Write a Java method to calculate the score if an array of points from all attempts is given.
 Do not change the array given as parameter.
 */
public class kolm {


    public static void main (String[] args) {
        System.out.println (score(new int[]{4, 1, 2, 3, 0}));
    }

    public static int score (int[] points) {

        ArrayList<Integer> minuList = new ArrayList<Integer>(points.length);


        for (int i = 0; i < points.length; i++) {
            minuList.add(points[i]);    // esiteks lisan kõik  pointsi väärtused minulisti.

        }


        for (int i = 0; i < 3; i++) { //esimesel korral on üks ja siis on kaks.

            int min = minuList.get(0);

            for (int x : minuList) { //leian väikseima väärtuse ja kakun selle ära minulistist. kaks korda (vt ülemine tsükkel)
                if (x<min){
                    minuList.remove(x);
                    i = i+1; //counter välise tsükli jaoks, et kaks korda väärtust eemaldataks.
                }
            }

        }

        int skoor = 0;
        for (int x: minuList) { //viimaks liidan kõik väärtused nuditud minuListis kokku
            skoor = skoor+minuList.get(x);

        }
        return skoor;


    }




}
