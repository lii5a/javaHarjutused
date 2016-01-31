package oop;

import java.util.Arrays;

/**
 * Created by lii5a on 28/12/15.
 */
public class Meri {
    private int mereServaPikkus;
    private Laev[] laevastik = new Laev[2];

    public Meri(int pikkus) { //see on konstruktor. kui kutsun mere välja, siis konstruktor on see, mis kohe käivitub. klass ei oska võtta vastu parameetreid, aga konstruktor oskab.
        //esimese asjana tuleks salvestada ära see pikkus, mis kaasa tuli. klassi külge.
        //konstruktor on nagu objekt Meri main meetod. Klass ei oska parameetreid vastu võtta. Konstruktor oskab.
        System.out.println("Start meri");
        mereServaPikkus = pikkus;
        looLaevastik();
    }

    private void looLaevastik() {
        for (int i = 0; i < laevastik.length; i++) {
            laevastik[i] = new Laev(mereServaPikkus);
        }
        Laev laev = new Laev(mereServaPikkus); //siin läks alguses punaseks, sest klass Laev
        //ise ei oska mereservapikkust vastu võtta.
    }

    public boolean kasOnLaevuPinnal() { //kuna meetod on while sees, sai aru, et boolean. äge.
        for (Laev laev : laevastik) { //for each tsükkel. võtab laevastiku massiivi ja käiab ükshaaval need läbi.
            boolean elus = laev.kasOledElus();
            if (elus) {
                return true; //kui leiad vähemalt ühe laeva, mis elus, siis pane edasi
            }
        }
        return false;
    }

    public boolean kasKeegiSaiPihta(int[] lask) {
        for (Laev laev : laevastik) {
            boolean pihtas = laev.kasSaidPihta(lask);
            if (pihtas) {
                return true;
            }
        }
        return false;
    }

    public void kuvaSeis() {
        int[][] laud = new int[mereServaPikkus][mereServaPikkus]; //tekib tühi lauamaatriks, st koosneb nullidest
        for (Laev laev : laevastik) {
            int [] koordinaadid = laev.annaKoordinaadid();
            boolean elus = laev.kasOledElus();
            int x = koordinaadid[0];
            int y = koordinaadid[1];
            if (elus) {
                laud[x][y] = 1;
            } else {
                laud[x][y] = 2; //teine praks minut 33 seletas seda ühte sseal.
            }//siis veel 36 minutil seda, et peaks x ja y ära vahetama, sest
            //järgnev fori eeldab, et sisemine massiiv on rida. aga on tulp.
        }
        for (int i = 0; i < laud.length ; i++) {
            System.out.println(Arrays.toString(laud[i]));

        }
    }
}


//42 minutil jäi pooleli.