package teema1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 1. Salvesta kasutajalt 10 numbrit ja sorteeri suuruse järgi. (int[])
 * 2. Salvesta kasutajalt 10 sõne ja sorteeri tähestikulises järjekorras. (String[])
 * 3. Salvesta kasutajalt x arv numbreid, lõpeta küsimine kui number on 0
 *    ja sorteeri tulemus suuruse järgi. (ArrayList)
 *
 */
public class Harjutus4_massiivid {

    public static void main(String[] args) {

       // kymmeSone();
        //kymmeNumbrit();
        xNumbrit();

    }

    public static void kymmeNumbrit() {

        //kysi kasutajalt 10 numbrit

        Scanner sisestus = new Scanner(System.in);
        //int arv = sisestus.nextInt();
        int[] numbrid = new int[10]; //vahi hullu. siin on array liikmete arv. kui on 10 tk, siis 10, aga loendamine algab ikka nullist.
        System.out.println(Arrays.toString(numbrid));
        System.out.println("sisesta 10 numbrit");

        numbrid[0] = sisestus.nextInt();
        numbrid[1] = sisestus.nextInt();
        numbrid[2] = sisestus.nextInt();
        numbrid[3] = sisestus.nextInt();
        numbrid[4] = sisestus.nextInt();
        numbrid[5] = sisestus.nextInt();
        numbrid[6] = sisestus.nextInt();
        numbrid[7] = sisestus.nextInt();
        numbrid[8] = sisestus.nextInt();
        numbrid[9] = sisestus.nextInt();

        Arrays.sort(numbrid);

        System.out.println(Arrays.toString(numbrid));
    }

            //kysi kasutajalt 10 sõne

    public static void kymmeSone() {

        Scanner sonasisestus = new Scanner(System.in);
        String[] sonad = new String[10]; //vahi hullu. siin on array liikmete arv. kui on 10 tk, siis 10, aga loendamine algab ikka nullist.
        System.out.println(Arrays.toString(sonad));
        System.out.println("sisesta 10 sona");

        sonad[0] = sonasisestus.nextLine();
        sonad[1] = sonasisestus.nextLine();
        sonad[2] = sonasisestus.nextLine();
        sonad[3] = sonasisestus.nextLine();
        sonad[4] = sonasisestus.nextLine();
        sonad[5] = sonasisestus.nextLine();
        sonad[6] = sonasisestus.nextLine();
        sonad[7] = sonasisestus.nextLine();
        sonad[8] = sonasisestus.nextLine();
        sonad[9] = sonasisestus.nextLine();

        Arrays.sort(sonad);

        System.out.println(Arrays.toString(sonad));
    }

    public static void xNumbrit() {
        Scanner sisestus = new Scanner(System.in);

        System.out.println("sisesta numbreid");

        int x = 0;

        int[] numbrid = {x}; ;//tahaks öelda, et mul on massiiv, kus on suva arv numbreid numbrid.length

            numbrid[0] = sisestus.nextInt();

        if (sisestus.nextInt()==0){
        }


    }

}

