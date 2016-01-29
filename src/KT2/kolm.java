package KT2;

import com.sun.tools.javac.util.ArrayUtils;
import java.util.ArrayList;
import java.util.Collections;

/**
 *    Sportlase punktisumma arvutatakse üksikkatsetest saadud punktide summana, millest
 *    on maha võetud kahe halvima katse tulemused (üksikkatseid on rohkem kui kaks).
 Kirjutada Java meetod, mis arvutab punktisumma üksikkatsete tulemuste massiivi põhjal.
 Parameetriks olevat massiivi muuta ei tohi.

 Sportsmans score is calculated as sum of points from different attempts and two worst attempts are not counted (there are more than two attempts).
 Write a Java method to calculate the score if an array of points from all attempts is given.
 Do not change the array given as parameter.
 */

//veel kasulikke meetodeid:
// minuList.clear() teeb kogu massiivi tühjaks.
    //.trimtosize() teeb massiivi nii suureks kui mitu elementi temas on, siis pole problemps, et alguses oli defineeritud viiena (Kuigi mul ei adianud see)

public class kolm {


    public static void main (String[] args) {
        System.out.println ("skoor on "+score(new int[]{4, 1, 2, 3, 0}));

    }

    public static int score (int[] points) {

        ArrayList<Integer> minuList = new ArrayList<Integer>(10);
        //alguses oli siin points.length


        for (int i = 0; i < points.length; i++) {
            minuList.add(points[i]);    // esiteks lisan kõik  pointsi väärtused minulisti.

        }

      /*  for (int x: minuList){
            System.out.print(x + " "); //prindin minulisti välja
        }*/


        for (int i = 0; i < 2; i++) { //esimesel korral on üks ja siis on kaks.

            //System.out.println("miinimum asub indeksil number " +minuList.indexOf(Collections.min(minuList)));

            minuList.remove(Collections.min(minuList));


        }

        //minuList.trimToSize();

     /* for (int x: minuList) {
          System.out.print(x + " "); //prindin minulisti uuesti välja pärast trimmimist
      }*/




        int skoor = 0;
        for (int i = 0; i < minuList.size() ; i++) {
            skoor = skoor+minuList.get(i);

        }

                //(int x: minuList) { //viimaks liidan kõik väärtused nuditud minuListis kokku. miskipärast enhanced for loop ei tööta.
            //skoor = skoor+minuList.get(x);

        return skoor;


    }




}

