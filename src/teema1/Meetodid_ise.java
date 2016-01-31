package teema1;

import java.util.Scanner;

/**
 * Created by lii5a on 09/11/15.
 */

public class Meetodid_ise {

    public static void main(String[] args) {
        tostaKuupi(2); //siin alles annan arvule väärtuse
        minnmaks("ytle yks arv", 5, 8);

    }

    public static void tostaKuupi(double arv) { //arv on siin double ja rohkem midagi deffima meetodi sees enam ei pea.

        arv=Math.pow(arv,3);
        System.out.println(arv);

       // System.out.println("ytle yks arv");
        //Scanner ytle = new Scanner(System.in);

    }
    public static void minnmaks (String kysimus, int min, int max) {
        System.out.println(kysimus);
        Scanner kasutaja = new Scanner(System.in);
        int pakkumine = kasutaja.nextInt();

        if (pakkumine<max && pakkumine>min){
            System.out.println(pakkumine); //Kristerile oli return sisestus;
        }

        while (pakkumine>max || pakkumine<min) {
            System.out.println("panid mööda, paku veel");
            int uus = kasutaja.nextInt();

            if (uus < max && uus > min) {
                System.out.println(uus);
                break;
            }

            /*+    Kristeril oli nii. Votsiis, meetodit saab iseenda sees ka välja kutsuda, aha!

                if (sisestus < max && sisestus > min) {
                        return sisestus;
                        } else {
                +            System.out.println("Vale vastus, proovi uuesti.");
                +            return kasutajaSisestus(kysimus, min, max);*/

        }

    }
}