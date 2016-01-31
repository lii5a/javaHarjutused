package oop;

import java.util.Arrays;
import java.util.Random;

/**

 */
public class Laev {
    private int[] koordinaadid; //hea tava on, et muutujad on kõik privatid
    private boolean elus = true;

    public Laev (int mereServaPikkus) { //siin võtab Laev mereservapikkuse vastu.
        System.out.println("start laev");
        genereeriKoordinaadid(mereServaPikkus);

    }

    private void genereeriKoordinaadid(int mereServaPikkus) {
        Random rand = new Random(); //lõime random klassi praegu objektiks
        int x = rand.nextInt(mereServaPikkus); //random, ära suuremaks mine kui mere serva pikkus
        int y = rand.nextInt(mereServaPikkus);
        koordinaadid = new int[]{x, y};
       // System.out.println(Arrays.toString(koordinaadid));

    }

    public boolean kasOledElus() {
        return elus;
    }

    public boolean kasSaidPihta(int[] lask) {
       if (Arrays.equals(lask, koordinaadid)&& elus) {
           elus = false;
           return true;
       }
        return false;
    }

    public int[] annaKoordinaadid() {
        return koordinaadid;
    }
}
